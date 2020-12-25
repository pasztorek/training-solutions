package catalog;

import java.util.List;

public class Validators {


    public static boolean isBlank(String str){
        if(str==null || str.isBlank() || str.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List list){
        if(list==null || list.isEmpty()){
            return true;
        }
        return false;
    }

}
