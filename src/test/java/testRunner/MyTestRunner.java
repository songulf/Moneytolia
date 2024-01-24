package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class MyTestRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/main/java/features",glue = {"stepDefinitions"},tags = "@Test",
            plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                    "junit:target/cucumber-reports/Cucumber.xml",
                    "html:target/cucumber-reports" }, monochrome = true

    )
    public class Runner {
    }


}
