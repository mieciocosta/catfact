package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    public static String baseUrl;

    static {
        try (FileInputStream config = new FileInputStream("src/test/resources/application.properties")) {
            Properties properties = new Properties();
            properties.load(config);
            baseUrl = properties.getProperty("base.url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
