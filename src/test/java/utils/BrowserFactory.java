package utils;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    WebDriver driver = null;

    public WebDriver startBrowser(String browser,String url) {
            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeBrowser();
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxBrowser();
            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeBrowser();
            } else {
                System.out.println("Invalid browser name: " + browser);
            }
        return driver;
    }
}
