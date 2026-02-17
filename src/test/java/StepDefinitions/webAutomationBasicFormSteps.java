package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;

public class webAutomationBasicFormSteps extends Base {
    @Given("the user is on the learning menu page")
    public void i_am_on_the_web_automation_basic_form_page() {
        loginPage.clickNavWebAutomationBasicFormButton();
    }
    @When("user navigates to the Web Automation Basic Form page")
    public void i_fill_out_the_form_with_valid_data() {
        webAutomationBasicFormPage.navLearnMenu();
    }

    @And("user navigates to the Web Automation Basic Form page")
    public void user_navigates_to_the_web_automation_basic_form_page() {
        webAutomationBasicFormPage.selectLearningMaterialDropdown();
    }

    @And("the user enters full name {}")
    public void i_enter_my_full_name(String fullName) {
        webAutomationBasicFormPage.enterFullName(fullName);
    }

    @And("the user enters email {}")
    public void i_enter_my_email_address(String emailAddress) {
        webAutomationBasicFormPage.enterEmailAddress(emailAddress);
    }

    @And("the user select incremental age {}")
    public void i_select_my_age(String age) {
        webAutomationBasicFormPage.selectAge(age);
    }

    @And("the user select gender from dropdown {}")
    public void i_select_my_gender(String gender) {
        webAutomationBasicFormPage.selectGender(gender);
    }

    @And("the user select country from dropdown {}")
    public void i_select_my_country(String country) {
        webAutomationBasicFormPage.selectCountry(country);
    }

    @And("the user select experience level from dropdown {}")
    public void i_select_my_experience(String experience) {
        webAutomationBasicFormPage.selectExperience(experience);
    }

    @And("the user selects the programming language {}")
    public void i_check_the_checkbox_for_skills() {
        webAutomationBasicFormPage.clickCheckboxForSkills();
    }

    @And("the user add comments {}")
    public void i_add_comments(String comments) {
        webAutomationBasicFormPage.addComments(comments);}

    @And("the user check the terms and conditions checkbox or subscribe to the newsletter")
    public void i_check_the_terms_and_conditions_checkbox() {
        webAutomationBasicFormPage.clickTermsAndConditionsCheckbox();}
    @And("the user click the submit form button or reset the form button or validate the form button")
    public void i_click_the_submit_form_button() {
        webAutomationBasicFormPage.clickSubmitFormButton() ; }

    @Then("the form is successfully submitted")
    public void the_form_is_successfully_submitted() {
        String actualValue = webAutomationBasicFormPage.getFormSubmissionSuccessMessage();
        System.out.println("Actual form submission success message: " + actualValue);
         String expectedValue = "Form submitted successfully!";
        System.out.println("Expected form submission success message: " + expectedValue);
         if (actualValue.equals(expectedValue)) {
            System.out.println("Form submission success message is correct.");
        } else {
            System.out.println("Form submission success message is incorrect. Expected: " + expectedValue + ", but got: " + actualValue);
        }
        System.out.println("Form submitted successfully");
    }

}
