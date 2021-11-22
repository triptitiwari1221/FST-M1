package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		String title=driver.getTitle();
		System.out.println("The Title of the page is: "+title);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tripti");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Tiwari");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("0123456789");
		
		driver.findElement(By.xpath("//textarea")).sendKeys("This is a sample message");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
		
		//driver.close();

	}

}
