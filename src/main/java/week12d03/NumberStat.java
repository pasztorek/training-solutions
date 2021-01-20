package week12d03;

import java.util.Comparator;
import java.util.List;

public class NumberStat {
    int counter=0;

    public int getNumber(List<Integer> numbers) {

        numbers.sort(Comparator.naturalOrder());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == numbers.get(i + 1)) {
                numbers.set(i, 0);

            }
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i+1) !=0 && numbers.get(i)!=0) {
                return numbers.get(i);
            }
        }
            return 0;
        }
   }
