package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is: "+pageTitle);
		
		WebElement checkbox = driver.findElement(By.name("toggled"));
		System.out.println("The checkbox is displayed on the page: "+checkbox.isDisplayed());
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		System.out.println("The checkbox is displayed on the page: "+checkbox.isDisplayed());
		
		driver.close();

	}

}
