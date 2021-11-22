package activities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("Page title is: " + driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindow);
		driver.findElement(By.linkText("Click Me!")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("All window handles: " + allWindowHandles);
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		System.out.println("Current window handle: " + driver.getWindowHandle());
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Open Another One!")));
		System.out.println("New Tab Title is: " + driver.getTitle());
		driver.findElement(By.linkText("Open Another One!")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		allWindowHandles = driver.getWindowHandles();
		System.out.println("All window handles: " + allWindowHandles);
		// Loop through the handles set till we get to the newest handle
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		System.out.println("New tab handle: " + driver.getWindowHandle());
		wait.until(ExpectedConditions.titleIs("Newtab2"));
		System.out.println("New Tab Title is: " + driver.getTitle());
		// newTabText = driver.findElement(By.cssSelector("div.content")).getText();
		// newTabText=driver.findElement(By.xpath("//*[@id=\"actionButton\"]")).getText();
		// System.out.println("New tab heading is: " + newTabText);
		driver.quit();
	}
}