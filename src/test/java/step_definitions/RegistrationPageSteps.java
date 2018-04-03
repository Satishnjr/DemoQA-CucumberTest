package step_definitions;

import java.util.HashMap;
import java.util.List;

import modules.RegistrationPageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.RegistrationPageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public RegistrationPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, RegistrationPageObjects.class);
	}

	@Given("^I open demoqa website$")
	public void i_open_demoqa_website() throws Throwable {
		driver.get("http://demoqa.com/");
	}

	@When("^I click on registration link$")
	public void i_click_on_registration_link() throws Throwable {

		RegistrationPageAction.click(driver);
	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void i_enter_in_input_box(String fname, String lname)
			throws Throwable {
		RegistrationPageAction.registrationForm(fname, lname);
	}

	@When("^I select Single radio button$")
	public void i_select_Single_radio_button() throws Throwable {
		RegistrationPageAction.maritalStatus(driver);
	}

	@When("^I select Cricket check box$")
	public void i_select_Cricket_check_box() throws Throwable {
		RegistrationPageAction.hobby(driver);
	}

	@When("^I select Country from dropdown$")
	public void i_select_Country_from_dropdown() throws Throwable {
		RegistrationPageAction.country();
	}

	@When("^I select Date of Birth from dropdown$")
	public void i_select_Date_of_Birth_from_dropdown() throws Throwable {
		RegistrationPageAction.dateOfBirth(driver);
	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void i_enter_in_input_box(String phone, String uname, String eMail,
			String pwd, String cPwd) throws Throwable {
		RegistrationPageAction.enterData(phone, uname, eMail, pwd, cPwd);
	}

	@Then("^I click on submit button, then the user registration should be successful$")
	public void i_click_on_submit_button_then_the_user_registration_should_be_successful()
			throws Throwable {
		PageFactory.initElements(driver, RegistrationPageObjects.class);
		RegistrationPageAction.submit(driver);
	}

}
