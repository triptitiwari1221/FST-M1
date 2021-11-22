package projectActivities;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class Activity6 {
	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeClass
  public void beforeClass() {
			driver = new FirefoxDriver();
			driver.get("http://alchemy.hguy.co/orangehrm");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 10);
		}

@Test
public void directory() throws InterruptedException {
	
	driver.findElement(By.id("txtUsername")).sendKeys("orange");
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
	driver.findElement(By.id("btnLogin")).click();

	WebElement directory = driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']/b[1]"));
	System.out.println("Directory Menu Item clickable: "+directory.isEnabled());
	
	directory.click();
	Thread.sleep(5000);
	
	String heading = driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
	Assert.assertEquals(heading, "Search Directory");
}

@AfterMethod
public void afterMethod() {
	driver.close();
}

}
