package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SwagDataDriven
{
	WebDriver driver;
	/*
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	@When("The user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String string)
	{
	    driver.findElement(By.id("user-name")).sendKeys(string);
	}
	@And("The user enters a valid password {string}")
	public void the_user_enters_a_valid_password(String string)
	{
	   driver.findElement(By.id("password")).sendKeys(string);
	}
	@And("The user clicks the login button")
	public void the_user_clicks_the_login_button() 
	{
	   driver.findElement(By.id("login-button")).click();
	}
	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() 
	{
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
	   String ActualURL = driver.getCurrentUrl();
	   Assert.assertEquals("User is not on the Products page",ExpectedURL, ActualURL); 
	}
*/

}
