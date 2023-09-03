package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ConfigReader {

    public static Properties initializeProperties() {
        Properties prop = new Properties();
        File proFile = new File(System.getProperty("user.dir" + "src/test/resources/Config/config.properties"));
        try {
            FileInputStream fis = new FileInputStream(proFile);
            prop.load(fis);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return prop;
    }
    public String getBrowser(){
        return initializeProperties().getProperty("browser");
    }
    public String getChromePath(){
        return initializeProperties().getProperty("chromePath");
    }
}


