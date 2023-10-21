package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestHelper extends PageFactory {

    public static WebDriver driver;
    private WebDriverWait commonWait;
    public TestHelper(){
        driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
    public WebDriverWait getWait()
    {
        if(commonWait == null)
        {
            commonWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }
        return commonWait;
    }
    public static void implicitWait(WebDriver driver, int time){
       driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    public static void explicitWait(WebElement element, WebDriver driver){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));

        }
        catch (Exception e){
            System.out.println("");
            e.printStackTrace();
        }

    }
    public static void maximizeWindows(){
        driver.manage().window().maximize();
    }




}
