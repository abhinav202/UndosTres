package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuccessPage {
	
WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, 15);

	@Given("Verify pop up appeared")
	public void verify_Payment_Page() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'fade in')]//div[@class='modal-body']")));
		if(driver.findElement(By.xpath("//div[contains(@class,'fade in')]//div[@class='modal-body']")).isDisplayed())
		{
			System.out.println("====Pop up appeared successfully====");
		}
	else {
		System.out.println("====Pop up did not appear====");
		driver.close();
		}
	}
	
	@When("Enter email as {string}")
	public void enter_email(String email) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'active')]//form[@role='form']//input[@name='email']")));
		
		driver.findElement(By.xpath("//div[contains(@class,'active')]//form[@role='form']//input[@name='email']")).sendKeys(email);
		
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
	}
	
	@Then("Click on Acceso")
	public void click_accesoButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("Recharge is successful")
	public void verify_recharge_success() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'success')]")));
		if(driver.findElement(By.xpath("//span[contains(@class,'success')]")).isDisplayed())
			System.out.println("Recharge is successful");
	}
}
