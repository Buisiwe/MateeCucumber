package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.RegisterUserPage;
import utils.Base;
import utils.UserDataStore;
import utils.UserDataStore;

public class RegisterSteps extends Base {
    public WebDriver driver;
    ; // Generate a unique email for registration
//    private UserDataStore userDataStore;
//    private String currentEmail;
//    private String currentFirstName;
//    private String currentLastName;
//    private String currentPassword;

    public RegisterSteps() {
        this.driver = super.driver;
        //this.userDataStore = UserDataStore.getInstance();
    }

    @Given("the user clicks on login button on the landing page")
    public void the_user_is_on_the_register_page() {
        loginPage.clickNavLoginButton();

    }

    @When("the user click the sign up link")
    public void the_user_click_the_sign_up_link() {
        registerUserPage.signUpLink();
    }


    @And("the user enters first name{}")
    public void the_user_enters_first_name(String firstName) throws InterruptedException {
        //this.currentFirstName = firstName;
        registerUserPage.enterFirstName(firstName);
    }

    @And("the user enters last name {}")
    public void the_user_enters_last_name(String lastName) throws InterruptedException {
        //this.currentLastName = lastName;
        registerUserPage.enterLastName(lastName);
    }

    @And("the user enters register email {}")
    public void the_user_enters_email(String email) throws InterruptedException {
        //this.currentEmail = email;
        registerUserPage.enterEmail(email);
    }

    @And("the user enters register password {}")
    public void the_user_enters_password(String password) throws InterruptedException {
        //this.currentPassword = password;
        registerUserPage.enterPassword(password);
    }

    @And("the user enters confirm password {}")
    public void the_user_enters_confirm_password(String confirmPassword) throws InterruptedException {
        registerUserPage.enterConfirmPassword(confirmPassword);
    }

    @And("the user selects group {}")
    public void the_user_selects_group(String group) {
        registerUserPage.selectGroup(group);
    }


    @And("the user click the sign up button")
    public void the_user_click_the_sign_up_button() {
        registerUserPage.clickRegisterSubmitButton();
    }

    @Then("the user is successfully registered")
    public void the_user_should_see_a_registration_success_message() {
        String actualMessage = registerUserPage.getRegistrationSuccessMessage();
        String expectedMessage = "Registration successful! Please check your email to verify your account.";
        System.out.println("Actual registration success message: " + actualMessage);

        UserDataStore.generateNewUser();

        String email = UserDataStore.getEmail();
        String password = UserDataStore.getPassword();

        System.out.println("Generated Email: " + email);
        System.out.println("Generated Password: " + password);

        UserDataStore.setRegisteredUserEmail(email);
        UserDataStore.setRegisteredUserPassword(password);
//        // Store the registered user's data for use in subsequent scenarios
       // UserDataStore.setRegisteredUserEmail(email);
//        userDataStore.setRegisteredFirstName(currentFirstName);
//        userDataStore.setRegisteredLastName(currentLastName);
        //userDataStore.setRegisteredPassword(currentPassword);
//
//        System.out.println("✓ User registration stored - Email: " + currentEmail);
    }

}
