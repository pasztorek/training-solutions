package covid;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CovidMain {

    public static void main(String[] args) {

        CovidMain cvdm = new CovidMain();

        System.out.println("1. Regisztráció");
        System.out.println("2. Tömeges regisztráció");
        System.out.println("3. Generálás");
        System.out.println("4. Oltás");
        System.out.println("5. Oltás meghiúsulás");

        Scanner scanner = new Scanner(System.in);
        int menuId = scanner.nextInt();

        if(menuId==1){
            cvdm.manualRegistration();
        }
        if(menuId==2){
            cvdm.massRegistration();
        }
        if(menuId==3){
            cvdm.generatingFile();
        }

        if(menuId==4){
            cvdm.vaccinations();
        }


    }

    public void manualRegistration() {

        CovidDao cdao = new CovidDao();
        cdao.connectToDataBase();

        System.out.println("REGISZTRÁCIÓ");
        System.out.println("Név:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Irányítószám:");
        Scanner scanner2 = new Scanner(System.in);
        String zip = scanner2.nextLine();
        String city = cdao.getCity(zip);

        if(city.equals("Nincs ilyen város")){
            System.out.println(city);
            manualRegistration();
        }


        System.out.println("Életkor:");
        Scanner scanner3 = new Scanner(System.in);
        int age = scanner3.nextInt();

        System.out.println("E-mail cím:");
        Scanner scanner4 = new Scanner(System.in);
        String email = scanner4.nextLine();

        System.out.println("TAJ szám:");
        Scanner scanner5 = new Scanner(System.in);
        String taj = scanner5.nextLine();

        Citizen ctz = new Citizen(name, zip, age, email, taj);
        cdao.insertCitizen(ctz);

    }

    public void massRegistration(){

        CovidDao cdao = new CovidDao();
        cdao.connectToDataBase();

        try (BufferedReader reader = Files.newBufferedReader(Path.of("citizens2.csv"))) {
            String line;
            while ((line = reader.readLine())  != null) {

                cdao.uploadCitizens(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void generatingFile(){
        CovidDao cdao = new CovidDao();
        cdao.connectToDataBase();

        System.out.println("Kérek egy irányítószámot:");
        Scanner scanner = new Scanner(System.in);
        String zip = scanner.nextLine();

        String city= cdao.getCity(zip);
        if(city.equals("Nincs ilyen város")){
            System.out.println(city);
            generatingFile();
        }

        System.out.println("Menteni kívánt file neve:");
        String fileName = scanner.nextLine();
        fileWriter(cdao.getListbyZip(zip),fileName);
    }

    public void fileWriter(List<String> vaccinationPlan, String fileName){

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(fileName))) {
            try {
                String[]schedule = {"08:00;","8:30;","09:00;","9:30;","10:00;","10:30;","11:00;","11:30;","12:00;","12:30;","13:00;","13:30;","14:00;","14:30;","15:00;","15:30;"};
                writer.write("Időpont;Név;Irányítószám;Életkor;E-mail cím;TAJ szám"+"\n");

                for (int i=0; i<vaccinationPlan.size(); i++) {
                    writer.write(schedule[i]+vaccinationPlan.get(i));
                }

            } catch (IOException ioe) {
                throw new IllegalStateException("Can not write file", ioe);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public void vaccinations(){
        CovidDao cdao = new CovidDao();
        cdao.connectToDataBase();

        System.out.println("TAJ szám:");
        Scanner scanner = new Scanner(System.in);
        String taj = scanner.nextLine();

        Citizen ctz = cdao.getVaccionationsData(taj);
        System.out.println(ctz.getName()+" eddig "+ ctz.getNumOfVaccine()+" oltást kapott.");
        if(ctz.getLastVaccination()!=null && ctz.getNumOfVaccine()!=0){
            if(LocalDate.now().minusDays(15).isBefore(ctz.getLastVaccination())){
                System.out.println("Még nem telt el 15 nap az első oltás óta.");
                vaccinations();
            }
        }


        String VaccineName = "";

        if(ctz.getNumOfVaccine()==0) {
            System.out.println("Melyikkel oltakozzunk? Kérek egy számot:");
            for (VaccineTypes vt : VaccineTypes.values())
                System.out.println("" + vt.getId() + " " + vt);


            Scanner scanner2 = new Scanner(System.in);
            int vt = scanner2.nextInt();


            for (VaccineTypes vt2 : VaccineTypes.values()) {
                if (vt2.getId() == vt) {
                    System.out.println(vt2.toString());
                    VaccineName = vt2.toString();
                }
            }
        }


        System.out.println("Oltakozás dátuma(YYYY-MM-DD):");
        Scanner scanner3 = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.nextLine());
        cdao.injection(ctz.getId(),date, VaccineName, ctz.getNumOfVaccine()+1);

    }

    public void vaccinationFail(){

    }

}
