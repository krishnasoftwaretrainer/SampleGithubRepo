package runnerfiles;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/FeatureFiles/SwagTags.feature",
    glue = "stepDefinitions",
    //tags = "@Smoke or @Regression",
    //tags = "@Smoke",
   //tags = "@Regression",
   tags = "@Smoke and @Regression",
    //tags = "@Smoke and not @Regression"
    plugin = {"pretty","html:target/cucumber-report.html"}
)

public class TagsRunner {

}
