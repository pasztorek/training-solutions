package week05d03;

import java.util.List;

public class ListCounter {

    public int counter(List<String> input) {
        int sum = 0;
        for (String str : input)
            if (str.substring(0, 1).toLowerCase().equals("a")) {
                sum++;
            }
        return sum;
    }

}