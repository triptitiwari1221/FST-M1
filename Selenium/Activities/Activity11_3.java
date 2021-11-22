package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String title = driver.getTitle();
		System.out.println("The Title of Page is: " + title);
		
		driver.findElement(By.id("prompt")).click();
		Alert alretWindow = driver.switchTo().alert();
		
		String alertText = alretWindow.getText();
		System.out.println("Alert Message: "+alertText);
		
		alretWindow.sendKeys("Yes, you are!");
		Thread.sleep(3000);
		alretWindow.accept();
		
		driver.close();

	}

}
