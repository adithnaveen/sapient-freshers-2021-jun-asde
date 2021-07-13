package com.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver; 
		
		// step 1 : identify the driver
		System.setProperty("webdriver.chrome.driver", "/Volumes/Kanchan/MyTrainings/sapient/freshers-2021-jun-asde/web-driver/chromedriver"); 
		// step 2 : load the driver 
		driver = new ChromeDriver();
		// step 3 : open the browser 
		String url = "http://elearning.upskills.in/";
		driver.get(url); 
		// step 4 : do the work 
		System.out.println("Page Title : " +  driver.getTitle());  
		
		String regLinkXpath ="//*[@id=\"login-block\"]/div/ul/li[1]/a"; 
		String firstNameID = "registration_firstname"; 
		String lastNameID = "registration_lastname"; 
		String  emailID = "registration_email"; 
		
		driver.findElement(By.xpath(regLinkXpath)).click(); 
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		driver.findElement(By.id(firstNameID)).clear();
		driver.findElement(By.id(firstNameID)).sendKeys("Naveen"); 

		 
		driver.findElement(By.id(lastNameID)).clear(); 
		driver.findElement(By.id(lastNameID)).sendKeys("Kumar"); 
		 
		driver.findElement(By.id(emailID)).clear();
		driver.findElement(By.id(emailID)).sendKeys("naveen@probits.in"); 
		 
		
		
		// step 5 : close the browser 
		driver.quit(); 
	}
}
