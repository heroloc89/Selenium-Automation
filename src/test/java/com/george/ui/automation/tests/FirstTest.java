package com.george.ui.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by LOCNGUYEN on 12/4/2016.
 */
public class FirstTest {
    private WebDriver driver;
    @BeforeClass
    private void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void openHomePage(){
        driver.get("http://www.amazon.com");
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @Test
    public void testAddingItemToCard(){
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");

    }


}
