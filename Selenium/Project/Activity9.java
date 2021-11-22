package projectActivities;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Activity9 {
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
	public void emergencyContactInfo(){
		
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b[1]")).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Emergency Contacts")));
		driver.findElement(By.linkText("Emergency Contacts")).click();
		
		List<WebElement> contactInfo = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));
		for(WebElement row:contactInfo)
		{
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(WebElement cell:cells)
			{
				System.out.println(cell.getText());
			}
		}
		
		driver.close();
	}

}
