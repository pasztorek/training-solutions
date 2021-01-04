package week10d01;

import java.util.ArrayList;
import java.util.List;

public class Hiking {


    public double getPlusElevation(List<Double> latitudes) {
        double result = 0;

        for (int i = 0; i < latitudes.size() - 1; i++) {
            if (latitudes.get(i + 1) > latitudes.get(i)) {
                result = result + (latitudes.get(i + 1) - latitudes.get(i));
            }

        }
        return result;
    }

}
