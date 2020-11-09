package enumtype.week;

public class WorkdayCalculatorMain {

    public static void main(String[] args) {

        WorkdayCalculator napozas = new WorkdayCalculator();
        System.out.println(napozas.naptipus(Day.FRIDAY,2).toString());

    }
}
