package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://training-support.net/selenium/ajax");
				
		driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
		
		String text = driver.findElement(By.id("ajax-content")).getText();
		System.out.println("The message is: "+text);
				
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));
		
		String text2 = driver.findElement(By.id("ajax-content")).getText();
		System.out.println("The new message is: "+text2);
		
		driver.close();

	}

}
