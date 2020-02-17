package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.AutomationRunner;
import utils.ExtentReportsLogger;
import utils.WebDriverManager;

public class PaymentPage {

	WebDriver driver = null;
	
	private ExtentReportsLogger logger;
	
	public PaymentPage() { logger = AutomationRunner.getLogger(); }
	 
	
	@Before
	public void setup() {
		String testName = "PaymentPage Test";		
		logger.createTest(testName, "Check if PaymentPage is working fine" ,"PaymentPage");
		
		driver = WebDriverManager.getDriver();
	}
	
	@Given("Verify Payment Page landed")
	public void verify_Payment_Page() {
		if(driver.findElement(By.xpath("//span[contains(@class,'messageShowTop')]//b[text()='5523261151' or text()='Telcel']")).isDisplayed())
		{		
			logger.logInfoMessage("Payment Page landed successfully");
		
			//Click on Tarjeta tab
			driver.findElement(By.xpath("//div[@class='list-group']//a//p[text()='Tarjeta']")).click();
		}
	else {		
		logger.logFailMessage("Payment Page not landed");
		}
		
	}
	
	@When("Enter cardname as {string}")
	public void enter_cardname(String cardName) {
		driver.findElement(By.xpath("//div[@class='field form-group']//input[@name='cardname']")).sendKeys(cardName);
		logger.logInfoMessage(cardName + " Cardname entered");
	}

	@And("Enter cardnumber as {string}")
	public void enter_cardnumber(String cardNumber) {
		driver.findElement(By.xpath("//div[@class='field input-group']//input[@name='cardno']")).sendKeys(cardNumber);
		logger.logInfoMessage(cardNumber +  " Cardnumber entered");
	}

	@And("Enter month as {string} and year as {string}")
	public void enter_month_and_year(String month, String year) {
		WebElement monthElement = driver.findElement(By.xpath("//div[contains(@class,'row')]//div[contains(@class,'form')]//input[@name='expmonth']"));
		monthElement.sendKeys(month);
		logger.logInfoMessage(month + " as month entered");
		
		WebElement yearElement = driver.findElement(By.xpath("//div[contains(@class,'row')]//div[contains(@class,'form')]//input[@name='expyear']"));
		yearElement.sendKeys(year);
		logger.logInfoMessage(year + " as year entered");
	}

	@And("Enter CVV as {string}")
	public void enter_CVV(String cvv) {
		driver.findElement(By.xpath("//div[contains(@class,'row')]//div[contains(@class,'form')]//input[@name='cvvno']")).sendKeys(cvv);				
		logger.logInfoMessage(cvv + " as CVV entered");
	}

	@And("Enter cardmail as {string}")
	public void enter_cardmail(String mail) {
		driver.findElement(By.xpath("//label[contains(text(),'Correo')]//ancestor::div[contains(@class,'info')]//input[@name='txtEmail']")).sendKeys(mail);
		logger.logInfoMessage(mail + " as Cardmail entered");
	}

	@Then("Click on Pagar con Tarjeta")
	public void click_on_Pagar_con_Tarjeta() {
	    driver.findElement(By.xpath("//button[@name='formsubmit']")).click();
	    logger.logInfoMessage("Pagar con Tarjeta clicked successfully");
	}
	
	@After
	public void cleanUp() {						
		logger.flushLogResults();					
	}
}
