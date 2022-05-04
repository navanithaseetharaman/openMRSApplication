package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src/test/java/features/login.feature",
					glue = {"stepDefinition" },
					dryRun = false, 
					monochrome = true,
					tags= ("@smokeTest"),
					plugin = { "pretty", 
							"html:target/cucumber-reports" })
// extends AbstractTestNGCucumberTests   

public class runner {

}
