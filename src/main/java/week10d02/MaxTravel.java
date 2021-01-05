package week10d02;

import java.util.ArrayList;
import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> stations){
       List<Integer> sumByIndex = new ArrayList<>();
       int counter = 0;
       int higher = 0;
       int high= 0;

        for(int i=0; i<stations.size(); i++){

             for (int y=0; y<stations.size(); y++){

                if(stations.get(i)==stations.get(y)){
                 counter++;
                }
            }
                sumByIndex.add(counter);
                counter=0;
        }


                for(int z=0; z<sumByIndex.size(); z++){
                    if(sumByIndex.get(z)>high){
                        high = sumByIndex.get(z);
                        higher=z;
                    }
                }

        return stations.get(higher);
    }
}
