package Pages;

import Helper.ConfigurationReader;
import Helper.DriverManager;
import Helper.TestHelper;
import Runners.TestRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends TestHelper {


    public WebDriver driver;
    private TestHelper help = new TestHelper();

    public LoginPage(){
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME,using ="username")
    private WebElement userBox;
    @FindBy(how = How.NAME, using = "password")
    WebElement passBox;

    @FindBy(how = How.XPATH, using ="//button[@type='submit']")
    WebElement btn_sub;


    public void loginName(String name) throws InterruptedException {
        String uName = ConfigurationReader.getUserName();
        getWait().until(ExpectedConditions.visibilityOf(userBox));
//        Thread.sleep(3000);
        userBox.sendKeys(uName);

    }
    public void loginPass(String pwd){
        String uPWD = ConfigurationReader.getPassword();
        passBox.sendKeys(uPWD);

            }
    public void submit_btn(){
        btn_sub.click();

    }
}
