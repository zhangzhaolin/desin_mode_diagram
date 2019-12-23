package pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Database {

    private Database() {

    }

    public static Properties getProperties(String dbname) {
        Properties properties = new Properties();
        String fileName = dbname + ".properties";
        try {
            properties.load(new InputStreamReader(Database.class.getResourceAsStream("/" + fileName), StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
