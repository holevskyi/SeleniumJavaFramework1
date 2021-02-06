package com.gmail.olevskyih;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SeleniumStartPage;

public class Selenium4TestNG {
	
	static WebDriver wdOne = null;
	public static String browserName = null;
	
	@BeforeTest
	public static void testSetUp() {
		WebDriverManager.chromedriver().setup();
		wdOne = new ChromeDriver();
	}
	
	@Test
	public static void runTest() {
		PropertiesFile.getproperties();
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			wdOne = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wdOne = new FirefoxDriver();
		}
		
		wdOne.get("https://www.selenium.dev/");
		//WebElement searchBox = wdOne.findElement(By.id("gsc-i-id1"));
		SeleniumStartPage.searchTextBox(wdOne, "gsc-i-id1");
		SeleniumStartPage.searchTextBox(wdOne, "gsc-i-id1").sendKeys("chromedriver");
		SeleniumStartPage.searchTextBox(wdOne, "gsc-i-id1").sendKeys(Keys.RETURN);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wdOne.close();
	}
	
	@AfterTest
	public static void tearDownTest() {
		wdOne.close();
		wdOne.quit();
		System.out.println("Test finished succesfully");
	}
}

