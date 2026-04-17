package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass_Parlell {
	protected WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void BrowserSetup(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions choptions = new ChromeOptions();
			choptions.addArguments("--headless");
			driver = new ChromeDriver(choptions);
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions edoptions = new EdgeOptions();
			edoptions.addArguments("--headless");
			driver = new EdgeDriver(edoptions);
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions ffoptions = new FirefoxOptions();
			ffoptions.addArguments("--headless");
			driver = new FirefoxDriver(ffoptions);
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterMethod
	public void BrowserTearDown() {
		if (driver != null)
			driver.quit();

	}

}
