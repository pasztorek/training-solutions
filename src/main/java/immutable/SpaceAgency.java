package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satelites = new ArrayList<>();


    public void registerSatellite(Satellite satellite){

        if(satellite==null){
            throw new NullPointerException("Parameter must not be null!");
        }
              satelites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        Satellite result=null;

        for(Satellite sat: satelites){
            if(sat.getRegisterIdent().equals(registerIdent)){
                return result = sat;
            }

            }
        if(result==null){
            throw new IllegalArgumentException("Satellite with the given registration cannot be found!XXX123");
        }

        return result;
    }


    public String toString() {
        String result="[";

        for(int i=0; i<satelites.size(); i++){
            result = result + satelites.get(i).toString();

            if(i != satelites.size()-1){
                result = result+", ";
        }
        }

        return result+"]";
    }
}
