package SportsEngine;

import org.testng.annotations.Test;

import pageObjects.SE_LandingPage01;
import pageObjects.SE_LoginPWPage03;
import pageObjects.SE_LoginPage02;
import resources.base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends base {
	
	private static Logger _log = LogManager.getLogger(base.class.getName());

	public WebDriver driver;
	
	@Test
	public void basePageNavigationForward_01 () throws IOException, InterruptedException {
		tic();
		_log.info("select sport forward: BEFORE");
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		_log.info("select sport forward: AFTER");
		/*(SE_LandingPage01 l = new SE_LandingPage01(driver);
		l.sport().sendKeys("Hockey");
		l.cityZip().sendKeys("55102");		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", l.gFemale());	
		l.Age().sendKeys("12");
		l.findSports().click();
		tic(1);*/
	} 
	/*
	@Test
	public void basePageNavigationBackward02 () throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		_log.info("select sport backwards");
		SE_LandingPage01 l = new SE_LandingPage01(driver);
		l.Age().sendKeys("12");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", l.gMale());
		l.cityZip().sendKeys("55102");	
		l.sport().sendKeys("Basketball");
		l.findSports().click();
		tic(1);
		driver.close();
		driver=null;
	} */
/*
	@Test(dataProvider="getDataSignIn")
	public void basePageNavigationSign01 (String username, String password) throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		_log.info("signin " + username);
		SE_LandingPage01 l = new SE_LandingPage01(driver);
		l.signIN().click();
		SE_LoginPage02 lp = new SE_LoginPage02(driver);
		lp.email().sendKeys(username);
		lp.nextButton().click();
		SE_LoginPWPage03 lpp = new SE_LoginPWPage03(driver);
		lpp.passWD().sendKeys(password);
		lpp.signIN().click();
		tic(1);
		driver.quit();
	}*/
	
	@DataProvider
	public Object[][] getDataSignIn (){
		
		Object[][] testData = new Object[1][2];  
		//set 1
		testData[0][0] = "usernamejbs01@gmail.com";
		testData[0][1] = "password";
		
		/*//set 2
		testData[1][0] = "asdfasdf@gmail.com";
		testData[1][1] = "password";
		
		//set 3
		testData[2][0] = "jxsn00@gmail.com";
		testData[2][1] = "passoword";
								*/
		return testData;
		
	}
	
	@AfterTest
	public void teardown () throws InterruptedException {
		tic();
		_log.info("HOM: Driver is Almost Almost closed");
		if (!hasQuit(driver)) {
			driver.quit();
			driver = null;
			_log.info("HOM: Driver IS CLOSED CLOSED");
		}
		//driver.quit();
		//driver = null;
	}
		
	
}
  