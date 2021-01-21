package week12d03;

import java.util.Comparator;
import java.util.List;

public class NumberStat {
    int counter = 0;

    public int getNumber(List<Integer> numbers) {
        int temp = 0;
        int prev = 0;
        numbers.sort(Comparator.naturalOrder());

        for (int i = 0; i < numbers.size() - 1; i++) {
            temp = numbers.get(i);
            numbers.set(i, 0);

            if(!(numbers.contains(temp)) && (temp!=prev)){
                return temp;
            }
            prev= temp;
        }
            return 0;
    }
}