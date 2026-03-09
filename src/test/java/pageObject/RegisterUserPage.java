package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RegisterUserPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"overview-hero\"]/h1")
    WebElement landingPageHeadingXpath;
    @FindBy(id = "registration-heading")
    WebElement registrationHeadingId;
    @FindBy(id = "register-firstName")
    WebElement firstnameFieldId;
    @FindBy(id = "register-lastName")
    WebElement lastnameFieldId;
    @FindBy(id = "register-email")
    WebElement registerEmailAddressFieldId;
    @FindBy(id = "register-password")
    WebElement registerPasswordFieldId;
    @FindBy(id = "register-confirmPassword")
    WebElement registerConfirmPasswordFieldId;
    @FindBy(id = "register-group")
    WebElement registerGroupDropdownId;
    @FindBy(id = "register-submit")
    WebElement registerSubmitButtonId;
    @FindBy(id = "signup-toggle")
    WebElement signUpLinkId;

    public RegisterUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signUpLink() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(signUpLinkId));
        signUpLinkId.click();
    }

    public void LandingPageHeading() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(landingPageHeadingXpath));
        landingPageHeadingXpath.isDisplayed();
    }

    public void registrationHeading() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(registrationHeadingId));
        registrationHeadingId.isDisplayed();
    }


    public void enterFirstName(String firstName) throws InterruptedException {
        firstnameFieldId.sendKeys(firstName);

    }

    public void enterLastName(String lastName) throws InterruptedException {
        lastnameFieldId.sendKeys(lastName);

    }

    public void enterEmail(String email) throws InterruptedException {
        registerEmailAddressFieldId.sendKeys(email);

    }

    public void enterPassword(String password) throws InterruptedException {
        registerPasswordFieldId.sendKeys(password);

    }

    public void enterConfirmPassword(String confirmPassword) throws InterruptedException {
        registerConfirmPasswordFieldId.sendKeys(confirmPassword);

    }

    public void selectGroup(String group) {
        WebElement dropdown = driver.findElement(By.id("register-group"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(group);
    }

    public void clickRegisterSubmitButton() {
        registerSubmitButtonId.click();
    }

    public String getRegistrationSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(registrationHeadingId));
        return registrationHeadingId.getText();
    }

    public void confirmMessageIsDisplayed(String expectedMessage) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the alert is present
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Get alert text and assert it matches the expected message
        String alertText = alert.getText();
        Assert.assertEquals(alertText, expectedMessage);

        // Accept (close) the alert
        alert.accept();

    }

}
