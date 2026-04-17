package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Locaters_By
{
	WebDriver driver;
	
	public POM_Locaters_By(WebDriver driver) 
	{
		this.driver=driver;
	}

	By username=By.id("user-name");
	By password=By.id("password");
	By loginBtn=By.xpath("//input[@id=\"login-button\"]");
	
	public void enterUsername(String userName) 
	{	
						//int a=20;
	 driver.findElement(username).sendKeys(userName);
	 //driver.findElement(By.id("user-name")).sendKeys(userName);
	 						
	}
	
	public void enterPassword(String passWord) 
	{
	 driver.findElement(password).sendKeys(passWord);
	}
	
	public void clickLoginBtn() 
	{
	 driver.findElement(loginBtn).click();
	}
	
	public void loginToApp(String userName, String passWord) 
	{
		enterUsername(userName);
		enterPassword(passWord);
		clickLoginBtn();
		
	}
}
