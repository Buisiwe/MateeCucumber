package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.LoginPage;
import pageObject.RegisterUserPage;
import pageObject.WebAutomationBasicFormPage;
import pageObject.AdminApprovePage;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    protected final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    public RegisterUserPage registerUserPage = PageFactory.initElements(driver, RegisterUserPage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public WebAutomationBasicFormPage webAutomationBasicFormPage = PageFactory.initElements(driver, WebAutomationBasicFormPage.class);
    public AdminApprovePage adminApprovePage = PageFactory.initElements(driver, AdminApprovePage.class);
}

