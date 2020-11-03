package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl szam = new IntroControl();

        System.out.println(szam.substractTenIfGreaterThanTen(3));
        System.out.println(szam.describeNumber(0));
        System.out.println(szam.greetingToJoe("John"));
        System.out.println(szam.calculateBonus(50_000_000));
        System.out.println(szam.calculateConsumption(9500, 10100));
        szam.printNumbers(8);
        szam.printNumbersBetween(10,15);
        szam.printNumbersBetweenAnyDirection(22,15);
        szam.printOddNumbers(10);


    }
}
