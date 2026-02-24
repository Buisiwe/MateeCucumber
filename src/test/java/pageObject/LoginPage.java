package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='nav-user-section']")
    WebElement navLoginButtonXpath;
    @FindBy(id = "login-email")
    WebElement usernameFieldId;
    @FindBy(id = "login-password")
    WebElement passwordFieldId;
    @FindBy(id = "login-submit")
    WebElement loginButtonId;
    @FindBy(xpath = "//h2[contains(text(),'Welcome back, ')]")
    WebElement verifyLoginIsSuccessfullyXpath;
    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/h2")
    WebElement welcomeTextXpath;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNavLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(navLoginButtonXpath));
        navLoginButtonXpath.click();
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(usernameFieldId));
        usernameFieldId.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordFieldId.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButtonId.click();
    }

    public void getLoginSuccessMessage(String expectedMessage) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifyLoginIsSuccessfullyXpath));
        String actualMessage = verifyLoginIsSuccessfullyXpath.getText();
        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Login successful: " + actualMessage);
        } else {
            System.out.println("Login failed. Expected: " + expectedMessage + ", but got: " + actualMessage);
        }
       welcomeTextXpath.isDisplayed();
    }

}
