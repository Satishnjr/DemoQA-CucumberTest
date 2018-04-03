package step_definitions;

import java.util.HashMap;
import java.util.List;

import modules.RegistrationPageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.RegistrationPageObjects;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Hooks;

public class RegistrationPageSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public RegistrationPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, RegistrationPageObjects.class);
	}

	@Given("^user open demoqa website$")
	public void user_open_demoqa_website() throws Throwable {
		driver.get("http://demoqa.com/");
	}

	@When("^user click on registration link$")
	public void user_click_on_registration_link() throws Throwable {

		RegistrationPageAction.click(driver);
	}

	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void user_enter_in_input_box(String fname, String lname)
			throws Throwable {
		RegistrationPageAction.registrationForm(fname, lname);
	}

	@When("^user select Single radio button$")
	public void user_select_Single_radio_button() throws Throwable {
		RegistrationPageAction.maritalStatus(driver);
	}

	@When("^user select Cricket check box$")
	public void user_select_Cricket_check_box() throws Throwable {
		RegistrationPageAction.hobby(driver);
	}

	@When("^user select Country from dropdown$")
	public void user_select_Country_from_dropdown() throws Throwable {
		RegistrationPageAction.country();
	}

	@When("^user select Date of Birth from dropdown$")
	public void user_select_Date_of_Birth_from_dropdown() throws Throwable {
		RegistrationPageAction.dateOfBirth(driver);
	}

	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void user_enter_in_input_box(String phone, String uname, String eMail,
			String pwd, String cPwd) throws Throwable {
		RegistrationPageAction.enterData(phone, uname, eMail, pwd, cPwd);
	}
	
	@And("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		RegistrationPageAction.submit(driver);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		RegistrationPageAction.verifyLogin(driver);
	}
	
	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
		RegistrationPageAction.verifyErrorMessage(driver);
	}

}
