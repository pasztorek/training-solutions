package week17d01;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class MariaDB {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");

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
    }
}
