package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SE_LoginPage02 {
	
	WebDriver driver;
	
	public SE_LoginPage02 (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[ga_action='Step1.CreateAnAccountClick']") WebElement i02_001_create_account;
	@FindBy(css="input#user_login") WebElement i02_002_youremail;
	@FindBy(css="input.pl-button--full.pl-button--primary") WebElement i02_003_next_button;
	@FindBy(css="a[ga_action='Step1.ContinueWithFacebookClick']") WebElement i02_004_facebook_logon;
	@FindBy(css="a[ga_action='Step1.ContinueWithGoogleClick']") WebElement i02_005_google_logon;
	
	public WebElement createAccount () {
		
		return i02_001_create_account;
	}
	
	
	public WebElement email () {
		
		return i02_002_youremail;
	}
	
	public WebElement nextButton () {
		
		return i02_003_next_button;
	}
	
	
	public WebElement facebookButton () {
		
		return i02_004_facebook_logon;
	}
	
	
	public WebElement googleButton () {
		
		return i02_005_google_logon;
	}
	
}
