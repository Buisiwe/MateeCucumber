package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/signUp.feature",
                "src/test/resources/feature/login.feature",
                "src/test/resources/feature/adminApprove.feature",
                "src/test/resources/feature/newUserLogin.feature"},
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        publish = true,
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {

}