package Steps;

import Helper.TestHelper;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class LoginSteps {

    WebDriver driver;
    LoginPage login;

    TestHelper help;

    public LoginSteps() throws IOException {
        driver = new WebDriver() {
            @Override
            public void get(String url) {

            }

            @Override
            public String getCurrentUrl() {
                return null;
            }

            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public List<WebElement> findElements(By by) {
                return null;
            }

            @Override
            public WebElement findElement(By by) {
                return null;
            }

            @Override
            public String getPageSource() {
                return null;
            }

            @Override
            public void close() {

            }

            @Override
            public void quit() {

            }

            @Override
            public Set<String> getWindowHandles() {
                return null;
            }

            @Override
            public String getWindowHandle() {
                return null;
            }

            @Override
            public TargetLocator switchTo() {
                return null;
            }

            @Override
            public Navigation navigate() {
                return null;
            }

            @Override
            public Options manage() {
                return null;
            }
        };
        login = new LoginPage(driver);
        help = new TestHelper();
    }


    @Given("I go to the Application {string}")
    public void i_go_to_the(String url) {
        help.setEnviron(url);




         }
    @When("I input the username {string}")
    public void i_input(String _name) {
        login.loginBtn(_name);

    }
    @And("I input the password {string}")
    public void i_input_the(String pd) {
        login.loginPass(pd);

    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        login.submit_btn();

    }
    @Then("Home page gets displayed")
    public void home_page_gets_displayed() {

           }

}
