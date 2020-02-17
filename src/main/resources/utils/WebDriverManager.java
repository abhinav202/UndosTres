package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	private static WebDriver driver;
	/**
	 * Get web driver instance
	 * @return webDriver instance
	 */
	public static WebDriver getDriver() {
		if (driver == null){
			try{
					initDriver();
				}catch(Exception e){
					//logger.error(e.toString());
				}
		}
		return driver;
	}
	
	/**
	 * Initialize web driver
	 */
	public static void initDriver() throws Exception {		
		System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	/**
	 * Close web driver 	
	 */
	public static void closeDriver(){
		if(driver!=null)
			driver.quit();
		//logger.info("Web driver closed");
	}
}
