package Runners;


import Helper.ConfigurationReader;
import Helper.DriverManager;
import Helper.TestHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;


@CucumberOptions(features = "src/test/resources/features",
        glue = {"Steps"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

    private WebDriver driver;
    private TestHelper helper = new TestHelper();


    public TestRunner(){
        driver = DriverManager.getDriver();
    }
    @BeforeClass
    public void setUp() throws Exception {

        openBrowser();

    }

    private void openBrowser() {
        helper.maximizeWindows();
        String baseURL = ConfigurationReader.getApplicationURL();
        driver.get(baseURL);


    }


    }


