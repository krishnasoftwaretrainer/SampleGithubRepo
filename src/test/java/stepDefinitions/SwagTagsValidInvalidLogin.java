package stepDefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagTagsValidInvalidLogin {
	WebDriver driver;

	@Given("The user is on the login page")
	public void openLoginPage() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@When("The user enters username {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	}

	@When("The user enters password {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("The user clicks the Login button")
	public void clickLogin() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("The user should see the Products Page")
	public void verifyProductsPage() {

		if (driver.getCurrentUrl().contains("inventory.html")) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}

		driver.quit();
	}

	@Then("The user should see an error message")
	public void verifyError() {

		String error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println("Error Message: " + error);

		driver.quit();
	} 
}
