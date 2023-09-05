package Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;



public class TestHelper {

    private WebDriver driver;
    public static ConfigDataProvider config;

    static {
        try {
            config = new ConfigDataProvider();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


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

//
//                WebDriverManager.chromedriver().setup();
//                System.out.println("Here06");
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--remote-allow-origins=*");
//                driver = new ChromeDriver(options);
//                driver.manage().window().maximize();
////                driver.get("http://www.google.com");
//                System.out.println("Here07");

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
    public void setEnviron(String url){

        String baseURL = config.getApplicationUrl(url);
        System.out.println("URLs: "+baseURL);
        getDriver().get(baseURL);

        System.out.println("Here010");
        System.out.println("This is driver: ");
        System.out.println("Here01");

    }



    public String getUserName(){
        String name =config.userName();
        return name;
    }

    public WebDriver getDriver(){
        if (driver==null){
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }

        return driver;
    }


}
