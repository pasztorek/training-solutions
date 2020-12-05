package methodpass;

import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers;

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){


    }

    public void moveTrooperByName(String name, Position target){


    }

    public void moveClosestTrooper(Position target){


    }

    public Trooper findTrooperByName(String name){

        return new Trooper("Jane");
    }

    public Trooper findClosestTrooper(Position target){

        return new Trooper("Jane");
    }

}
