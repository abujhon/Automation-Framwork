package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;

public class Hook {

	// this method is to set up a wait for page to be loaded before driver goes into action
	@Before
	public void setUp(){
	Driver.getInstance().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	
	// this method is for take a screenshot if there is nay test fail, screen shot will be stored in target folder
	@After
	public void tearDown(Scenario scenario){
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) 
					Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}
	
}
