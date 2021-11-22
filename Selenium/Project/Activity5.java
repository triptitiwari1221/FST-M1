package projectActivities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
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
  public void editInfo() throws InterruptedException {
	 	  
	  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b[1]")).click();
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Tripti");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("personal_txtEmpLastName")));
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Tiwari");
		
		driver.findElement(By.id("personal_optGender_2")).isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("personal_optGender_2")));
		driver.findElement(By.id("personal_optGender_2")).click();
		driver.findElement(By.id("personal_DOB")).sendKeys("02-12-1997");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
		driver.findElement(By.id("btnSave")).click();
		driver.close();
	  
  }
}
