package com.gmail.olevskyih;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium5ExtebtReportBasic {
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter report = new ExtentHtmlReporter("rep.html");
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(report);
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        WebDriverManager.chromedriver().setup();
		WebDriver wdOne = new ChromeDriver();
		
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
		wdOne.close();
		extent.flush();

	}

}
