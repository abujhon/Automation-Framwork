package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FourStayPage;
import pages.FourStaySearchResultPage;
import utilities.Driver;

public class FourStayStepDef {
	
	// url of the application
	String url = "https://4stay.com/";
	// create instance of fourStay home-page object
	FourStayPage homePage = new FourStayPage();
	// create instance of fourStay search page object
	FourStaySearchResultPage searchPage = new FourStaySearchResultPage();
	// declare a variable to store search count
	int searchCount;

	@Given("^I am on the fourstay homepage$")
	public void i_am_on_the_fourstay_homepage() throws Throwable {
		Driver.getInstance().get(url);
	    
	}

	@And("^I enter school name \"([^\"]*)\"$")
	public void i_enter_school_name(String schoolName) throws Throwable {
		// send school name provides in scenario
	   homePage.schoolName.sendKeys(schoolName);
	}

	@And("^I enter available start and end dates$")
	public void i_enter_available_start_and_end_dates() throws Throwable {
	   // I click the date box
		homePage.dateBox.click();
		// then i provide available dates from the date box
		homePage.startDate.click();
		homePage.endDate.click();
	}
	
	@And("^I choose bed option for two beds$")
	public void i_choose_bed_option_for_two_beds() throws Throwable {
		// i click the bed option menu
	    homePage.bedOptionMenu.click();
	    
	    // then I choose two bed option
	    // option list is another frame so in order to click that, i have to switch to the frame
	    //Driver.getInstance().switchTo().frame("intercom-frame");
	    // first i create webDriver wait instance
	    //WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 5);
	    // before I wait the element to be clickable 
	    //wait.until(ExpectedConditions.elementToBeClickable(homePage.bedOption));
	    // then i click 2 bed option
	    //homePage.bedOption.click();
	    // go back to default frame
	   // Driver.getInstance().switchTo().parentFrame();
	}

	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
	   homePage.searchBtn.click();
	}

	@Then("^I should see the result count$")
	public void i_should_see_the_result_count() throws Throwable {
	    
	    // first i create webDriver wait instance
	    WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 5);
	    wait.until(ExpectedConditions.invisibilityOf(searchPage.searchCount));
	    
	   // check if the result count message is there 
		Assert.assertTrue(searchPage.searchCount.isDisplayed());
		
		// clean up the result message and store the integer value to search count variable
		// first get the full text of result message
		String message = searchPage.searchCount.getText();
		// split the message into string array by space
		String [] temp = message.split(" ");
		// get the last second string from the array and parse it into integer and store the value to search count
		searchCount = Integer.parseInt(temp[temp.length-2]);
		System.out.println(searchCount);
		
	}
	
	@Then("^the results should contain price tag, availablity tag, minimum stay tag as follows$")
	public void the_results_should_contain_price_tag_availablity_tag_minimum_stay_tag_as_follows(List<String> args) throws Throwable {
		
		List<String> arguments = new ArrayList<>();
		// find the element and get text from it and store it into list of string
		for (WebElement priceTag : searchPage.allResultsPriceTag) {
			arguments.add(priceTag.getText());
		}
		for (WebElement avail : searchPage.allResultsAvailableTag) {
			arguments.add(avail.getText());
		}
		for (WebElement stay : searchPage.allResultsMinimumStayTag) {
			arguments.add(stay.getText());
		}
		
		// check if the list of String contains the list of argument provided in scenario
		Assert.assertTrue(arguments.contains(args));
	}


	@Then("^actual results should match the result count$")
	public void actual_results_should_match_the_result_count() throws Throwable {
	    // find how many home-stay there and verify with the count showed on the page
		List<String> count = new ArrayList<>();
		// get all the available price tag and put it into a list
		for (WebElement elem : searchPage.allResultsPriceTag) {
			count.add(elem.getText());
		}
		
		// verify the count we got earlier with the size of the list
		Assert.assertTrue(count.size()==searchCount);
	}
}
