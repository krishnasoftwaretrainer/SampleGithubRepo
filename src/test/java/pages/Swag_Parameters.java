package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass_Parlell;

public class Swag_Parameters extends BaseClass_Parlell 
{
	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	@Parameters({ "vusername", "vpassword" })
	public void ValidValidLogin(String vusername, String vpassword) {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(vusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(vpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		// SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualURL, expectedURL); // Pass Fail
		softAssert.assertAll(); // Report
		System.out.println("ThreadID: | " + Thread.currentThread().threadId());
	}

	@Test(priority = 2)
	@Parameters({ "ivusername", "ivpassword" })
	public void InvalidLogin(String ivusername, String ivpassword) {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(ivusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(ivpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		String actualErrorMessage = errorMessage.getText();

		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage); // Pass Fail
		softAssert.assertAll(); // Report
		System.out.println("ThreadID: | " + Thread.currentThread().threadId());

	}

	// Valid Invalid Login
	@Test(priority = 3)
	@Parameters({ "vusername", "ivpassword" })
	public void ValidInvalidLogin(String vusername, String ivpassword) {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(vusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(ivpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		String actualErrorMessage = errorMessage.getText();

		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage); // Pass Fail
		softAssert.assertAll(); // Report
		System.out.println("ThreadID: | " + Thread.currentThread().threadId());

	}

	// Invalid Valid Login
	// Valid Invalid Login
	@Test(priority = 4)
	@Parameters({ "ivusername", "vpassword" })
	public void InValidvalidLogin(String ivusername, String vpassword) {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(ivusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(vpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		String actualErrorMessage = errorMessage.getText();

		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage); // Pass Fail
		softAssert.assertAll(); // Report
		System.out.println("ThreadID: | " + Thread.currentThread().threadId());

	}
	
	@Test(priority = 5)
	@Parameters({ "blankusername", "blankpassword" })
	public void BlankLogin(String blankusername, String blankpassword) {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(blankusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(blankpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String expectedErrorMessage = "Epic sadface: Username is required";
		String actualErrorMessage = errorMessage.getText();

		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage); // Pass Fail
		softAssert.assertAll(); // Report
		System.out.println("ThreadID: | " + Thread.currentThread().threadId());
		System.out.println("Excution Completed");
	}

}
