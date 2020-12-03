package methodchain;

public class NavigationPoint {

    private int distance;
    private int azimut;

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }


    public NavigationPoint(int distance, int azimut) {
        this.distance = distance;
        this.azimut = azimut;
    }


    public String toString(){
        return "distance: " + distance + " azimut: " + azimut;
    }

}
