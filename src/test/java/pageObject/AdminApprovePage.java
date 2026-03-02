package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[3]/table/tbody/tr/td[6]/button[1]")
    WebElement approveSelectedUserButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]")
    WebElement approvalSuccessMessageXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/div[2]/button")
    WebElement backToWebsiteButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]/span[2]")
    WebElement logoutButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[2]/nav/button[2]")
    WebElement usersSectionButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/select")
    WebElement changeRoleButton;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/select")
    WebElement changeRoleToAdminOption;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[2]/table/tbody/tr[5]/td[4]/select")
    WebElement roleUpdateSuccessMessageXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[1]/div[2]/input")
    WebElement searchApprovedUserXpath;

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

    public void clickApprovalButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(approveButtonXpath));
        approveButtonXpath.click();
    }

    public void searchRegisteredUser(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(searchUserFieldXpath));
        searchUserFieldXpath.sendKeys(email);
    }

    public void clickApproveSelectedUserButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(approveSelectedUserButtonXpath));
        approveSelectedUserButtonXpath.click();
        System.out.println("approveSelectedUserButtonXpath");
    }

    public String getApprovalSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(approvalSuccessMessageXpath));
        return approvalSuccessMessageXpath.getText();
    }

    public void clickUsersSectionButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(usersSectionButtonXpath));
        usersSectionButtonXpath.click();
    }

    public void searchApprovedUser(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(searchApprovedUserXpath));
        searchApprovedUserXpath.sendKeys(email);
    }


    public void clickRoleMenuButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(changeRoleToAdminOption));
        changeRoleToAdminOption.click();
    }

//    public void selectAdminRoleFromDropdown() {
//        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[4]/select"));
//        Select select = new Select(dropdown);
//        select.selectByIndex(2);
//        select.selectByVisibleText("Admin");
//        changeRoleButton.click();
//    }
public void selectAdminRoleFromDropdown() {
    WebElement roleDropdown = driver.findElement(By.xpath("//select[contains(@class,'role-dropdown')]"));
    WebElement dropdown = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(roleDropdown));
    //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(dropdown));
    Select select = new Select(dropdown);
    select.selectByVisibleText("Admin");
    //changeRoleButton.click();
    //changeRoleToAdminOption.click();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
//            By.xpath("//*[@id='app-root']/div/div[3]/div/div[2]/table/tbody/tr[1]/td[4]/select")
//    ));
//
//    Select select = new Select(dropdown);
//    select.selectByVisibleText("Admin"); // Select directly by visible text
//
//    changeRoleToAdminOption.click(); // Click only if this is required after selection
//    System.out.println(changeRoleButton);
}
    public String getRoleUpdateSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(roleUpdateSuccessMessageXpath));
        return roleUpdateSuccessMessageXpath.getText();

    }

    public void clickBackToWebsiteButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(backToWebsiteButtonXpath));
        backToWebsiteButtonXpath.click();
    }

    public void clickLogoutButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(logoutButtonXpath));
        logoutButtonXpath.click();
    }


}
