package properties;

import java.io.IOException;
import java.io.*;
import java.nio.file.Path;
import java.util.Properties;



public class DatabaseConfiguration {

    private Properties prop;


    public DatabaseConfiguration(File path) {


        try (

                FileInputStream reader = new FileInputStream(path)){

                prop.load(reader);

        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read file from classpath", ioe);
        }

    }


    public DatabaseConfiguration() {
        try (

                BufferedReader reader = new BufferedReader(new InputStreamReader(DatabaseConfiguration.class.getResourceAsStream("/db.properties")))){
                prop.load(reader);

        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read file from classpath", ioe);
        }




    }
    public String getHost() {
        return prop.getProperty("db.host");
    }

    public int getPort() {
        return Integer.parseInt(prop.getProperty("db.port"));
    }

    public String getSchema() {
        return prop.getProperty("db.schema");
    }

}
