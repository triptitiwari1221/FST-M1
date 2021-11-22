package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
		
		System.out.println("Total No.of Rows: "+rows.size());
		System.out.println("Total No.of Columns: "+columns.size());
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
		for(WebElement value:thirdRow)
		{
			System.out.println("Data is trird row: "+value.getText());
		}
		
		WebElement second_RowColumn = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
		System.out.println("Data for 2nd row and 2nd column: "+second_RowColumn.getText());
		
		driver.close();

	}

}
