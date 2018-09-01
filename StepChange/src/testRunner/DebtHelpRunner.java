package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/feature",
		glue = {"stepDefinitions"},
		monochrome = true,
		strict = true,
		dryRun = false
		//tags = {}
			
		)

public class DebtHelpRunner {

}
