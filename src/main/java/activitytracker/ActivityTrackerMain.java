package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
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

        Activity act1 = new Activity(LocalDateTime.of(2021,02, 01,10,10), "Hegymászás", ActivityType.HIKING);
        Activity act2 = new Activity(LocalDateTime.of(2021,02, 01,10,10), "Futás", ActivityType.RUNNING);
        Activity act3 = new Activity(LocalDateTime.of(2021,02, 01,10,10), "Bicajozás", ActivityType.BIKING);

        atm.insertData(dataSource, act1);
        atm.insertData(dataSource, act2);
        atm.insertData(dataSource, act3);
    }

    public void insertData(DataSource ds, Activity act){



        try(
        Connection conn = ds.getConnection()){
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO activities (start_time, activity_type, activity_desc) values(?,?,?)");
            stmt.setTimestamp(1, Timestamp.valueOf(act.getStartTime()));
            stmt.setString(2, act.getType().toString());
            stmt.setString(3, act.getDesc());
            stmt.executeUpdate();


        } catch (SQLException se) {
            throw new IllegalArgumentException(" Nem jó...", se);
        }

    }

}
