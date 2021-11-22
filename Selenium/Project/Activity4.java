package projectActivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
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
	public void login() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b[1]")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAdd")));
		Thread.sleep(5000);
		driver.findElement(By.id("btnAdd")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
		driver.findElement(By.id("firstName")).sendKeys("Selenium");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lastName")));
		driver.findElement(By.id("lastName")).sendKeys("Testing");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave")));
		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b[1]")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("empsearch_employee_name_empName")));
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Selenium Testing");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("searchBtn")));
		driver.findElement(By.id("searchBtn")).click();

		List<WebElement> firstName = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		List<WebElement> lastName = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		System.out.println(firstName.size());

		for (WebElement firstNameData : firstName) {
			System.out.println(firstNameData.getText());
			Assert.assertEquals(firstNameData.getText(), "Selenium");
		}
		for (WebElement lastNameData : lastName) {
			Assert.assertEquals(lastNameData.getText(), "Testing");
			System.out.println(lastNameData.getText());
		}
		driver.close();

	}

}
