package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FourStaySearchResultPage {
	
	public FourStaySearchResultPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	// elements needed in four stay search result page
	
	@FindBy(xpath = "//h7[@class='m-b-10 text-center ng-binding']")
	public WebElement searchCount;
	
	@FindBy(css = "p.ng-binding")
	public List<WebElement> allResultsPriceTag;
	

	@FindBy(xpath = "//span[contains(text(),'Available From')]")
	public List<WebElement> allResultsAvailableTag;
	
	@FindBy(xpath = "//span[contains(text(),'Minimum Stay')]")
	public List<WebElement> allResultsMinimumStayTag;
}
