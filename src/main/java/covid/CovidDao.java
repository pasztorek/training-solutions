package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;

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

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO citizens (name, zip, age, email, taj) values(?,?,?,?,?)");

            stmt.setString(1, ctz.getName());
            stmt.setString(2, ctz.getZip());
            stmt.setInt(3, ctz.getAge());
            stmt.setString(4, ctz.getEmail());
            stmt.setString(5, ctz.getTaj());

            stmt.executeUpdate();


        } catch (SQLException se) {
            throw new IllegalArgumentException("Nem tudok adatot beszúrni az adatbázisba.", se);
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
            throw new IllegalArgumentException("Nem tudok adatot beszúrni az adatbázisba.", se);
        }

    }

}
