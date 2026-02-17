package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Base;


public class loginSteps extends Base {
    //WebDriver driver;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        //driver = new ChromeDriver();
        //driver.get("https://www.ndosiautomation.co.za/#practice");
        loginPage.clickNavLoginButton();
    }

    @When("the user enters valid email {}")
    public void the_user_enters_valid_email(String email) {

       //driver.findElement(By.id("login-email")).sendKeys(email);
        loginPage.enterUsername(email);
    }

    @And("the user enters valid password {}")
    public void the_user_enters_valid_password(String password) {
        //driver.findElement(By.id("login-password")).sendKeys(password);
        loginPage.enterPassword(password);

    }

    @And("the user click the login button")
    public void the_user_click_the_login_button() {
        //driver.findElement(By.id("login-submit")).click();
        loginPage.clickLoginButton();
    }

    @Then("the user is successfully logged in")
    public void the_user_is_successfully_logged_in() {
        //driver.findElement(By.id("dashboard")).isDisplayed();

    }
}
