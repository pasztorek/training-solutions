package covid;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
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
        System.out.println(cdao.getCity(zip));

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
        System.out.println(cdao.getCity(zip));
        System.out.println("Menteni kívánt file neve:");
        String fileName = scanner.nextLine();
        fileWriter(cdao.getListbyZip(zip),fileName);
    }

    public void fileWriter(List<String> vaccinationPlan, String fileName){

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(fileName))) {
            try {
                for (String plan : vaccinationPlan) {
                    writer.write(plan);
                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public void vaccinacion(){

    }

    public void vaccinationFail(){

    }

}
