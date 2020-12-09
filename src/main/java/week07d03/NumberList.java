package week07d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> numbers) {
        int pervious = numbers.get(0);

        for (int num : numbers) {
            if (num < pervious) {
                return false;
            }
            pervious = num;
        }
        return true;
    }
}
