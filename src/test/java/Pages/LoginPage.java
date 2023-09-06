package Pages;

import Helper.ConfigurationReader;
import Helper.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginPage {


    public WebDriver driver;

    public LoginPage(){
        this.driver = DriverManager.getDriver();
    }

    @FindBy(how = How.XPATH, using = "//form//input[contains(@class, 'active') and @name='username']")
    @CacheLookup
    public WebElement txtUserName;

    @FindBy(how = How.NAME,using = "username")
    @CacheLookup
    private WebElement userBox;
    @FindBy(how = How.NAME, using = "password")
    WebElement txtPass;

    @FindBy(how = How.XPATH, using = "")
    WebElement btn_sub;




    public void loginName(String name){
        String uName = ConfigurationReader.getUserName();
        System.out.println("User Name is: "+uName);
        System.out.println("This is Driver: "+driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userBox.sendKeys(uName);

    }
    public void loginPass(String pwd){
        String uPWD = ConfigurationReader.getPassword();
        txtPass.sendKeys(uPWD);

            }
    public void submit_btn(){
        btn_sub.click();

    }
}
