package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Teast1
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Storing values in variables and then using them
		/*
		int a=40;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println("***********************");
		//Directly using values without storing in variables
		System.out.println(40+20);
		System.out.println(40-20);
		System.out.println(4020);
		System.out.println(40/20);
		 */
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		/*
		driver.findElement(By.id("user-name")).sendKeys("askfaksj");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		*/
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("askfaksj");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("standard_user");
		
	}

}
