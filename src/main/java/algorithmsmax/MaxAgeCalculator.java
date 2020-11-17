package algorithmsmax;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers){
        Trainer eredmeny=trainers.get(0);
        int  i=0;

        while (i < trainers.size()){
            if (trainers.get(i).getAge()>eredmeny.getAge()){
                eredmeny = trainers.get(i);
            }
            i++;
        }
        return eredmeny;
    }
}
