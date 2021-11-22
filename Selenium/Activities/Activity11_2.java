package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String title = driver.getTitle();
		System.out.println("The Title of Page is: " + title);
		
		driver.findElement(By.id("confirm")).click();
		Alert alretWindow = driver.switchTo().alert();
		
		String alertText = alretWindow.getText();
		System.out.println("Alert Message: "+alertText);
		
		alretWindow.accept();
		
		driver.findElement(By.id("confirm")).click();
		alretWindow.dismiss();
		
		driver.close();

	}

}
