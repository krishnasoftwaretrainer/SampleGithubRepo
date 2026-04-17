package basic_SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Title_Verification
{
	@Test
	public void verifyTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		driver.close();
	}
	
	
/*
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		driver.close();
		} */
	

}
