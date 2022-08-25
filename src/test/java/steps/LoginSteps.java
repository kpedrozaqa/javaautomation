package steps;

import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	
	WebDriver driver = new ChromeDriver();

	@Given("i navigate to Jenkins")
	    public void i_navigate_to_jenkins() {
	    	LoginPage loginPage = new LoginPage();
	    	try {
		    	loginPage.navigateToJenkins(driver);
	    	} catch (Exception e) { e.printStackTrace(); }
	    	
	}
	
	@When("the page loads")
	public void the_page_loads() {
		LoginPage loginPage = new LoginPage();
		loginPage.verifyjenkinsTitle(driver);
	}

	@Then("the {string} input is displayed")
	public void the_input_is_displayed(String string) {
		System.out.println();
		LoginPage loginPage = new LoginPage();
		try {
			loginPage.verifyTheElementExists(string, driver);
		} catch (Exception e) { e.printStackTrace(); 
			}
	}
	
	@Then("the Sign In button is displayed$")
	public void the_sign_button_is_displayed() {
		LoginPage loginPage = new LoginPage();
		loginPage.signInButtonIsShown(driver);
	}

}
