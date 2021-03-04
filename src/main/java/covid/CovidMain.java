package covid;

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
            cvdm.manualRegistration(1);
        }


    }


    public void manualRegistration(int munuId){
        System.out.println("REGISZTRÁCIÓ");
        System.out.println("Név:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Irányítószám:");
        String zip = scanner.nextLine();

        System.out.println("Életkor:");

        System.out.println("E-mail cím:");

        System.out.println("TAJ szám:");





    }

    public void massRegistration(int munuId){

    }

    public void generating(int munuId){

    }

    public void vaccinacion(int munuId){

    }

    public void vaccinationFail(int munuId){

    }

}
