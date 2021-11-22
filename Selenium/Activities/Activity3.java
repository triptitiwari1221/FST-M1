package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		String title=driver.getTitle();
		System.out.println("The Title of the page is: "+title);
		
		WebElement FirstName = driver.findElement(By.id("firstName"));
		WebElement LastName = driver.findElement(By.id("lastName"));
		
		FirstName.sendKeys("Tripti");
		LastName.sendKeys("Tiwari");
		
		driver.findElement(By.id("email")).sendKeys("tripti096@gmail.com");
		driver.findElement(By.id("number")).sendKeys("0123456789");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".ui.green.button")).click();
				
		driver.close();
		

	}

}
