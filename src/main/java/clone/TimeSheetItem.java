package clone;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;



    public static  TimeSheetItem withDifferentDay(TimeSheetItem tsi, LocalDate date){

            TimeSheetItem otsi = new TimeSheetItem(new TimeSheetItem(tsi.getEmployee(), tsi.getProject(), LocalDateTime.of(date, tsi.getFrom().toLocalTime()), LocalDateTime.of(date, tsi.getTo().toLocalTime())));

        return otsi;
    }

    public TimeSheetItem(TimeSheetItem tsi){
            employee=tsi.getEmployee();
            project=tsi.getProject();
            from=tsi.getFrom();
            to=tsi.getTo();
    }

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}






