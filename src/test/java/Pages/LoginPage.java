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
import org.testng.Assert;
import org.testng.asserts.Assertion;


public class LoginPage extends TestHelper {


    public WebDriver driver;
    private TestHelper help = new TestHelper();

    public LoginPage(){
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how =  How.XPATH, using = "//h5[contains(.,'Login')]")
    private WebElement txtTitle;

    @FindBy(how = How.NAME,using ="username")
    private WebElement userBox;
    @FindBy(how = How.NAME, using = "password")
    WebElement passBox;

    @FindBy(how = How.XPATH, using ="//button[@type='submit']")
    WebElement btn_sub;


    public void loginPageTitle(){
        WebElement element= getWait().until(ExpectedConditions.visibilityOf(txtTitle));
        String lgTitle = element.getText();

        Assert.assertEquals("Login", lgTitle);

        System.out.println("This is title: "+lgTitle);
    }

    public void loginName(String name) throws InterruptedException {
        String uName = ConfigurationReader.getUserName();
        getWait().until(ExpectedConditions.visibilityOf(userBox));
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
