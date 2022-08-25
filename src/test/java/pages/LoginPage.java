package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import variables.configProperties;


public class LoginPage {
	
	WebDriver driver;
	
	final String pageTitle = "Sign in [Jenkins]";
	
	@FindBy(id = "j_username")
	private WebElement usernameInput;
	
	@FindBy(id = "j_password")
	private WebElement passwordInput;
	
	@FindBy(name = "Submit")
	private WebElement signInButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	public void navigateToJenkins() {	
		configProperties.initializePropertyFile();
		driver.get(configProperties.property.getProperty("url"));
		
	}
	
	public void verifyjenkinsTitle() {
		assertEquals(pageTitle, driver.getTitle());
	}
	
	public void signInButtonIsShown () { 
		
		assertTrue(signInButton.isDisplayed()); 
		}
	
	public void verifyTheElementExists(String string) {
				
		switch (string) {
		
		case "username":
			assertTrue(usernameInput.isDisplayed());
			break;
		case "password":
			assertTrue(passwordInput.isDisplayed());
			break;
		}
				
	}
	
	
}

