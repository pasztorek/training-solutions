package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CovidDao {

    private MariaDbDataSource dataSource = new MariaDbDataSource();

    public void connectToDataBase() {

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");

        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
        try (Connection conn = dataSource.getConnection()) {

        } catch (SQLException ee) {
            throw new IllegalStateException("Nem tudok kapcsolódni az adatbázishoz.", ee);
        }
    }

    public void insertCitizen(Citizen ctz){

            try(Connection conn = dataSource.getConnection()){

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO citizens (name, zip, age, email, taj, number_of_vaccinations) values(?,?,?,?,?)");

            stmt.setString(1, ctz.getName());
            stmt.setString(2, ctz.getZip());
            stmt.setInt(3, ctz.getAge());
            stmt.setString(4, ctz.getEmail());
            stmt.setString(5, ctz.getTaj());
            stmt.setInt(6, 0);

            stmt.executeUpdate();


        } catch (SQLException se) {
            throw new IllegalStateException("Nem tudok adatot beszúrni az adatbázisba.", se);
        }

    }

    public String getCity(String zip){

        try(Connection conn = dataSource.getConnection()){

            PreparedStatement stmt = conn.prepareStatement("SELECT city_name from CITIES where zip_code =?");

            stmt.setString(1, zip);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            String result = rs.getString("city_name");
            return result;

        } catch (SQLException se) {
            throw new IllegalStateException("Nincs eredmény.", se);
        }

    }

    public void uploadCitizens(String ctz){
        String[] person = ctz.split(";");

        try(Connection conn = dataSource.getConnection()){

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO citizens (name, zip, age, email, taj, number_of_vaccinations) values(?,?,?,?,?,?)");

            stmt.setString(1, person[0]);
            stmt.setString(2, person[1]);
            stmt.setInt(3, Integer.parseInt(person[2]));
            stmt.setString(4, person[3]);
            stmt.setString(5, person[4]);
            stmt.setInt(6, 0);

            stmt.executeUpdate();


        } catch (SQLException se) {
            throw new IllegalStateException("Nem tudok adatot beszúrni az adatbázisba.", se);
        }

    }
    public List<String> getListbyZip(String zip){
        List<String> result = new ArrayList<>();
        try(Connection conn = dataSource.getConnection()){

            PreparedStatement stmt = conn.prepareStatement("SELECT NAME, zip, age, email, taj FROM citizens WHERE zip=? AND number_of_vaccinations < 2 order by age desc, name limit 16");

            stmt.setString(1, zip);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){

               result.add(rs.getString("name")+";"+rs.getString("zip")+";"+rs.getInt("age")+";"+rs.getString("email")+";"+rs.getString("taj")+"\n");

            }

            return result;

        } catch (SQLException se) {
            throw new IllegalStateException("Nincs eredmény.", se);
        }

    }
    public Citizen getVaccionationsData(String taj){

        try(Connection conn = dataSource.getConnection()){

            PreparedStatement stmt = conn.prepareStatement("SELECT id, name, zip, age, email, taj, number_of_vaccinations, last_vaccination FROM citizens WHERE taj=?");

            stmt.setString(1, taj);
            ResultSet rs = stmt.executeQuery();
            rs.next();

            Citizen ctz = new Citizen(rs.getInt("id"),rs.getString("name"),rs.getString("zip"),rs.getInt("age"),rs.getString("email"), rs.getString("taj"),rs.getInt("number_of_vaccinations"), rs.getTimestamp("last_vaccination").toLocalDateTime().toLocalDate());
           // String result = rs.getString("name") +" eddig "+ rs.getInt("number_of_vaccinations")+" oltást kapott.";
            return ctz;

        } catch (SQLException se) {
            throw new IllegalStateException("Nincs eredmény.", se);
        }

    }

}
