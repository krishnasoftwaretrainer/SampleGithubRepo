package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;

public class BaseClass 
{
	public WebDriver driver;  //Global Object
	public ConfigReader prop;

	@BeforeMethod
	public void setup() throws IOException {
		prop = new ConfigReader();
		driver = new EdgeDriver();
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		driver.get(prop.getProperty("baseUrl"));
	}

	@AfterMethod
	public void tearDown() 
	{
		if (driver != null) {
		driver.quit();
	}
	}
}
