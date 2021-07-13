package com.automation.util;
 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public static WebDriver getDriver(String driverName) {
		WebDriver driver = null; 
		if(driverName.equals(Driver.CHROME)) {
			
			System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			driver = new ChromeDriver(); 
			
		}else if(driverName.equals(Driver.FIREFOX)) {
			return null; 
		}
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		return driver; 
	}
}
