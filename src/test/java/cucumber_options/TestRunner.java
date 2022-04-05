package cucumber_options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features",
    glue="step_definitions",
    plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json" }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
