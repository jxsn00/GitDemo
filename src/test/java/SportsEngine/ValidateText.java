package SportsEngine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.SE_LandingPage01;
import resources.base;
import java.io.IOException;

public class ValidateText extends base {

	private static Logger _log = LogManager.getLogger(base.class.getName());
	private SE_LandingPage01 l;
	
	@BeforeTest
	public void setupTest ( ) throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		_log.info("Driver is initialized");
		l = new SE_LandingPage01(driver);
	}
	
	@Test
	public void validateMessageGetOut_01 () throws IOException, InterruptedException {
		_log.info("Get out and play - Test");
		Assert.assertTrue(l.getOutPlay().getText().contentEquals("Get out and Xplay."), "'Get out', Header Text Incorrect");
	}
	
	@Test
	public void validateMessageFindSportTx_02 () throws IOException, InterruptedException {
		_log.info("Find Sport - Test");
		_log.info("Text of Find Sport: "+l.findSportTx().getText());
		Assert.assertTrue(l.findSportTx().getText().contentEquals("Find a sport to get involved with today!"), "'Find Sport', Header Text Incorrect");	
	}
	
	@AfterTest
	public void teardown () throws InterruptedException {
		tic();
		_log.info("VAL: Driver is Almost closed");
		if (!hasQuit(driver)) {
			driver.quit();
			driver = null;
			_log.info("VAL: Driver IS CLOSED");
			_log.info("VAL: Driver IS CLOSED Line II for Cloning Test");
		}
		//driver.quit();
		//driver = null;
	}
	
}
  