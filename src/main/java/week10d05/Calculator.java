package week10d05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Calculator {

    public int findMinMaxSum(int...arr){

        Arrays.sort(arr);

        int sum = 0;
        for(int i=0; i<4; i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.findMinMaxSum(3,5,2,7,7,8,9,3,8));

    }
}
