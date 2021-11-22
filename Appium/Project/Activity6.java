package projectActivities;

import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6 {
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Test Emulator_Pixel");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 60);

		driver.get("https://www.training-support.net/selenium");
		wait.until(ExpectedConditions
				.elementToBeClickable(MobileBy.xpath("//android.widget.Button[2][contains(@text,'Get Started!')]")));
		driver.findElementByXPath("//android.widget.Button[2][contains(@text,'Get Started!')]").click();

		driver.findElement(MobileBy.AndroidUIAutomator(
				"UiScrollable(UiSelector().scrollable(true)).flingToEnd(5).scrollIntoView(textContains(\"Popups\"))"))
				.click();

		wait.until(ExpectedConditions
				.elementToBeClickable(MobileBy.xpath("//android.widget.Button[contains(@text,'Sign In')]")));
		driver.findElementByXPath("//android.widget.Button[contains(@text,'Sign In')]").click();
	}

	@Test(priority = 1)
	public void validCredentials() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(
				MobileBy.xpath("//android.widget.EditText[1][contains(@resource-id,'username')]")));
		driver.findElementByXPath("//android.widget.EditText[1][contains(@resource-id,'username')]").sendKeys("admin");

		wait.until(ExpectedConditions.elementToBeClickable(
				MobileBy.xpath("//android.widget.EditText[2][contains(@resource-id,'password')]")));
		driver.findElementByXPath("//android.widget.EditText[2][contains(@resource-id,'password')]")
				.sendKeys("password");

		wait.until(ExpectedConditions
				.elementToBeClickable(MobileBy.xpath("//android.widget.Button[contains(@text,'Log in')]")));
		driver.findElementByXPath("//android.widget.Button[contains(@text,'Log in')]").click();

		Thread.sleep(5000);
		String result = driver.findElement(By.xpath("//android.view.View[4][contains(@text,'Welcome Back, admin')]"))
				.getText();
		Assert.assertEquals(result, "Welcome Back, admin");
	}

	@Test(priority = 2)
	public void invalidCredentials() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(
				MobileBy.xpath("//android.widget.EditText[1][contains(@resource-id,'username')]")));
		driver.findElementByXPath("//android.widget.EditText[1][contains(@resource-id,'username')]").sendKeys("admin");

		wait.until(ExpectedConditions.elementToBeClickable(
				MobileBy.xpath("//android.widget.EditText[2][contains(@resource-id,'password')]")));
		driver.findElementByXPath("//android.widget.EditText[2][contains(@resource-id,'password')]").sendKeys("pass");

		wait.until(ExpectedConditions
				.elementToBeClickable(MobileBy.xpath("//android.widget.Button[contains(@text,'Log in')]")));
		driver.findElementByXPath("//android.widget.Button[contains(@text,'Log in')]").click();

		Thread.sleep(5000);
		String result = driver.findElement(By.xpath("//android.view.View[4][contains(@text,'Invalid Credentials')]"))
				.getText();
		Assert.assertEquals(result, "Invalid Credentials");
	}

	@AfterClass
	public void afterMethod() {
		driver.quit();
	}
}