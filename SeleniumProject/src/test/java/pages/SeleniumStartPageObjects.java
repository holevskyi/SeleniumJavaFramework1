package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SeleniumStartPageObjects {
	private static WebDriver driver;
	By searchTextBox = By.id("gsc-i-id1");
	
	public SeleniumStartPageObjects(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void setTextIntoSearch() {
		driver.findElement(searchTextBox).sendKeys("chromedriver");
	}
	
	public void submitSearch() {
		driver.findElement(searchTextBox).sendKeys(Keys.ENTER);
	}
}
