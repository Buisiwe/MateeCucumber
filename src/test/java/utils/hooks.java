package utils;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import runner.TestRunner;

public class hooks extends TestRunner {
    @AfterStep
    public void addScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            Object driver = new Object();
            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "Failure Screenshot");
        }
    }
}
