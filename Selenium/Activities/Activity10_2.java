package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
 
        driver.get("https://www.training-support.net/selenium/input-events");
        String title = driver.getTitle();
        System.out.println("The Title of Page is: "+title);
        
        Action actionSequence1 = actions.sendKeys("T").build();
        actionSequence1.perform();
        WebElement keyPressed = driver.findElement(By.id("keyPressed"));
        System.out.println("The Pressed Key is: "+keyPressed.getText());
        
        Action actionSequence2 = actions
        		.keyDown(Keys.CONTROL)
        		.sendKeys("a")
        		.keyDown(Keys.CONTROL)
        		.sendKeys("c")
        		.build();
        actionSequence2.perform();
        keyPressed = driver.findElement(By.id("keyPressed"));
        System.out.println("The Pressed Key is: "+keyPressed.getText());
        
        driver.close();
        

	}

}
