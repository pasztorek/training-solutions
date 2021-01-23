package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> iroda = new ArrayList<>();


    public void addMeetingRoom(MeetingRoom szoba){
        iroda.add(szoba);

    }
    public void printNames(){

        for(MeetingRoom room : iroda)
        System.out.print(room.getName().toString() + "  ");

    }

    public void printNamesReverse() {
        for (int i = iroda.size(); i > 0; i--) {
            System.out.println(iroda.get(i-1).getName().toString());


        }
    }

    public void printEventNames() {
        for (int i = 0; i < iroda.size(); i += 2) {
            System.out.println(iroda.get(i).getName().toString());


        }
    }
        public void printAreas() {
            for(MeetingRoom room : iroda)
                System.out.println(room.getName().toString() + " "+ room.getWitdth() + "m * " + room.getLenght() + "m = " + room.getLenght()*room.getWitdth() + " m2");

        }

        public void printMeetingRoomsWithName(String name){
            for(MeetingRoom room : iroda){
                if(room.getName().toString().equals(name)){
                    System.out.println(room.getName().toString() + " "+ room.getWitdth() + "m * " + room.getLenght() + "m = " + room.getLenght()*room.getWitdth() + " m2");
                }
            }
        }
        public void printMeetingRoomsContains(String part) {
            for (MeetingRoom room : iroda) {
                if (room.getName().toString().toLowerCase().indexOf(part) != -1) {
                    System.out.println(room.getName().toString() + " " + room.getWitdth() + "m * " + room.getLenght() + "m = " + room.getLenght() * room.getWitdth() + " m2");
                }
            }
        }

    public void printareasLargeThan(int terulet) {
        for (MeetingRoom room : iroda) {
            if (room.getArea() > terulet) {
                System.out.println(room.getName().toString() + " " + room.getWitdth() + "m * " + room.getLenght() + "m = " + room.getLenght() * room.getWitdth() + " m2");
            }
        }
    }

    }

