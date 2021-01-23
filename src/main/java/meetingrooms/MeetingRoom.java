package meetingrooms;

public class MeetingRoom {

    private String name;
    private int lenght;
    private int witdth;

    public MeetingRoom(String name, int lenght, int witdth) {
        this.name = name;
        this.lenght = lenght;
        this.witdth = witdth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWitdth() {
        return witdth;
    }

    public void setWitdth(int witdth) {
        this.witdth = witdth;
    }

    public int getArea(){

        return lenght*witdth;

    }
}
