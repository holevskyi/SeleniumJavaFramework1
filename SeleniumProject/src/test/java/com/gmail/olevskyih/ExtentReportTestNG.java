package com.gmail.olevskyih;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver wdOne;
	
	@BeforeTest
	public void setup() {
		
		htmlReporter = new ExtentHtmlReporter("extent.html");
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        WebDriverManager.chromedriver().setup();
        wdOne = new ChromeDriver();

	}
	
	@Test
	public void testOne() {
		
		ExtentTest test = extent.createTest("TestOne", "Some description");
		test.log(Status.INFO, "Starting test case");
		wdOne.get("https://www.selenium.dev/");		
		test.pass("Navigated to selenium page");
		
		WebElement searchBox = wdOne.findElement(By.id("gsc-i-id1"));
		searchBox.sendKeys("chromedriver");
		searchBox.sendKeys(Keys.RETURN);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() {
		wdOne.close();
		extent.flush();
		System.out.println("Test finished");
	}

}
