package exam02;

public class ArraySelector {

    public String selectEvens(int[] numbers){

        StringBuilder result= new StringBuilder("");

        for(int i=0; i<numbers.length; i=i+2){
            result.append(numbers[i]+", ");
        }

        if(result.toString()!=""){
            result.insert(0,"[");
            result.delete(result.length()-2, result.length());
            result.append("]");
        }

        return result.toString();
    }
}
