package Steps;

import Helper.TestHelper;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;

    LoginPage login;
    TestHelper help = new TestHelper();



    @Given("I go to the Application")
    public void i_go_to_the(String url) {
        help.setEnviron(url);




         }
    @When("I input {string}")
    public void i_input(String _name) {
        login.loginBtn(_name);

    }
    @And("I input the {string}")
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
