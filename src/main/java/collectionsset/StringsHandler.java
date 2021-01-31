package collectionsset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {


    public Set<String> filterUniqueStrings(Collection<String> stringCollection){
        Set<String> result= new HashSet<>();

        for(String str: stringCollection){
            result.add(str);
        }

        return result;
    }

    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB){
        Set<String> result= new HashSet<>();

        for(String str: setA){
            if(setB.contains(str)){
                result.add(str);
            }
        }
        return result;
    }

}
