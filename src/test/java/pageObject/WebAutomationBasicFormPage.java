package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebAutomationBasicFormPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[3]")
    WebElement navLearnMenuButtonXpath;
    @FindBy(xpath = "//button[2]/span[2]")
    WebElement navLearningMaterialDropdownXpath;
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
    @FindBy(xpath = "//*[@id=\"practice-form\"]/div[2]/label")
    WebElement checkboxForSkillsXpath;
    @FindBy(id = "comments")
    WebElement addCommentsId;
    @FindBy(xpath = "//*[@id=\"practice-form\"]/div[3]/label[2]")
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
        navLearnMenuButtonXpath.click();
    }

    public void selectLearningMaterialDropdown() {
        navLearningMaterialDropdownXpath.click();
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
        checkboxForSkillsXpath.click();
    }

    public void addComments(String comments) {
        addCommentsId.sendKeys(comments);
    }

    public void clickTermsAndConditionsCheckbox() {
        termsAndConditionsCheckboxXpath.click();
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
