package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		
		WebElement choosen = driver.findElement(By.id("single-value"));

		WebElement dropdown = driver.findElement(By.id("single-select"));
		Select dropdownObj = new Select(dropdown);
		
		dropdownObj.selectByVisibleText("Option 2");
		System.out.println(choosen.getText());
		
		dropdownObj.selectByIndex(3);
		System.out.println(choosen.getText());
		
		dropdownObj.selectByValue("4");
		System.out.println(choosen.getText());
		
		List<WebElement> dropdownList = dropdownObj.getOptions();
		for(WebElement options:dropdownList)
		{
			System.out.println("Elements in dropdown list: "+options.getText());
		}
		
		driver.close();

	}

}
