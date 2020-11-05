package finalmodifier;
import static finalmodifier.CircleCalculator.PI;


public class PiMain {

    public static void main(String[] args) {

        CircleCalculator kor = new CircleCalculator();

        System.out.println(kor.calculatePerimeter(3));
        System.out.println(kor.calculateArea(3));

        CylinderCalculator henger = new CylinderCalculator();

        System.out.println(henger.calculateVolume(3,3));
        System.out.println(henger.calculateSurfaceArea(3,3));

    }

}
