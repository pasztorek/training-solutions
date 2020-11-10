package controlselection.greetings;

public class Greetings {


    public String udvozlet(int h, int s){
        String uzenet;
        if (h>5 && h<9 && s>0){

            uzenet="Jo reggelt";}

        else if (h>9 && (h<18 && s>30)){
            uzenet = "Jó napot";}

        else if (h<20 && h>5){
            uzenet= "Jo estet";
        }
        else{
            uzenet = "Jó éjszakát";
        }
        return uzenet;
    }


    public static void main(String[] args) {
        Greetings udv = new Greetings();
        System.out.println(udv.udvozlet(10,40));


    }
}
