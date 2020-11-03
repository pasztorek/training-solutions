package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        Performance elso = new Performance(LocalDate.of(2020,11,20), LocalTime.of(20,00), LocalTime.of(22,00), "Lagzi Lajcsi");
        System.out.println(elso.getArtist() + ": " + elso.getDate() + " " + elso.getStartTime() + "-" + elso.getEndTime());
    }
}
