package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.AutomationRunner;
import utils.ExtentReportsLogger;
import utils.WebDriverManager;

public class SuccessPage {

	WebDriver driver = null;
	WebDriverWait wait = null;
	private ExtentReportsLogger logger;
	
	public SuccessPage() { logger = AutomationRunner.getLogger(); }
	 
	
	@Before
	public void setup() {		
		String testName = "SuccessPage Test";		
		logger.createTest(testName, "Check if SuccessPage is working fine" ,"SuccessPage");
		
		driver = WebDriverManager.getDriver();
		wait = new WebDriverWait(driver, 15);
	}
	
	@Given("Verify pop up appeared")
	public void verify_Payment_Page() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fade in')]//div[@class='modal-body']")));
		if(driver.findElement(By.xpath("//div[contains(@class,'fade in')]//div[@class='modal-body']")).isDisplayed())
		{			
			logger.logInfoMessage("Pop up appeared successfully");
		}
	else {		
		logger.logFailMessage("Pop up did not appear");
		}
	}
	
	@When("Enter email as {string}")
	public void enter_email(String email) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'active')]//form[@role='form']//input[@name='email']")));
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//form[@role='form']//input[@name='email']")).sendKeys(email);
		logger.logInfoMessage(email + " Email entered in the pop-up");
	}
	
	@And("Enter password as {string}")
	public void enter_password(String password) {
		WebElement passwordElement = driver.findElement(By.xpath("//div[contains(@class,'active')]//form[@role='form']//input[@name='password']"));
		
		//Handling the captcha
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.sendKeys(passwordElement, password)
										.sendKeys(Keys.TAB)
										.sendKeys(Keys.SPACE)
										.build();
		seriesOfActions.perform();
		
		logger.logInfoMessage("Password entered in the pop-up");
		logger.logInfoMessage("Captcha handled successfully");
	}
	
	@Then("Click on Acceso")
	public void click_accesoButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		logger.logInfoMessage("Acceso button clicked. Details submitted");
	}
	
	@Then("Recharge is successful")
	public void verify_recharge_success() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'success')]")));
		if(driver.findElement(By.xpath("//span[contains(@class,'success')]")).isDisplayed())
			logger.logInfoMessage("Recharge is successful !");
	}
	
	@After
	public void cleanUp() {				
		logger.flushLogResults();	
		driver.close();
	}
}
