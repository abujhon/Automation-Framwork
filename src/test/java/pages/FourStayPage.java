package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;


public class FourStayPage {

	public FourStayPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	// elements needed in four stay home page
	

	@FindBy(xpath = "//a[@href='#login-modal']")
	public WebElement loginLink;

	@FindBy(id = "user_email")
	public WebElement userNameBox;

	@FindBy(id = "user_password")
	public WebElement passwordBox;

	@FindBy(css = ".btn.btn-primary")
	public WebElement loginBtn;

	@FindBy(css = ".search-input.ng-pristine")
	public WebElement schoolName;

	@FindBy(css = ".form-control.date-picker ")
	public WebElement dateBox;

	@FindBy(xpath = "//table[@class='table-condensed'][1]/tbody/tr[5]/td[5]")
	public WebElement startDate;
	
	@FindBy(xpath = "//div[@class='calendar right']//td[contains(text(),'10')]")
	public WebElement endDate;

	@FindBy(id = "intercom-frame")
	public WebElement frame;
	
	@FindBy(css = ".select2-selection.select2-selection--single")
	public WebElement bedOptionMenu;
	
	@FindBy(xpath = "//li[@id='select2-uzcn-result-xk0f-number:2']")
	public WebElement bedOption;
	
	@FindBy(xpath = "//button[@class='btn search-btn']")
	public WebElement searchBtn;
}
