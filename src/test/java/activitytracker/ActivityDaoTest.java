package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ActivityDaoTest {

    ActivityDao adao;

    @BeforeEach
    public void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
        try (Connection conn = dataSource.getConnection()) {

        } catch (SQLException ee) {
            throw new IllegalStateException("Nem tudok kapcsolódni az adatbázishoz.", ee);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        Activity act1 = new Activity(LocalDateTime.of(2021, 02, 01, 10, 10), "Hegymászás", ActivityType.HIKING);
        Activity act2 = new Activity(LocalDateTime.of(2021, 02, 01, 10, 10), "Futás", ActivityType.RUNNING);
        Activity act3 = new Activity(LocalDateTime.of(2021, 02, 01, 10, 10), "Bicajozás", ActivityType.BIKING);

        adao = new ActivityDao(dataSource);

        adao.insertData(act1);
        adao.insertData(act2);
        adao.insertData(act3);



    }

    @Test
    public void test1(){

        assertEquals("startTime=2021-02-01T10:10, desc='Hegymászás', type=HIKING}", adao.findById(1L));

    }

}
