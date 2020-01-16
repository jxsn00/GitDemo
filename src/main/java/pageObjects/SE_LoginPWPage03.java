package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SE_LoginPWPage03 {
	
	WebDriver driver;
	
	public SE_LoginPWPage03 (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input#user_password") WebElement i03_001_passwd;
	@FindBy(css="input.pl-button--full.pl-button--primary") WebElement i03_002_sign_in_btn;
	
	public WebElement passWD () {
		
		return i03_001_passwd;
	}

	public WebElement signIN () {
		
		return i03_002_sign_in_btn;
	}
	

}
