package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/selects");
		
		WebElement choosen = driver.findElement(By.id("multi-value"));
		
		WebElement multiSelect = driver.findElement(By.id("multi-select"));
		Select dropdownObj = new Select(multiSelect);
		
		if(dropdownObj.isMultiple())
		{
			dropdownObj.selectByVisibleText("Javascript");
			System.out.println(choosen.getText());
			
			dropdownObj.selectByValue("node");
			System.out.println(choosen.getText());
			
			for(int i=4; i<=6; i++)
			{
				dropdownObj.selectByIndex(i);
				System.out.println(choosen.getText());
			}
			
			dropdownObj.deselectByValue("node");
			System.out.println(choosen.getText());
			
			dropdownObj.deselectByIndex(7);
			System.out.println(choosen.getText());
			
			List<WebElement> selectedOption = dropdownObj.getAllSelectedOptions();
			for(WebElement selectedOptions:selectedOption)
			{
				System.out.println("Selected Options are: "+selectedOptions.getText());
			}
			
			dropdownObj.deselectAll();
			System.out.println(choosen.getText());
						
		}
		driver.close();
		

	}

}
