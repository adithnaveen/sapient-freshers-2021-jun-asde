package com.automation.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.pom.RegistrationPom;
import com.automation.util.Driver;
import com.automation.util.DriverFactory;
import static com.automation.util.Utilities.*;

public class RegistrationTest {

	private WebDriver driver = null; 
	private String url; 
	private RegistrationPom regPom = null ;
	
	@Before
	public void setUp() {
		 driver = DriverFactory.getDriver(Driver.CHROME);
		 url = "http://elearning.upskills.in/";
		 regPom = new RegistrationPom(driver); 
	}
	
	@After
	public void tearDown() {
		sleep(1000); 
		driver.quit();  
	} 
	
	@Ignore
	@Test
	public void regTest() {
		driver.get(url);

		
		String regLinkXpath ="//*[@id=\"login-block\"]/div/ul/li[1]/a"; 
		String firstNameID = "registration_firstname"; 
		String lastNameID = "registration_lastname"; 
		String  emailID = "registration_email"; 
		
		driver.findElement(By.xpath(regLinkXpath)).click(); 
		
		sleep(1000); 
		
		driver.findElement(By.id(firstNameID)).clear();
		driver.findElement(By.id(firstNameID)).sendKeys("Naveen"); 

		 
		driver.findElement(By.id(lastNameID)).clear(); 
		driver.findElement(By.id(lastNameID)).sendKeys("Kumar"); 
		 
		driver.findElement(By.id(emailID)).clear();
		driver.findElement(By.id(emailID)).sendKeys("naveen@probits.in"); 
		 
		
	}

	@Test
	public void regTest1() {
		driver.get(url);
		regPom.clickRegLink(); 
		regPom.sendFirstName("Naveen");
		regPom.sendLastName("Kumar"); 
		regPom.sendEmail("naveen@probits.in");
	}
	
}


















