package Pages;

import Helper.ConfigDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class LoginPage {


    private WebDriver driver;
    ConfigDataProvider con = new ConfigDataProvider();

    @FindBy(how = How.NAME, using = "username")
    WebElement txtUserName;

    @FindBy(how = How.NAME, using = "password")
    WebElement txtPass;

    @FindBy(how = How.XPATH, using = "")
    WebElement btn_sub;


    public LoginPage(WebDriver driver) throws IOException {
    this.driver = driver;
    }

    public void loginBtn(String name){
        txtUserName.sendKeys("Admin");

    }
    public void loginPass(String pwd){
        txtPass.sendKeys("admin1234");

    }
    public void submit_btn(){
        btn_sub.click();

    }
}
