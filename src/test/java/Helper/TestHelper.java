package Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;


public class TestHelper {
    public static ConfigDataProvider config = null;

    public static WebDriver startApplication(String browserName) throws IOException {
        WebDriver driver = null;
         System.out.println("This is Browser: "+browserName);

          switch (browserName) {
            case TestConstants.BROWSER_FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                break;

            case TestConstants.BROWSER_HEADLESS_FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments(TestConstants.BROWSER_HEADLESS);
                firefoxOptions.addArguments(TestConstants.BROWSER_WINDOW_SIZE);
//                driver = new FirefoxDriver(firefoxOptions);
                break;

            case TestConstants.BROWSER_CHROME:


                WebDriverManager.chromedriver().setup();
                System.out.println("Here06");
                driver = new ChromeDriver();
                driver.get("http://www.google.com");
                System.out.println("Here07");

                break;

            case TestConstants.BROWSER_HEADLESS_CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments(TestConstants.BROWSER_HEADLESS);
                chromeOptions.addArguments(TestConstants.BROWSER_WINDOW_SIZE);
                driver = new ChromeDriver(chromeOptions);
                break;

            case TestConstants.BROWSER_IE:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
//            case TestConstants.BROWSER_EDGE:
//                WebDriverManager.edgedriver().setup();
//                driver = new EdgeDriver();
            default:
                System.out.println("Sorry We do not support this browser");
        }
        return driver;
    }

//    public WebDriver openBrowser() throws IOException {
//        System.out.println("here02");
//
//        config = new ConfigDataProvider();
//
//        WebDriver driver = TestHelper.startApplication((config.getBrowser()));
//
//        System.out.println("here03");
//        return driver;
//
//
//    }
public static void  configureDriverPath() throws IOException {

    if (System.getProperty("os.name").startsWith("Linux")) {
        String firefoxDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/linux/geckodriver";
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/linux/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    }
    if (System.getProperty("os.name").startsWith("Mac")) {
        String firefoxDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/mac/geckodriver";
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    }
    if (System.getProperty("os.name").startsWith("Windows")) {
        String firefoxDriverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//windows//geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        String chromeDriverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//windows//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    }
}}
