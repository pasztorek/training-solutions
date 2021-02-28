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

    public Activity insertData(Activity act){

        try(Connection conn = ds.getConnection()){

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO activities (start_time, activity_type, activity_desc) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setTimestamp(1, Timestamp.valueOf(act.getStartTime()));
            stmt.setString(2, act.getType().toString());
            stmt.setString(3, act.getDesc());
            stmt.executeUpdate();

            try(ResultSet rs = stmt.getGeneratedKeys()){

                if (rs.next()){
                     return new Activity(rs.getLong(1),act.getStartTime(), act.getDesc(), act.getType());
                }
                else {
                    throw new IllegalArgumentException("Nincs key generálva");
                }
            }


        } catch (SQLException se) {
            throw new IllegalArgumentException("Nem tudok adatot beszúrni az adatbázisba.", se);
        }

    }

    public Activity findById(Long id){

        try(Connection conn = ds.getConnection()){
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM activities WHERE ID =?");
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.next();

            Activity act = new Activity(rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));

            return act;

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
