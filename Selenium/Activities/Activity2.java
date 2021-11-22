package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println(idLocator.getText());
		
		WebElement classNameLocator = driver.findElement(By.className("green"));
		System.out.println(classNameLocator.getText());
		
		WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
		System.out.println(linkTextLocator.getText());
		
		WebElement CssSelectorLocator = driver.findElement(By.cssSelector(".green"));
		System.out.println(CssSelectorLocator.getText());
		
		driver.close();

	}

}
