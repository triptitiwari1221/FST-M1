package projectActivities;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	WebDriver driver;

	@BeforeMethod
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		
		String homePage = driver.findElement(By.xpath("//a[@id='menu_dashboard_index']/b[1]")).getText();
		
		Assert.assertEquals(homePage, "Dashboard");
		driver.close();
		
	}
}
