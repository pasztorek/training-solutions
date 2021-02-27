package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource ds;

    public ActivityDao(DataSource ds) {
        this.ds = ds;
    }

    public void insertData(Activity act){

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

    public String findById(Long id){

        try(
                Connection conn = ds.getConnection()){
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM activities WHERE ID =?");
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.next();

            Activity act = new Activity(rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));

            return act.toString();

        } catch (SQLException se) {
            throw new IllegalArgumentException("Nincs eredmény.", se);
        }

    }

    public List<Activity> getAllRecors(){
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
