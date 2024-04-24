package pspTechCucumber.karigor.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pspTechCucumber.karigor.baseClass.BaseClass;
import pspTechCucumber.karigor.browserFactory.BrowserFactory;
import pspTechCucumber.karigor.pages.Home;
import pspTechCucumber.karigor.utilities.CommonMethods;



public class StepDefinitions extends BaseClass{

	public StepDefinitions() {
		super(driver);
	}
	Home home;
	@When("User enters valid URL for Karigor Production at the address bar")
	public void user_enters_valid_url_for_karigor_production_at_the_address_bar() {
		driver= BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized - Opening Home Page");
		home = PageFactory.initElements(driver, Home.class);
		CommonMethods.maximizeBrowser();
		CommonMethods.getTitle(driver, "Karigor Production and Cultural Society");
		CommonMethods.getUrl(driver, "https://karigorproduction.com/"); 
	    
	}
	@And("Press Enter button")
	public void press_enter_button() {
	 
	}
	@Then("System navigates to Home page of Karigor Production")
	public void system_navigates_to_home_page_of_karigor_production() {
	  
	}
	@And("System displays the title of Karigor Production")
	public void system_displays_the_title_of_karigor_production() {
	    
	}

	
	

}
