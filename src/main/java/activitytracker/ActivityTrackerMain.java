package activitytracker;


import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {


    public static void main(String[] args) {

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

               } catch (SQLException se) {
            throw new IllegalArgumentException("Nincs eredmény.", se);
        }

        return result;
    }

}
