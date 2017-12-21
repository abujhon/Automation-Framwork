package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Musa
 *
 */

  /*
   * this is a class to invoke the tests and pass all necessary path of the feature files and step definitions
   * so that cucumber can invoke and run the tests 
   * and more the plug-in is added to produce a HTML report for the client
   */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features",
	    tags = "@Smoketest",
		glue="com.disney/src/test/java/stepDefinitions",
		plugin = {"html:target/cucumber-reports", "json:target/cucumber.json"},
		dryRun=false
		)

public class CukesRunner {

}
