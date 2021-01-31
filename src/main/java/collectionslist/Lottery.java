package collectionslist;


import java.util.*;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
        if(lotteryType >= ballCount){
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }


        List<Integer> result = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>();


        while (numbers.size() < lotteryType) {

            Random rnd = new Random();
            int number = rnd.nextInt(ballCount + 1);

            if (number != 0) {
                numbers.add(number);
            }
            for(Integer num: numbers){
                result.add(num);
            }
        }

        return result;
    }
}
