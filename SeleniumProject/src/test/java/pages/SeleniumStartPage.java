package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumStartPage {
	
	private static WebElement element = null;
	
	public static WebElement searchTextBox(WebDriver driver, String id) {
		element = driver.findElement(By.id(id));
		return element;
	}

}
