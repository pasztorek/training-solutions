package finalmodifier;
import static finalmodifier.CircleCalculator.PI;

public class CylinderCalculator {


    public double calculateVolume(double r, double h){

        return r*r*PI;

    }

    public double calculateSurfaceArea(double r, double h){

        return 2*r*PI*h;
    }

}
