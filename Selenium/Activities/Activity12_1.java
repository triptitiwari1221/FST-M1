package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.training-support.net/selenium/iframes");
		String title = driver.getTitle();
		System.out.println("The Title of Page is: " + title);
		
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println("Frame1 :"+frame1.getText());
        
        WebElement button = driver.findElement(By.id("actionButton"));
        System.out.println("Button Text in Frame1: "+button.getText());
        System.out.println("Button Color in Frame1"+button.getCssValue("background-color"));
        button.click();
        
        System.out.println("New Button Text in Frame1: "+button.getText());
        System.out.println("New Button Color in Frame1"+button.getCssValue("background-color"));
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);
        WebElement frame2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println("Frame2 :"+frame2.getText());
        
        WebElement button1 = driver.findElement(By.id("actionButton"));
        System.out.println("Button Text in Frame2: "+button1.getText());
        System.out.println("Button Color in Frame2"+button1.getCssValue("background-color"));
        button1.click();
        
        Thread.sleep(3000);
        
        System.out.println("New Button Text in Frame2: "+button1.getText());
        System.out.println("New Button Color in Frame2"+button1.getCssValue("background-color"));
        
        driver.switchTo().defaultContent();
        driver.close();
        
        
	}

}
