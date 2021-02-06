package com.gmail.olevskyih;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities {
	
	public static void main(String[] args) {
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Odessa");
		searchField.sendKeys(Keys.RETURN);
		
		driver.close();
	}
}
