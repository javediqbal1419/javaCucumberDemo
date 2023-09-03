package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {


    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "")
    WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "")
    WebElement btnPass;

    @FindBy(how = How.XPATH, using = "")
    WebElement btn_sub;


    public LoginPage(WebDriver driver){
    this.driver = driver;
    }

    public void loginBtn(String name){
        btnLogin.sendKeys("admin");

    }
    public void loginPass(String pwd){
        btnPass.sendKeys("1234");

    }
    public void submit_btn(){
        btnLogin.click();

    }
}
