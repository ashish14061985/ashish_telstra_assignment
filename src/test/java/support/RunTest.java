package support;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"support", "step_definitions"},
		tags = {"@regression"},
		monochrome = false,
		plugin = {"pretty","html:target/cucumber-report","json:target/cucumber-report/cucumber.json"}
		)
public class RunTest {
	
}