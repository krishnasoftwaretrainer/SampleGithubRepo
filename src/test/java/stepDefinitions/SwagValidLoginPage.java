package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SwagValidLoginPage {
	WebDriver driver;
/*
	@Given("The user is on the Login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@When("The user enters a username {string}")
	public void the_user_enters_a_username(String string) 
	{
		driver.findElement(By.id("user-name")).sendKeys(string);
    	
	}
	@And("The user enters a password {string}")
	public void the_user_enters_a_password(String string) 
	{
		driver.findElement(By.id("password")).sendKeys(string);
	  	}
	@And("The user clicks the Login button")
	public void the_user_clicks_the_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

		@Then("The user should see a Products Page")
	public void the_user_should_see_a_products_page() {
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		System.out.println("Expected URL: " + ExpectedURL);
		System.out.println("Actual URL: " + ActualURL);
		Assert.assertEquals("User is not on the Products page",ExpectedURL, ActualURL);
	}  */

}
