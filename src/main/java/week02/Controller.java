package week02;

import java.util.Scanner;

public class Controller {

    private Office iroda = new Office();

    public static void main(String[] args) {

        Controller iranyito = new Controller();
        System.out.println("Hány tárgyalót kíván rögzíteni?");
        Scanner szobakszama = new Scanner(System.in);
        int sz = szobakszama.nextInt();
        for (int i=0; i<sz; i++){
            iranyito.readOffice();
        }
            iranyito.printMenu();
    }

    public void readOffice(){
        //Controller iranyito = new Controller();
        System.out.println("Tárgyaló neve?");
        Scanner szobanev = new Scanner(System.in);
        String nev = szobanev.nextLine();

        System.out.println("Tárgyaló hosszúsága(m) ?");
        Scanner szobahossz = new Scanner(System.in);
        int hossz = szobahossz.nextInt();

        System.out.println("Tárgyaló szélessége(m) ?");
        Scanner szobaszelesseg = new Scanner(System.in);
        int szelesseg = szobaszelesseg.nextInt();

        MeetingRoom szoba = new MeetingRoom(nev, hossz,szelesseg);
        iroda.addMeetingRoom(szoba);



    }

    public void printMenu(){
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
        runMenu();

    }

    public void runMenu(){
        System.out.println("Menü:");
        Scanner menulista = new Scanner(System.in);
        int menu = menulista.nextInt();

        if (menu == 1){
            iroda.printNames();
        }
        else if(menu == 2){
            iroda.printNamesReverse();
        }
        else if(menu == 3){
            iroda.printEventNames();
        }
        else if(menu ==4){
            iroda.printAreas();
        }
        else if(menu == 5) {
            System.out.println("Kersett tárgyaló neve?");
            Scanner szobanev = new Scanner(System.in);
            String nev = szobanev.nextLine();

            iroda.printMeetingRoomsWithName(nev);
        }
        else if(menu == 6){
            System.out.println("Névtöredék");
            Scanner szobanev = new Scanner(System.in);
            String nev = szobanev.nextLine();
            String  kisbetus = nev.toLowerCase();

            iroda.printMeetingRoomsContains(kisbetus);

        }
        else if(menu == 7){
            System.out.println("Tárgyaló területe");
            Scanner terulet = new Scanner(System.in);
            int m2 = terulet.nextInt();
            iroda.printareasLargeThan(m2);
        }

    }
}
