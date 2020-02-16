package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentPage {

	WebDriver driver = new ChromeDriver();
	
	@Given("Verify Payment Page landed")
	public void verify_Payment_Page() {
		if(driver.findElement(By.xpath("//span[contains(@class,'messageShowTop')]//b[text()='5523261151' or text()='Telcel']")).isDisplayed())
		{
			System.out.println("====Payment page landed successfully====");
		
			//Click on Tarjeta tab
			driver.findElement(By.xpath("//div[@class='list-group']//a//p[text()='Tarjeta']")).click();
		}
	else {
		System.out.println("====Payment page not landed====");
		driver.close();
		}
	}
	
	@When("Enter cardname as {string}")
	public void enter_cardname(String cardName) {
		driver.findElement(By.xpath("//div[@class='field form-group']//input[@name='cardname']")).sendKeys(cardName);
	}

	@And("Enter cardnumber as {string}")
	public void enter_cardnumber(String cardNumber) {
		driver.findElement(By.xpath("//div[@class='field input-group']//input[@name='cardno']")).sendKeys(cardNumber);
	}

	@And("Enter month as {string} and year as {string}")
	public void enter_month_and_year(String month, String year) {
		WebElement monthElement = driver.findElement(By.xpath("//div[contains(@class,'field')]//input[@name='expmonth' and @style]"));
		monthElement.sendKeys(month);
		
		WebElement yearElement = driver.findElement(By.xpath("//div[contains(@class,'field')]//input[@name='expyear' and @style]"));
		yearElement.sendKeys(year);
	}

	@And("Enter CVV as {string}")
	public void enter_CVV(String cvv) {
		driver.findElement(By.xpath("//div[contains(@class,'field')]//input[@name='cvvno' and @style]")).sendKeys(cvv);				
	}

	@And("Enter cardmail as {string}")
	public void enter_cardmail(String mail) {
		driver.findElement(By.xpath("//div[contains(@class,'field')]//input[@type='email' and @style]")).sendKeys(mail);
	}

	@Then("Click on Pagar con Tarjeta")
	public void click_on_Pagar_con_Tarjeta() {
	    driver.findElement(By.xpath("//button[@name='formsubmit']")).click();
	}
}
