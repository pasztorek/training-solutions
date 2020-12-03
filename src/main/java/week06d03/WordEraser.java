package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word){
        String result="";
        int lastSpace=0;
        String actualSubString;

        for(int i=0; words.length()>i; i++){
            if(words.charAt(i)==' '){

               actualSubString = words.substring(lastSpace,i);
                    if(!actualSubString.trim().equals(word)){
                        result = result + words.substring(lastSpace,i);
                    }
                lastSpace=i;
            }

        }
        return result.trim();
    }

}
