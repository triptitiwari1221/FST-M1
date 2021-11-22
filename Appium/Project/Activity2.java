package projectActivities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity2 {
	WebDriverWait wait;
    AppiumDriver<MobileElement> driver;
 
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  
	  DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "Test Emulator_Pixel");
      caps.setCapability("platformName", "Android");
      caps.setCapability("automationName", "UiAutomator2");
      caps.setCapability("appPackage", "com.google.android.keep");
      caps.setCapability("appActivity", ".activities.BrowseActivity");
      caps.setCapability("noReset", true);

   driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
   wait = new WebDriverWait(driver, 10);
  }
  
  @Test
  public void addNewNote(){
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
	  driver.findElementById("new_note_button").click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
	  driver.findElementById("editable_title").sendKeys("Test Title");
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("edit_note_text")));
	  driver.findElementById("edit_note_text").sendKeys("This is a sample note for Appium Testing");
	  
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Open navigation drawer")));
	  driver.findElementByAccessibilityId("Open navigation drawer").click();
	  
	 // String result = driver.findElementById("index_note_title").getText();
	 // Assert.assertEquals(result, "Test Title");
	  
	  String titleAdded = driver.findElementById("index_note_title").getText();
	  Assert.assertEquals(titleAdded, "Test Title");
	  
	 // List<MobileElement> noteAdded = driver.findElementsById("index_note_text_description");
	 // Assert.assertEquals(titleAdded.get(0).getText(), "Test Title");
	// Assert.assertEquals(noteAdded.get(0).getText(), "This is a sample note for Appium Testing");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
