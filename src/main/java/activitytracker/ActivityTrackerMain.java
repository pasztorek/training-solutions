package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {


    public static void main(String[] args) {

        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");

        }

        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
        try
                (Connection conn = dataSource.getConnection())
        {

            
        }
        catch (SQLException ee){
            throw new IllegalStateException("Nem jó", ee);
        }

        ActivityTrackerMain atm = new ActivityTrackerMain();
        atm.insertData(dataSource);
    }

    public void insertData(DataSource ds){

        Activity act1 = new Activity(LocalDateTime.of(2021,02, 01,10,10, 10), "Hegymászás", ActivityType.HIKING);
        Activity act2 = new Activity(LocalDateTime.of(2021,02, 01,10,10, 10), "Futás", ActivityType.RUNNING);
        Activity act3 = new Activity(LocalDateTime.of(2021,02, 01,10,10, 10), "Bicajozás", ActivityType.BIKING);

        try(
        Connection conn = ds.getConnection()){
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO activities (start_time, activity_type, activity_desc), values(?,?,?)");


        } catch (SQLException se) {
            throw new IllegalArgumentException(" Nem jó", se);
        }


    }

}
