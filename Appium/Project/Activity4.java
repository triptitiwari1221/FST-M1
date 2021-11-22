package projectActivities;

import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
public class Activity4 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException, IOException {
	      
	      DesiredCapabilities caps = new DesiredCapabilities();
	      caps.setCapability("deviceName", "Test Emulator_Pixel");
	      caps.setCapability("platformName", "Android");
	      caps.setCapability("automationName", "UiAutomator2");
	      caps.setCapability("appPackage", "com.android.chrome");
	      caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	      caps.setCapability("noReset", true);
	         driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	          
	          wait = new WebDriverWait(driver,10);
	          driver.get("https://www.training-support.net/selenium");
	  }
	
  @Test
  public void addTask() throws InterruptedException {
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[2][contains(@text,'Get Started!')]")));
	  driver.findElementByXPath("//android.widget.Button[2][contains(@text,'Get Started!')]").click();
      
	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5).scrollIntoView(textContains(\"To-Do List\"))")).click();
	  String task[] = {
			  "Add tasks to list",
			  "Get number of tasks",
			  "Clear the list"};
	  
	 
	  for (String addTask : task) {
		 
		  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@resource-id='taskInput']")));
		  driver.findElementByXPath("//android.widget.EditText[@resource-id='taskInput']").sendKeys(addTask);
		  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[contains(@text,'Add Task')]")));
		  driver.findElementByXPath("//android.widget.Button[contains(@text,'Add Task')]").click();	
	  }
	  Thread.sleep(5000);  
	  //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//aandroid.view.View[contains(@text,'Add tasks to list')]")));
		driver.findElementByXPath("//android.view.View[contains(@text,'Add tasks to list')]").click();
		 Thread.sleep(5000);
		driver.findElementByXPath("//android.view.View[contains(@text,'Get number of tasks')]").click();
		//wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//aandroid.view.View[contains(@text,'Clear the list')]")));
		Thread.sleep(5000);
		driver.findElementByXPath("//android.view.View[contains(@text,'Clear the list')]").click();
		Thread.sleep(5000);
	  
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[2][contains(@text,'Clear List')]")));
	  driver.findElementByXPath("//android.view.View[contains(@text,'Clear List')]").click();	
	  //Thread.sleep(5000);
	  
	  String actual = driver.findElementByXPath("//android.view.View[contains(@text, '')]").getText();
	  String expected = "";
	  
	  Assert.assertEquals(actual, expected);
  }
  
  @AfterClass
  public void afterClass()
  {
	  driver.quit();
  }
  
}
