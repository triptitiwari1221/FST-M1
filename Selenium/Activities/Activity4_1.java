package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/");
		
		String title=driver.getTitle();
		System.out.println("The Title of the page is: "+title);
		
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		
		String newPageTitle=driver.getTitle();
		System.out.println("New Page Title is: "+newPageTitle);
		
		driver.close();

	}

}
