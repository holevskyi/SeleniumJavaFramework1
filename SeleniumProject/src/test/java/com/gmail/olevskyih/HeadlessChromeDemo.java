package com.gmail.olevskyih;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		WebDriverManager.chromedriver().setup();
		//headless mode does not work with webdrivermanager, need to set the path manually

		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1920,1080");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
	}

}
