package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RegisterUserPage;
import utils.Base;

public class RegisterSteps extends Base {
    @Given("the user clicks on login button on the landing page")
    public void the_user_is_on_the_register_page() {
        registerUserPage.LandingPageHeading();
    }


    @When("the user click the sign up link")
    public void the_user_click_the_sign_up_link() {
        registerUserPage.registrationHeading();
    }

    @When("the user enters registration details with firstName {},lastName {}, email {}, password {}, confirmPassword {} and select a group {}")
    public void the_user_enters_registration_details(String firstName,String lastName, String email, String password, String confirmPassword, String group) {
            registerUserPage.registration_details(firstName,lastName,email,password,confirmPassword,group);
       /* registerUserPage.enterFirstName(firstName);
        registerUserPage.enterLastName(lastName);
        registerUserPage.enterEmailAddress(email);
        registerUserPage.enterPassword(password);
        registerUserPage.enterConfirmPassword(confirmPassword);
        registerUserPage.selectGroup(group);*/
    }

    @And("the user click the sign up button")
    public void the_user_click_the_sign_up_button() {
        registerUserPage.clickRegisterSubmitButton();
    }

    @Then("the user is successfully registered")
    public void the_user_should_see_a_registration_success_message() {
        String actualMessage = registerUserPage.getRegistrationSuccessMessage();
        String expectedMessage = "Registration successful! Please check your email to verify your account.";
    System.out.println("Actual registration success message: " + actualMessage);}

}
