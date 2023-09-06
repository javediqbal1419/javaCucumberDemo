package Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            String driverName = ConfigurationReader.getDriverName();
            switch (driverName.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    System.out.println("Here06");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    System.out.println("Here07");
                    break;
                    
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--remote-allow-origins=*");
                    driver = new FirefoxDriver(firefoxOptions);
                    driver.manage().window().maximize();
                    System.out.println("Here07");

                    break;
                default:

            }
        }
        return driver;
    }
}
