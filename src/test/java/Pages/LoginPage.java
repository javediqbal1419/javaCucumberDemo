package Pages;

import Helper.ConfigurationReader;
import Helper.DriverManager;
import Runners.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginPage extends TestRunner {


    public WebDriver driver;

    public LoginPage(){
        this.driver = DriverManager.getDriver();
    }

    By name01= By.name("username");

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


    public void loginName(String name) throws InterruptedException {
        String uName = ConfigurationReader.getUserName();

        Thread.sleep(300);
        WebElement el01 =   driver.findElement(By.name("username"));
        System.out.println("This is element: "+el01);
        el01.sendKeys(uName);

//        driver.findElement(By.name("username")).sendKeys("Admin");
//        WebElement username = driver.findElement(name01);
//        System.out.println("System: "+username);
//        username.sendKeys("Admin");

    }
    public void loginPass(String pwd){
        String uPWD = ConfigurationReader.getPassword();
//        txtPass.sendKeys(uPWD);

        WebElement p_el =   driver.findElement(By.name("password"));
        p_el.sendKeys(uPWD);
            }
    public void submit_btn(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        btn_sub.click();

    }
}
