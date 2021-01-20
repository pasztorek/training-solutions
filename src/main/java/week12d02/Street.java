package week12d02;

import java.util.ArrayList;
import java.util.List;



public class Street {

    private List<Site> sites= new ArrayList<>();

    public void sellSite(Site site){
        sites.add(site);

   }

   public int getLasHouseNumber(){
        int paros=0;
        int paratlan=-1;

        for(Site st: sites){
            if(st.isSide()==0){
                paros=paros+2;
            }
            else{
                paratlan=paratlan+2;
            }
        }
            if(sites.get(sites.size()-1).isSide()==0){
                return paros;
            }
        return paratlan;
   }

   public String sitesByFence(){

          int PERFECT = 0;
          int NEED_UPGRADE = 0;
          int NO_FENCE = 0;
          List<String> result = new ArrayList<>();

        for(Site st: sites){
            if(st.fence.toString().equals("PERFECT")){
                PERFECT ++;
            }
            if(st.fence.toString().equals("NEED_UPGRADE")){
                NEED_UPGRADE++;
            }
            if(st.fence.toString().equals("NO_FENCE")){
                NO_FENCE++;
            }
        }

        result.add("PERFECT : "+PERFECT);
        result.add("NEED_UPGRADE : "+NEED_UPGRADE);
        result.add("NO:FENCE : "+NO_FENCE);

        return result.toString();

        }


   }

