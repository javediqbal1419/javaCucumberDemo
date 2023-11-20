package Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;

public class DriverManager {
    public static WebDriver driver;

    DriverManager(){
        PageFactory.initElements(driver, this);
    }

    public static WebDriver getDriver(){
        if (driver==null){
            String driverName = ConfigurationReader.getDriverName();
            switch (driverName.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    System.out.println("This is Chrome Driver Manager");

                    break;
                    
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--remote-allow-origins=*");
                    driver = new FirefoxDriver(firefoxOptions);
                    driver.manage().window().maximize();

                    break;
                default:

            }
        }
        return driver;
    }
}
