package pages;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.POM_Locaters_By;
import utilities.ExcelUtilities;

public class LoginPage extends BaseClass
{
	@DataProvider(name = "SwagLabs_All_TestCases")
	public Object[][] SwagTestData() throws IOException {
		return ExcelUtilities.readExcelData("src/test/resources/testdata/SwagLoginTestData.xlsx",
				"SwagTestData");

	}

	@Test(dataProvider = "SwagLabs_All_TestCases")
	public void SwagLabsLogin(String UserName, String Password) throws InterruptedException {

		POM_Locaters_By locaters = new POM_Locaters_By(driver);
		locaters.loginToApp(UserName, Password);
		Thread.sleep(2000);
	}

	

}
