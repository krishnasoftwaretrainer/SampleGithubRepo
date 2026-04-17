package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass  //Parent class
{
	public static WebDriver driver;
	
	//@Before //Cucumber annotation
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
	}
	
	//@After //Cucumber annotation
	public void tearDown()
	{
		if(driver!=null) //Simple if 
		{
		driver.quit();  //TBS 
		}
	}
	

}
