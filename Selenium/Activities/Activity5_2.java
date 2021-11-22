package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is: "+pageTitle);
		
		WebElement checkbox = driver.findElement(By.name("toggled"));
		System.out.println("The checkbox is displayed on the page: "+checkbox.isSelected());
		
		driver.findElement(By.name("toggled")).click();
		Thread.sleep(3000);
		
		System.out.println("The checkbox is displayed on the page: "+checkbox.isSelected());
		
		driver.close();

	}

}
