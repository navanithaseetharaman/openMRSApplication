package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src/test/java/features/login.feature",
					glue = {"stepDefinition", "hooks"},
					dryRun = false, 
					monochrome = true,
					tags= "@BuildVerificationTest or @regressionTest",
					publish = true,
					plugin = { "pretty", 						
							"json:target/cucumber/cucumberReport.json",
							"junit:target/cucumber/cucumberReport.xml",
							"html:target/cucumber/cucumberReport.html" })
// extends AbstractTestNGCucumberTests   

public class runner {

}
