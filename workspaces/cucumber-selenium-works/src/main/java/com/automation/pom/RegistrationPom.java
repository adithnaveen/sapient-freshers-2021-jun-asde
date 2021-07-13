package com.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.util.RegFormXpaths;

public class RegistrationPom {
	private WebDriver driver; 
	private WebElement element; 
	
	public RegistrationPom(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void clickRegLink() {
		element = driver.findElement(By.xpath(RegFormXpaths.REG_LINK_XPATH)); 
		element.click();
	}
	
	public void sendFirstName(String firstName) {
		element = driver.findElement(By.id(RegFormXpaths.FIRST_NAME_ID)); 
		element.clear(); 
		element.sendKeys(firstName);
	}
	public void sendLastName(String lastName) {
		element = driver.findElement(By.id(RegFormXpaths.LAST_NAME_ID)); 
		element.clear(); 
		element.sendKeys(lastName);
	}
	public void sendEmail(String email) {
		element= driver.findElement(By.id(RegFormXpaths.EMAIL_ID)); 
		element.clear(); 
		element.sendKeys(email);
	}
	
}
