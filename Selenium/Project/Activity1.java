package projectActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Activity1 {
	WebDriver driver;

	@BeforeMethod
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");

	}

	@Test
	public void pageTitle() {
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);

		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
}
