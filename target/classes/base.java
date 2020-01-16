package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class base {

	private static Logger _log = LogManager.getLogger(base.class.getName());

	public static WebDriver driver;
	public static String basename = getBasename();
	public Properties prop = new Properties();
	
	public static void tic(int tt) throws InterruptedException  {
		TimeUnit.SECONDS.sleep(tt);
	}
	
	public static void tic() throws InterruptedException  {
		TimeUnit.SECONDS.sleep(1);
	}
	
	public static boolean hasQuit(WebDriver driver) {
	    return ((RemoteWebDriver) driver).getSessionId() == null;
	}
	
	public static String getBasename () {
		
		String os_path = System.getProperty("user.dir");
    	_log.info("OS: MacOS");   	
		return os_path;
		//return "/Users/jasonshiggs/Documents/Shelf/Courses/16. Selenium/Projects/maven_source_folder/myJavaProject003SE";
	}
	
	public static void getScreenshot (String classname) throws IOException {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File(basename+"/log/temp_"+classname+".png"));
	}
	
	public WebDriver initializeDriver() throws IOException {
			
		FileInputStream fis = new FileInputStream(basename+"/src/main/java/resources/sportsengine_project003se.properties");
		prop.load(fis);
		
		//String browserName = prop.getProperty("browser", "chrome");
		String browserName = System.getProperty("browser");  //comand line: mvn test -Dbrowser="chrome"

		String siteURL = prop.getProperty("url1");
		_log.info("Browser: " + this.getClass()+ " " + browserName);

		if (browserName.equalsIgnoreCase("firefox")) {
			  FirefoxOptions options = new FirefoxOptions().setProfile(new FirefoxProfile());
			  driver = new FirefoxDriver(options);
		} else if (browserName.equalsIgnoreCase("safari")) {
			  System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
			  SafariOptions options = new SafariOptions();
			  driver = new SafariDriver(options);
		} else if (browserName.contains("chrome")) {
			_log.info("Browser: " + browserName+" chome here1");
			System.setProperty("webdriver.driver.chrome", basename+"/chromedriver");
			_log.info("the path"+basename+"/chromedriver");
			ChromeOptions options = new ChromeOptions();
		   
			if (browserName.contains("chromeheadless")) {
				_log.info("Browser: " + browserName+" chome here2");
				options.addArguments("headless");
			 
			} 
			driver = new ChromeDriver(options); 
   
		}
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.get(siteURL);
		return driver;
	}
	
}
