package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminApprovePage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[2]")
    WebElement adminMenuButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[4]/span[2]")
    WebElement adminPanelButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/nav/button[3]")
    WebElement approveButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/div/div/input")
    WebElement searchUserFieldXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[3]/table/tbody/tr/td[1]/input")
    WebElement selectUserCheckboxXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[3]/table/tbody/tr/td[6]/button[1]")
    WebElement approveSelectedUserButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]")
    WebElement approvalSuccessMessageXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/div[2]/button")
    WebElement backToWebsiteButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]/span[2]")
    WebElement logoutButtonXpath;

    public AdminApprovePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAdminMenuButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(adminMenuButtonXpath));
        adminMenuButtonXpath.click();
    }

    public void clickAdminPanelButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(adminPanelButtonXpath));
        adminPanelButtonXpath.click();
    }

    public void clickApproveButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(approveButtonXpath));
        approveButtonXpath.click();
    }

    public void searchRegisteredUser(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(searchUserFieldXpath));
        searchUserFieldXpath.sendKeys(username);
    }

    public void clickSelectUserCheckbox(String userEmail) {
        driver.findElement(By.xpath("//*[@id='skill-" + userEmail.toLowerCase() + "']")).click();
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(selectUserCheckboxXpath));
//        selectUserCheckboxXpath.click();
    }

    public void clickApproveSelectedUserButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(approveSelectedUserButtonXpath));
        approveSelectedUserButtonXpath.click();
    }

    public String getApprovalSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(approvalSuccessMessageXpath));
        //String actualMessage = verifyLoginIsSuccessfullyXpath.getText();
//      if (actualMessage.equals(expectedMessage)) {
//            System.out.println("Login successful: " + actualMessage);
//        } else {
//            System.out.println("Login failed. Expected: " + expectedMessage + ", but got: " + actualMessage);
//        }
        approvalSuccessMessageXpath.isDisplayed();
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(approvalSuccessMessageXpath));
        return approvalSuccessMessageXpath.getText();
    }

    public void clickBackToWebsiteButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(backToWebsiteButtonXpath));
        backToWebsiteButtonXpath.click();
    }

    public void clickLogoutButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logoutButtonXpath));
        logoutButtonXpath.click();
    }



}
