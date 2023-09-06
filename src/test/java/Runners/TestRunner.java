package Runners;



import Helper.ConfigurationReader;
import Helper.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;



@CucumberOptions(features = "src/test/resources/features",
        glue = {"Steps"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

    private WebDriver driver;


    public TestRunner(){
        driver = DriverManager.getDriver();
    }
    @BeforeClass
    public void setUp() throws Exception {

        openBrowser();
        maximizeWindow();
//        implicitWait(10);


    }

    private void openBrowser() {
        String baseURL = ConfigurationReader.getApplicationURL();
        driver.get(baseURL);
    }

    private void maximizeWindow() {
//        driver.manage().window().maximize();
    }



    }


