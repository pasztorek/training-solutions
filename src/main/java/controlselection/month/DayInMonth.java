package controlselection.month;

public class DayInMonth {

    public String napok(int y, String m) {
        String vissza;
        int f = 28;
        int d = 1;
        if (y % 4 == 0) {
            if (y % 100 != 00) {
                f = 29;
            }
        }
        if (y % 4 == 0) {
            if (y % 400 == 0) {
                f = 29;
            }
        }

        switch (m) {
            case "január":
                d = 31; break;
            case "február":
                d = f; break;
            case "március":
                d = 31; break;
            case "április":
                d = 30; break;
            case "május":
                d = 31; break;
            case "június":
                d = 30; break;
            case "julius":
                d = 31; break;
            case "augusztus":
                d = 31; break;
            case "szeptember":
                d = 30; break;
            case "oktober":
                d = 31; break;
            case "november":
                d = 30; break;
            case "december":
                d = 31;
                break;
                default: throw new IllegalArgumentException("Invalid month: " + m);
        }
        vissza=y+m+d;
        return vissza;
    }



    public static void main(String[] args) {
        DayInMonth  szokoev = new DayInMonth();
        System.out.println(szokoev.napok(2001,"február"));

    }


}
