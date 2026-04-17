package stepDefinitions;
import baseclass.BaseClass;
import io.cucumber.java.en.*;
import pom.LoginPage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class FrameWorkScript extends BaseClass //Inheritance 
{

	LoginPage login;

	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
		launchBrowser();
		driver.get("https://www.saucedemo.com/");
		 login = new LoginPage(driver);
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) 
	{
		login.enterUsername(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) 
	
	{
		login.enterPassword(password);
	}

	@When("User clicks login button")
	public void user_clicks_login_button()
	{
		login.clickLoginButton();
	}

	@And("User should see {string}")
	public void user_should_see_result(String result)
	{

		if (result.equalsIgnoreCase("success")) 
		{

			// expected URL after login
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			String actualUrl = driver.getCurrentUrl();

			assertEquals("Login not successful", expectedUrl, actualUrl);

		} 
		
		else 
		{

			// expected error message
			String expectedError = "Epic sadface";
			String actualError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();

			// just checking contains (simple)
			assertEquals(true, actualError.contains(expectedError));
		}
		
	}
		
		@Then("User should be closed the browser")
		public void user_should_be_closed_the_browser() 
		{
		    tearDown();
		    }



	}


