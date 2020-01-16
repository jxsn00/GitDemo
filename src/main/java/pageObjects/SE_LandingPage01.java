package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SE_LandingPage01 {
	
	WebDriver driver;
	
	public SE_LandingPage01 (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
/*	@FindBy(linkText="Sign In") WebElement i01_001_signin;
	@FindBy(css=".nb-link") WebElement i01_002_clubandleague;
	@FindBy(css=".nb-sportngin") WebElement i01_003_se_logo;    
//	@FindBy(css=".pl-addon-field__input.ng-pristine.ng-valid.ng-empty.ng-touched") WebElement i01_004_sportfield;
//	By i01_004_sportoption= By.cssSelector("input.pl-addon-field__input.ng-pristine.ng-valid.ng-empty.ng-touched");
	By i01_004_sportoption= By.xpath("//input[@placeholder='Find sports & organizations']");
	@FindBy(css=".pl-addon-field__input.js-location-field-input.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required") WebElement i01_005_cityzip;
	@FindBy(css="gender_female") WebElement i01_006_gfemale;
	@FindBy(css="gender_male") WebElement i01_007_gmale;
	@FindBy(css="age") WebElement i01_008_age;
	@FindBy(css=".pl-button--primary pl-button--full pl-spinner-button") WebElement i01_009_age_findsport;
	@FindBy(css=".cta-button") WebElement i01_010_makedonation;*/
	

	@FindBy(linkText="Sign In") WebElement i01_001_signin;
	@FindBy(css=".nb-link") WebElement i01_002_clubandleague;
	@FindBy(css=".nb-sportngin") WebElement i01_003_se_logo;
	@FindBy(css="h1.pl-heading--primary-lg70") WebElement i01_004_get_out_play;
	@FindBy(css="div[class*='form-section'] div header hgroup h2") private WebElement i01_005_find_a_sport;
	//@FindBy(css="NA") WebElement i01_005_sportoption;
	By i01_006_sportoption= By.xpath("//input[@placeholder='Find sports & organizations']");
	@FindBy(css=".pl-addon-field__input.js-location-field-input.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required") private WebElement i01_007_cityzip;
	@FindBy(css="input#gender_female") private WebElement i01_008_gfemale;
	@FindBy(css="input#gender_male") private WebElement i01_009_gmale;
	@FindBy(css="input#age") private WebElement i01_010_age;
	@FindBy(css="button.pl-button--primary.pl-button--full.pl-spinner-button") private WebElement i01_011_age_findsports;
	@FindBy(css=".cta-button") private WebElement i01_012_makedonation;
	
	public WebElement signIN () {
		
		return i01_001_signin;
	}
	
	public WebElement clubAndLeague () {
		return i01_002_clubandleague;
	}
	
	public WebElement seLogo () {
		return i01_003_se_logo;
	}

	public WebElement getOutPlay () {
		return i01_004_get_out_play;
	}
	
	public WebElement findSportTx () {
		return i01_005_find_a_sport;
	}
	
	public WebElement sport () {
		return driver.findElement(i01_006_sportoption);
	}

	public WebElement cityZip() {
		return i01_007_cityzip;
	}
	
	public WebElement gFemale () {
		return  i01_008_gfemale;
	}
	
	public WebElement gMale () {
		return i01_009_gmale;
	}	
	
	public WebElement Age () {
		return i01_010_age;
	}
	
	public WebElement findSports () {
		return i01_011_age_findsports;
	}
	
	public WebElement makeDonation () {
		return i01_012_makedonation;
	}
		
}
