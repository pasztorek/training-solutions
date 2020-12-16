package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {


    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> union = new ArrayList<>();

        for (String str1 : first) {
            if (!union.contains(str1)) {
                union.add(str1);
            }
        }

        for (String str2 : second) {
            if (!union.contains(str2)) {
                union.add(str2);
            }
        }

        return union;
    }
}

