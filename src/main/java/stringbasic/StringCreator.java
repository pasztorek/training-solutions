package stringbasic;

public class StringCreator {


    public String createStringForHeap(){
       return new String("123");
    }


    public String createStringForPool(){
        String uj2 ="123";
        return  uj2;
    }

}
