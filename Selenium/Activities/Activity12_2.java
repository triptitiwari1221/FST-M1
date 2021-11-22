package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		String title = driver.getTitle();
		System.out.println("The Title of Page is: " + title);
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.cssSelector("div.content"));
		System.out.println("Frame 1 Heading is: "+frame1.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		WebElement frame2 = driver.findElement(By.cssSelector("div.content"));
		System.out.println("Frame 2 Heading is: "+frame2.getText());
		
		driver.close();
		

	}

}
