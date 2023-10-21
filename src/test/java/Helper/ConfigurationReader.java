package Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationReader {
    private static Properties properties;
    static {
        try {
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(
                    System.getProperty("user.dir")+"/src/test/resources/Config/config.properties");

            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();

    }

    }
    public static String getDriverName(){
        return properties.getProperty("driverName");

    }
    public static String getApplicationURL(){
        return properties.getProperty("applicationURL");
    }
    public static String getUserName(){
        return properties.getProperty("userName");
    }
    public static String getPassword(){
        return properties.getProperty("userPassword");
    }
}
