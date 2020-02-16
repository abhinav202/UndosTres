package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePage {

	WebDriver driver = null;
	
	@Given("I open the site {string}")
	public void open_website(String url) {
		System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
	}
	
	@When("Select Operador as {string}")
	public void select_Operador_as(String operator) {
		driver.findElement(By.xpath("//div[@class='field']//input[@suggest='mobile-operator']")).sendKeys(operator);
		driver.findElement(By.xpath("//div[@class='suggestion']//li[@data-show='"+operator+"']")).click();
	}

	@And("Enter Mobile number as {string}")
	public void enter_Mobile_number(String mobileNumber) {
		driver.findElement(By.xpath("//div[@to-do='mobile']//input[@type='tel']")).click();
		driver.findElement(By.xpath("//div[@to-do='mobile']//input[@type='tel']")).sendKeys(mobileNumber);
	}

	@And("Enter Recharge amount as {string}")
	public void enter_Recharge_amount(String amount) {
		driver.findElement(By.xpath("//div[@class='field']/div/input[@suggest='mobile-operator_amount']")).click();
		driver.findElement(By.xpath("//div[@class='suggestion']//li[contains(@data-show,'"+amount+" ')]")).click();
	}

	@Then("Click on Siguiente")
	public void click_on_Siguiente() {
		driver.findElement(By.xpath("//div[@to-do='mobile']//button[text()='Siguiente']")).click();
	}
	
	

}
