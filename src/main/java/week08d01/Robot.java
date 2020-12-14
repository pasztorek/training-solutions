package week08d01;

import methodpass.Position;

public class Robot {

    RobotPosition position = new RobotPosition();

    public RobotPosition move(String movements){

        for (int i=0; i<movements.length(); i++){
            String subString = movements.substring(i,i+1);

                switch(subString){
                    case "L":
                        position.Y--;
                        break;
                    case "F":
                        position.Y++;
                        break;
                    case "J":
                        position.X++;
                        break;
                    case "B":
                        position.X--;
                        break;
                }
        }
    return position;

    }

    public static void main(String[] args) {
        Robot rbt = new Robot();
        rbt.move("FFLLLLLBBBBJJJJJJJ");
        System.out.println(rbt.position.toString());
    }
}
