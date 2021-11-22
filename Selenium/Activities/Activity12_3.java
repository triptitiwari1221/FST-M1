package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.training-support.net/selenium/popups");
		String title = driver.getTitle();
		System.out.println("The Title of Page is: " + title);
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'orange')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
		String toolTipText=button.getAttribute("data-tooltip");
		System.out.println("Tool Tip Text: "+toolTipText);
		
		button.click();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String message = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Message after loggin in : "+message);
		
		driver.close();

	}

}
