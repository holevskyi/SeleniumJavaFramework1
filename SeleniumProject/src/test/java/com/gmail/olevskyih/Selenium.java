package com.gmail.olevskyih;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SeleniumStartPage;

public class Selenium {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		WebDriver wdOne = new ChromeDriver();
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
}
