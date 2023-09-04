package Runners;


import Helper.ConfigDataProvider;
import Helper.TestHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import static org.asynchttpclient.Dsl.config;


@CucumberOptions(features = "src/test/resources/features",
        glue = {"Steps"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

    public static ConfigDataProvider config = null;


    @BeforeClass
    public void setUp() throws Exception {

        openBrowser();
        maximizeWindow();
//        implicitWait(10);


    }

//    private void implicitWait(int time) {
//        driver.manage().timeouts().implicitlyWait(time, implicitWait(100);)
//    }

    private void maximizeWindow() {
//        driver.manage().window().maximize();
    }

    public WebDriver openBrowser() throws IOException {

        config = new ConfigDataProvider();

       WebDriver driver = TestHelper.startApplication(config.getBrowser());

        System.out.println("Browser Name: "+driver);
//        driver.get("https://opensource-demo.orangehrmlive.com/");
        return driver;



    }

}
