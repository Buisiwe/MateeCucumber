package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class adminApproveSteps extends Base {
    public WebDriver driver;

    public adminApproveSteps() {
        this.driver = super.driver;
    }

    @Given("the admin is logged in")
    public void the_admin_is_logged_in() {
        // Assuming the admin is already logged in, you can add code here to verify the login status if needed.
        // For example, you could check for the presence of an element that is only visible to logged-in admins.
        // Alternatively, you could perform the login steps here if the admin is not already logged in.
        // Example:
        loginPage.clickNavLoginButton();
        loginPage.enterUsername("admin@gmail.com");
        loginPage.enterPassword("@12345678");
        loginPage.clickLoginButton();
        loginPage.getLoginSuccessMessage("Welcome back, admin! \uD83D\uDC4B");
        adminApprovePage.clickAdminMenuButton();
        // Then you can add an assertion to verify that the admin is logged in successfully.
        //String successMessage = loginPage.getLoginSuccessMessage("Welcome back, admin! \uD83D\uDC4B");
        //assert successMessage != null : "Admin login was not successful";
    }

    @When("the admin clicks on admin panel")
    public void the_admin_clicks_on_admin_panel() {
        adminApprovePage.clickAdminPanelButton();
    }

    @When("the admin clicks on the approval button")
    public void the_admin_clicks_on_the_approval_button() {
        adminApprovePage.clickApproveButton();
    }

    @When("the admin search for the email by entering {}in the search field")
    public void the_admin_search_for_the_email_by_entering_email_in_the_search_field(String userEmail) {
        adminApprovePage.searchRegisteredUser(userEmail);
    }

    @When("the admin tick a checkbox next to the email in the search result")
    public void the_admin_tick_a_checkbox_next_to_the_email_in_the_search_result(String userEmail) {
        adminApprovePage.clickSelectUserCheckbox(userEmail);
    }

    @When("the admin clicks on approve button")
    public void the_admin_clicks_on_approve_button() {
        adminApprovePage.clickApproveSelectedUserButton();
    }

    @When("the new user account is successfully approved")
    public void the_new_user_account_with_email_is_successfully_approved() {
        //adminApprovePage.getApprovalSuccessMessage("User approved successfully!");
    }

    @Then("the admin click back to website button")
    public void the_admin_click_back_to_website_button() {

    }

}
