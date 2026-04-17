package runnerfiles;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/FeatureFiles/SwagLoginTestData.feature",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)


public class CucumberRunnerFileTestNG extends AbstractTestNGCucumberTests
{

}
