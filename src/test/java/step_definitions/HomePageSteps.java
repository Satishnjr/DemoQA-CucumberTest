package step_definitions;

import java.util.HashMap;
import java.util.List;

import modules.HomePageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.HomePageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.Hooks;

public class HomePageSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public HomePageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, HomePageObjects.class);
	}

	@Given("^user open DemoQA website$")
	public void user_open_DemoQA_website() throws Throwable {
		driver.get("http://demoqa.com/");
	}

	@Then("^user Verify all the links in menu$")
	public void user_Verify_all_the_links_in_menu() throws Throwable {
		HomePageAction.verifyHeaderLinks(driver);

	}

}
