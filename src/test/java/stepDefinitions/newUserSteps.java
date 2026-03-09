package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.NewUserPage;
import utils.Base;
import utils.UserDataStore;

public class newUserSteps extends Base {
    public WebDriver driver;

    public newUserSteps() {
        this.driver = super.driver;
    }
    @Given("the new user is on the login page")
    public void the_new_user_is_on_the_login_page() {
        newUserPage.clickNavLoginButton();
    }
    @When("the new user enters valid email {}")
    public void the_new_user_enters_valid_email(String email) {
        //email = UserDataStore.getRegisteredUserEmail();
        newUserPage.enterUsername(email);
    }
    @When("the new user enters valid password {}")
    public void the_new_user_enters_valid_password(String password) {
        //password = UserDataStore.getRegisteredUserPassword();
       newUserPage.enterPassword(password);
    }
    @When("the new user click the login button")
    public void the_new_user_click_the_login_button() {
        newUserPage.clickLoginButton();
    }
    @Then("the new user is successfully logged in")
    public void the_new_user_is_successfully_logged_in() {
        newUserPage.getLoginSuccessMessage("Welcome back, Josey! \uD83D\uDC4B");
    }

}
