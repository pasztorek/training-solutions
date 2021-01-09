package week10d05;

public class Calculator {

    public int[] findMinMaxSum(int...arr){
        int max=0;


        int[] res = arr.clone();

            for(int i=0; i<arr.length; i++){
                for(int y = 0; y < arr.length; y++){
                    if(arr[i] < arr[y]){
                        max=arr[y];
                    }
                }
                        arr[i]=0;
            }



        return null;
    }

    public static void main(String[] args) {
        System.out.println("Kérek egy számor vagy (K)ilép");
        Calculator calc = new Calculator();
        calc.findMinMaxSum(1,2,3,4,5);


    }


}
