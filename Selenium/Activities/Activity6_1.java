package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is: "+pageTitle);
		
		WebElement checkbox = driver.findElement(By.name("toggled"));
		WebElement togglerCheckbox = driver.findElement(By.id("toggleCheckbox"));
		
		togglerCheckbox.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		togglerCheckbox.click();
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		
		checkbox.click();
				
		driver.close();

	}

}
