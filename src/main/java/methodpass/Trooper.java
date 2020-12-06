package methodpass;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name must not be empty.");

        }

        this.name = name;
        this.position = new Position(0,0);
    }


    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target){
        if(target==null){
            throw new IllegalArgumentException();
        }
        this.position=target;

    }

    public double distanceFrom(Position target){

        return Math.sqrt(Math.pow(position.getPosX() - target.getPosX(), 2) + Math.pow(position.getPosY() - target.getPosY(), 2));
    }
}
