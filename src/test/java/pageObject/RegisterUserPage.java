package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public RegisterUserPage(WebDriver driver) {
        this.driver = driver;}

    public void LandingPageHeading(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(landingPageHeadingXpath));
        landingPageHeadingXpath.isDisplayed();
    }
    public void registrationHeading () {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(registrationHeadingId));
        registrationHeadingId.isDisplayed();
    }


    public  void registration_details(String firstName,String lastName, String email, String password, String confirmPassword, String group) {
        firstnameFieldId.sendKeys(firstName);
        lastnameFieldId.sendKeys(lastName);
        registerEmailAddressFieldId.sendKeys(email);
        registerPasswordFieldId.sendKeys(password);
        registerConfirmPasswordFieldId.sendKeys(confirmPassword);
        registerGroupDropdownId.sendKeys(group);
    }

    public void clickRegisterSubmitButton() {
        registerSubmitButtonId.click();
    }
    public String getRegistrationSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(registrationHeadingId));
        return registrationHeadingId.getText();
    }

}
