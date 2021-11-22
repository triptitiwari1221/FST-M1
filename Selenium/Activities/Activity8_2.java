package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		
		System.out.println("Total No.of Rows: "+rows.size());
		System.out.println("Total No.of Columns: "+columns.size());
		
		WebElement beforeSorting = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Data before sorting: "+beforeSorting.getText());
		
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
		WebElement afterSorting = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Data after sorting: "+afterSorting	.getText());
		
		WebElement footerData = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
		System.out.println("The footer data is: "+footerData.getText());
		
		driver.close();
		

	}

}
