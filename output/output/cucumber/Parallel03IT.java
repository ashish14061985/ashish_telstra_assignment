import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"E:/EclipseWorkspace/telstra_project/src/test/resources/features/Register_Account_Testcase.feature:4"},
plugin = {"html:target/cucumber-parallel/3.html"},
monochrome = true,
tags = {},
glue = { "step_definitions", "support" })
public class Parallel03IT {
}
