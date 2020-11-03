package introcontrol;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class IntroControl {

    public int substractTenIfGreaterThanTen(int number) {

        int Number = number;

        if (number > 10) {
            Number = Number - 10;
        }
        return Number;

    }

    public String describeNumber(int number) {

        String szam;

        if (number == 0) {
            szam = "zero";
        }

        else { szam = "not zero";
        }

        return szam;
    }
    public String greetingToJoe(String name){

        String udv;
        if (name.equals("John")){
            udv = "Hello John";
        }
        else{
            udv=null;
        }

        return udv;
    }

    public int calculateBonus(int sale){
        int jutalek;

        if (sale > 1_000_000){
            jutalek = sale/10;
        }
        else{
            jutalek =0;
        }
        return jutalek;
    }

    public int calculateConsumption(int prev, int next){
        int ora=next-prev;

        if (ora > 9999){
            ora = ora-9999;
        }
        return ora;
    }

    public void printNumbers(int max) {

        for (int i=1; i <= max; i++) {
            System.out.println(i);
        }


    }

        public void printNumbersBetween(int min, int max){

        for (int i=min; i<=max; i++){

            System.out.println(i);
        }

        }

    public void printNumbersBetweenAnyDirection(int a, int b){

        if (a<b) {


            for (int i = a; i <= b; i++) {
                System.out.println(i);

            }
        }
        else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);

            }
        }
    }

    public void printOddNumbers(int max) {

        for (int i = 1; i <= max; i++) {

            if (i % 2 != 0) {
                System.out.println(i + "páratlan");

            }
        }
    }
}