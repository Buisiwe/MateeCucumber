package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.LoginPage;
import pageObject.WebAutomationBasicFormPage;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public WebAutomationBasicFormPage webAutomationBasicFormPage = PageFactory.initElements(driver, WebAutomationBasicFormPage.class);
}
