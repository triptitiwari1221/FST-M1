package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String title = driver.getTitle();
		System.out.println("The Title of Page is: " + title);
		
		driver.findElement(By.id("simple")).click();
		
		Alert alretWindow = driver.switchTo().alert();
		Thread.sleep(3000);
		
		String alrertText = alretWindow.getText();
		System.out.println("Alert Message: "+alrertText);
		
		alretWindow.accept();
		
		driver.close();

	}

}
