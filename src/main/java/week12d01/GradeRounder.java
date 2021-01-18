package week12d01;

import java.lang.reflect.Array;
import java.util.List;

public class GradeRounder {

    public int[] roundGrades (int[] grades){
        int[] result = grades.clone();
        int count=0;

        for(int i=0; i<grades.length; i++){

            count=grades[i];

            while (!(count%5==0)){
                count++;
            }

            result[i]=count;

            if(grades[i]<=40 || (count-grades[i]>=3)){
                result[i]=grades[i];
            }

        }

        return result;
    }

    public static void main(String[] args) {
        GradeRounder gr = new GradeRounder();
        System.out.println(gr.roundGrades(new int[]{82,83,40,41,}));
    }

}
