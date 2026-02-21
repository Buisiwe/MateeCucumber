package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;


public class loginSteps extends Base {

    public WebDriver driver;

    public loginSteps() {
        this.driver = super.driver;
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.clickNavLoginButton();
    }

    @When("the user enters valid email {}")
    public void the_user_enters_valid_email(String email) {

        loginPage.enterUsername(email);
    }

    @And("the user enters valid password {}")
    public void the_user_enters_valid_password(String password) {
        loginPage.enterPassword(password);

    }

    @And("the user click the login button")
    public void the_user_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("the user is successfully logged in")
    public void the_user_is_successfully_logged_in() {
        driver.findElement(By.id("dashboard")).isDisplayed();

    }
}
