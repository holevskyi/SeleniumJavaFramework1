package com.gmail.olevskyih;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SeleniumStartPageObjects;

public class Selenium3 {

	public static void main(String[] args) {
		seleniumSearchTest();
	}
	
	public static void seleniumSearchTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		SeleniumStartPageObjects sspo = new SeleniumStartPageObjects(driver);
		
		driver.get("https://www.selenium.dev/");
		sspo.setTextIntoSearch();
		sspo.submitSearch();
		driver.close();
	}

}
 