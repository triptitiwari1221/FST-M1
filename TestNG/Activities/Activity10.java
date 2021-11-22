package activities;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;


public class Activity10 {
WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://www.training-support.net/");
        Reporter.log("Test Started");
    }
    @Test
    public void testCase1() {
        //This test case will pass
        String title = driver.getTitle();
        Reporter.log("Title is: " + title);
        Assert.assertEquals("Training Support", title);
    }
    @Test
    public void testCase2() {
        //This test case will Fail
        WebElement button = driver.findElement(By.tagName("button"));
        Reporter.log("Element Found");
        Assert.assertFalse(button.isDisplayed());
    }
    @Test(enabled = false)
    public void testCase3() {
        //This test will be skipped
        Reporter.log("This page title will not be printed: " + driver.getTitle());
    }
    @Test
    public void testCase4() {
        //This test will be skipped and will be be shown as skipped
        Reporter.log("Test skipped with Exception");
        throw new SkipException("Skipping test case");
    }
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.close();
        Reporter.log("Test Completed");
    }
}






