package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebAutomationBasicFormPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement navLearnMenuButtonXpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement navLearningMaterialDropdownXpath;
    @FindBy(xpath = "//*[@id=\"tab-btn-password\"]/span[2]")
    WebElement navWebAutomationBasicFormButtonXpath;
    @FindBy(id = "name")
    WebElement FullNameFieldId;
    @FindBy(id = "email")
    WebElement emailAddressFieldId;
    @FindBy(id = "age")
    WebElement ageFieldId;
    @FindBy(id = "gender")
    WebElement selectGenderDropdownId;
    @FindBy(id = "country")
    WebElement selectCountryDropdownId;
    @FindBy(id = "experience")
    WebElement selectExperienceDropdownId;
    @FindBy(id = "skill-selenium")
    WebElement checkboxForSkillsID;
    @FindBy(id = "comments")
    WebElement addCommentsId;
    @FindBy(xpath = "//*[@id='practice-form']/div[3]//input[@type='checkbox']")
    WebElement termsAndConditionsCheckboxXpath;
    @FindBy(id = "submit-btn")
    WebElement submitFormButtonFieldId;
    @FindBy(id = "reset-btn")
    WebElement resetFormButtonFieldId;
    @FindBy(id = "validate-btn")
    WebElement validateFormButtonFieldId;
    @FindBy(xpath = "//*[@id=\"practice-form\"]/details/summary")
    WebElement verifySubmitSuccessMessageXpath;


    public WebAutomationBasicFormPage(WebDriver driver) {this.driver = driver;}

    public void navLearnMenu() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(navLearnMenuButtonXpath));
        navLearnMenuButtonXpath.click();
    }

    public void selectLearningMaterialDropdown() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(navLearningMaterialDropdownXpath));
        navLearningMaterialDropdownXpath.click();
    }

    public void clickNavWebAutomationBasicFormButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(navWebAutomationBasicFormButtonXpath));
        navWebAutomationBasicFormButtonXpath.click();
    }

    public void enterFullName(String fullName) {
        FullNameFieldId.sendKeys(fullName);
    }

    public void enterEmailAddress(String emailAddress) {
        emailAddressFieldId.sendKeys(emailAddress);
    }

    public void selectAge(String age) {
        ageFieldId.sendKeys(age);
    }

    public void selectGender (String gender) {
        selectGenderDropdownId.sendKeys(gender);
    }

    public void selectCountry (String country) {
        selectCountryDropdownId.sendKeys(country);
    }

    public void selectExperience (String experience) {
        selectExperienceDropdownId.sendKeys(experience);
    }


    public void clickCheckboxForSkills() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(checkboxForSkillsID));

    }

    public void addComments(String comments) {
        addCommentsId.sendKeys(comments);
    }


    public void clickTermsAndConditionsCheckbox() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(termsAndConditionsCheckboxXpath));
        if (!termsAndConditionsCheckboxXpath.isSelected()) {
            termsAndConditionsCheckboxXpath.click();
        }
    }

    public void clickSubmitFormButton() {
        submitFormButtonFieldId.click();
    }

        public void clickResetFormButton() {
            resetFormButtonFieldId.click();
        }

    public void clickValidateFormButton() {
        validateFormButtonFieldId.click();
    }

    public String getSubmitSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(verifySubmitSuccessMessageXpath));
        return verifySubmitSuccessMessageXpath.getText();
    }

}
