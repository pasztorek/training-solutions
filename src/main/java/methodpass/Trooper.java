package methodpass;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target){


    }

    public double distanceFrom(Position target){

        return 1;
    }
}
