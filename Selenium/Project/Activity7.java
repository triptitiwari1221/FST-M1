package projectActivities;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class Activity7 {
	
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
  @Test
  public void addExperience() {
	 	  
	  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b[1]")).click();
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Qualifications")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("addWorkExperience")));
		driver.findElement(By.id("addWorkExperience")).click();
		
		driver.findElement(By.xpath("//input[@id='experience_employer']")).sendKeys("IBM");
		driver.findElement(By.xpath("//input[@id='experience_jobtitle']")).sendKeys("QA Tester");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnWorkExpSave")));
		driver.findElement(By.id("btnWorkExpSave"));
		
		driver.close();
		
  }

}
