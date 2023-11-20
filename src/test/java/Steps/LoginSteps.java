package Steps;

import Helper.ConfigurationReader;
import Helper.DriverManager;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginSteps {

    public WebDriver driver;

    LoginPage login = new LoginPage();

    public LoginSteps() throws IOException {
        this.driver = DriverManager.getDriver();
    }

        @Given("I go the Application {string}")
        public void applicationURLs(WebDriver driver){
//            String baseURL = ConfigurationReader.getApplicationURL();
//            driver.get(baseURL);

        }
        @Given("I am on the Application Login page")
        public void applicationHomePage(){
        login.loginPageTitle();

        }

        @When("I input the username {string}")
        public void i_input (String _name) throws InterruptedException {
            login.loginName(_name);
        }
        @And("I input the password {string}")
        public void i_input_the (String pd){
            login.loginPass(pd);

        }

        @When("I click on the submit button")
        public void i_click_on_the_submit_button () {
            login.submit_btn();

        }
        @Then("Home page gets displayed")
        public void home_page_gets_displayed () {

        }

    }
