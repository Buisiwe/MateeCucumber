//package runner;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import org.testng.annotations.Test;
//
//
////@CucumberOptions(
////        features = {"src/test/resources/feature/signUp.feature",
////                "src/test/resources/feature/login.feature",
////                "src/test/resources/feature/adminApprove.feature",
////                "src/test/resources/feature/newUserLogin.feature"},
////        glue = "stepDefinitions",
////        plugin = {"pretty", "html:target/cucumber-reports.html"},
////        monochrome = true,
////        publish = true,
////        dryRun = false
////)
//public class TestRunner extends AbstractTestNGCucumberTests {
//}

package runner;

import io.cucumber.core.cli.Main;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;
import utils.hooks;

public class TestRunner extends AbstractTestNGCucumberTests {

    private void runCucumber(String featurePath) {

        Main.run(new String[]{
                "--glue", "stepDefinitions",
                "--plugin", "pretty",
                "--plugin", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "--plugin", "html:target/cucumber-reports.html",
                "--plugin","json:target/cucumber.json",
                "--plugin","junit:target/cucumber.xml",
                featurePath
        }, Thread.currentThread().getContextClassLoader());
    }

    @Test(priority = 0)
    public void runCucumberTests() {

        runSignUpFeature();
        runLoginFeature();
        runAdminApproveFeature();
        runNewUserLoginFeature();
//        hookScreenshotAfterEachStep();
    }

//    private void hookScreenshotAfterEachStep() {
//        hooks.
//    }

    public void runSignUpFeature() {
        runCucumber("src/test/resources/feature/signUp.feature");
    }

    public void runLoginFeature() {
        runCucumber("src/test/resources/feature/login.feature");
    }

    public void runAdminApproveFeature() {
        runCucumber("src/test/resources/feature/adminApprove.feature");
    }

    public void runNewUserLoginFeature() {
        runCucumber("src/test/resources/feature/newUserLogin.feature");
    }
}