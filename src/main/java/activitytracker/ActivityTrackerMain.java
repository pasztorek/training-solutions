package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
            throw new IllegalStateException("Nem tudok kapcsolódni az adatbázishoz.", ee);
        }

        ActivityTrackerMain atm = new ActivityTrackerMain();

        Activity act1 = new Activity(LocalDateTime.of(2021,02, 01,10,10), "Hegymászás", ActivityType.HIKING);
        Activity act2 = new Activity(LocalDateTime.of(2021,02, 01,10,10), "Futás", ActivityType.RUNNING);
        Activity act3 = new Activity(LocalDateTime.of(2021,02, 01,10,10), "Bicajozás", ActivityType.BIKING);

        atm.insertData(dataSource, act1);
        atm.insertData(dataSource, act2);
        atm.insertData(dataSource, act3);

        atm.findById(dataSource, 9L);

        atm.getAllRecors(dataSource);

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
            throw new IllegalArgumentException("Nem tudok adatot beszúrni az adatbázisba.", se);
        }
    }
    public String findById(DataSource ds, Long id){

        try(
        Connection conn = ds.getConnection()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM activities WHERE ID ='10'");
            rs.next();

            Activity act = new Activity(rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));

            return act.toString();

        } catch (SQLException se) {
            throw new IllegalArgumentException("Nincs eredmény.", se);
        }

    }

    public List<Activity> getAllRecors(DataSource ds){
        List<Activity> result = new ArrayList<>();

        try(
                Connection conn = ds.getConnection()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM activities");

            while (rs.next() ){
                result.add(new Activity(rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type"))));

            }

            //Activity act = new Activity(rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));

               } catch (SQLException se) {
            throw new IllegalArgumentException("Nincs eredmény.", se);
        }

        return result;
    }

}
