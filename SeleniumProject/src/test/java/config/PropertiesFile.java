package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.gmail.olevskyih.Selenium4TestNG;

public class PropertiesFile {

	public static void main(String[] args) {
		getproperties();
		setProperty();

	}
	
	public static void getproperties() {
		Properties prop = new Properties();
		try {
		InputStream input = new FileInputStream("C:\\Users\\olevs\\eclipse-workspace\\SeleniumProject\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		Selenium4TestNG.browserName = browser;     
		System.out.println(browser);
		} catch (Exception e) {
			System.out.println(e.getCause() + "||||" + e.getMessage());
		}
	}
	
	public static void setProperty() {
		Properties prop = new Properties();
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\olevs\\eclipse-workspace\\SeleniumProject\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		} catch (Exception e) {
			System.out.println(e.getCause() + "||||" + e.getMessage());
		}
	}

}
