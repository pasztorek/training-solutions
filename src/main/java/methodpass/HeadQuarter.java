package methodpass;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        this.troopers.add(trooper);
        }


    public void moveTrooperByName(String name, Position target) {
        findTrooperByName(name).changePosition(target);
    }

    public void moveClosestTrooper(Position target){
        findClosestTrooper(target).changePosition(target);

    }

    public Trooper findTrooperByName(String name){
        for(Trooper trp: troopers){
            if(trp.getName().equals(name)){
               return trp;
            }
        }
        return null;
    }

    public Trooper findClosestTrooper(Position target){
        double dist = Math.sqrt(Math.pow(troopers.get(0).getPosition().getPosX() - target.getPosX(), 2) + Math.pow(troopers.get(0).getPosition().getPosY() - target.getPosY(), 2));
        Trooper selectedTrooper = troopers.get(0);

        for(Trooper trp: troopers){
            if(Math.sqrt(Math.pow(trp.getPosition().getPosX() - target.getPosX(), 2) + Math.pow(trp.getPosition().getPosY() - target.getPosY(), 2))<=dist){
            selectedTrooper = trp;
            }

        }

        return selectedTrooper;
    }

}
