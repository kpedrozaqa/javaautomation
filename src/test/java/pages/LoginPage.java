package pages;

import variables.configProperties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	
	public void navigateToJenkins(WebDriver driver) {
		
		configProperties.initializePropertyFile();
		
		driver.get(configProperties.property.getProperty("url"));
		
	}
	
	public void verifyjenkinsTitle(WebDriver driver) {
		
		String pageTitle = "Sign in [Jenkins]";
		new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		assertEquals(pageTitle, driver.getTitle());
	}
	
	public void signInButtonIsShown (WebDriver driver) { 
		
		WebElement webElement = driver.findElement(By.name("Submit"));
		assertTrue(webElement.isDisplayed()); 
		}
	
	public void verifyTheElementExists(String string, WebDriver driver) {
		
		WebElement webElement = null;
		
		switch (string) {
		
		case "username":
			webElement = driver.findElement(By.name("j_username"));
			break;
		case "password":
			webElement = driver.findElement(By.name("j_password"));
			break;
		}
		
		assertTrue(webElement.isDisplayed());
		
	}
	
	
}

