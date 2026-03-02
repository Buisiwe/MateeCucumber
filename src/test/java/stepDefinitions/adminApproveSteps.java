package stepDefinitions;

import io.cucumber.java.en.And;
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
        //registerUserPage.signUpLink();
        loginPage.clickNavLoginButton();
        loginPage.enterUsername("admin@gmail.com");
        loginPage.enterPassword("@12345678");
        loginPage.clickLoginButton();
        loginPage.getLoginSuccessMessage("Welcome back, admin! \uD83D\uDC4B");
        adminApprovePage.clickAdminMenuButton();
    }

    @And("the admin is on the admin panel")
    public void the_admin_clicks_on_admin_panel() {
        adminApprovePage.clickAdminPanelButton();
    }

    @When("the admin clicks on the \"Approval\" button")
    public void the_admin_clicks_on_the_approval_button() {
        adminApprovePage.clickApprovalButton();
    }

    @And("the admin searches for the email {string} in the search field")
    public void the_admin_search_for_the_email_by_entering_email_in_the_search_field(String userEmail) {
        adminApprovePage.searchRegisteredUser(userEmail);
        System.out.println("Searched for user with email: " + userEmail);
    }

    @And("the admin clicks on the \"Approve\" button")
    public void the_admin_clicks_on_approve_button() {
        adminApprovePage.clickApproveSelectedUserButton();
        //System.out.println("Clicked on the Approve button for the user with email: " + currentUserEmail);
    }

    @Then("the new user account should be successfully approved")
    public void the_new_user_account_with_email_is_successfully_approved() {
        String actualMessage = adminApprovePage.getApprovalSuccessMessage();
        String expectedMessage = "User approved successfully!";
        System.out.println("Actual registration success message: " + actualMessage);
        adminApprovePage.getApprovalSuccessMessage();
    }

    @When("the admin navigates to the \"Users\" section on the admin panel")
    public void the_admin_navigates_to_the_users_section_on_the_admin_panel() {
        adminApprovePage.clickUsersSectionButton();

    }
    @And("the admin searches for the same email {string} in the search field")
    public void the_admin_search_for_the_same_email_in_the_search_field(String userEmail) {
        adminApprovePage.searchApprovedUser(userEmail);
        System.out.println("Searched for user with email: " + userEmail);
    }

    @And("the admin changes the user role to \"Admin\"")
    public void the_admin_changes_the_user_role_to_admin() {
        //adminApprovePage.clickRoleMenuButton();
        //adminApprovePage.selectAdminRoleFromDropdown();
        adminApprovePage.selectAdminRole();
    }

    @And("the user role should be updated successfully")
    public void the_user_role_should_be_updated_successfully() {
        String actualMessage = adminApprovePage.getRoleUpdateSuccessMessage();
        String expectedMessage = "User role updated to \"admin\" successfully!";
        System.out.println("Actual registration success message: " + actualMessage);
        adminApprovePage.getRoleUpdateSuccessMessage();
    }

    @When("the admin clicks on the \"Back to Website\" button")
    public void the_admin_click_back_to_website_button() {
        adminApprovePage.clickBackToWebsiteButton();
    }

    @Then("the admin should be redirected to the landing page and log out")
    public void the_admin_is_redirected_to_the_landing_page_and_logged_out() {
        //String currentUrl = driver.getCurrentUrl();
        //assert currentUrl.equals("https://sbuda-frontend.vercel.app/") : "Admin was not redirected to the landing page";
        adminApprovePage.clickLogoutButton();
    }

}
