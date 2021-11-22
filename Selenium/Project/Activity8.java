package projectActivities;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class Activity8 {
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
	public void applyLeave() throws InterruptedException {

		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(5000);
		driver.findElement(By.linkText("Apply Leave")).click();
		Thread.sleep(5000);
		System.out.println("Hi");
		Select dropdown = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		dropdown.selectByVisibleText("privilege leaves");

		driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2022-02-12");
		driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2022-02-16");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("applyBtn")));
		driver.findElement(By.id("applyBtn")).click();

		driver.findElement(By.linkText("My Leave")).click();

		WebElement date = driver.findElement(By.xpath("//table/tbody/tr/td[6]"));
		System.out.println("Status of Leave Application: " + date.getText());

		driver.close();

	}

}
