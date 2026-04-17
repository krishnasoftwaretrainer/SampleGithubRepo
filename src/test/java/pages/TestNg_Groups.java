package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg_Groups 
{
	WebDriver driver;
	@Test(groups = "Smoke", priority = 1)
	public void TitleVerification() throws InterruptedException  //Smoke Testing
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		wait.until(ExpectedConditions.titleContains("Amazon"));
		
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		//Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println("Expected Title: "+expectedTitle);
		System.out.println("Actual Title: "+actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("TitleVerification | "+Thread.currentThread().threadId());
		driver.quit();
	}
	@Test(groups = "Smoke", priority = 2)
	public void LoginTest()
	{
		SoftAssert softAssert = new SoftAssert();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		// SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualURL, expectedURL); // Pass Fail
		softAssert.assertAll(); // Report

		System.out.println("LoginTest | "+Thread.currentThread().threadId());
		driver.quit();
	}
	@Test(groups = "Regression")
	public void SearchTest()
	{
		System.out.println("SearchTest | "+Thread.currentThread().threadId());
	}
	
	@Test(groups = "Regression")
	public void AddToCartTest()
	{
		System.out.println("AddToCartTest | "+Thread.currentThread().threadId());
	}
	@Test(groups = {"Sanity"})
	public void CheckoutTest()
	{
		System.out.println("PaymentTest | "+Thread.currentThread().threadId());
	}
	@Test(groups = {"Sanity","Regression"})
	public void PaymentTest()
	{
		System.out.println("PaymentTest | "+Thread.currentThread().threadId());
	}
	
}
