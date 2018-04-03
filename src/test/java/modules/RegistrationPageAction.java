package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.RegistrationPageObjects;

public class RegistrationPageAction {

	public static void click(WebDriver driver) {
		RegistrationPageObjects.registration.click();

	}

	public static void registrationForm(String fname, String lname)
			throws Throwable {

		RegistrationPageObjects.firstName.sendKeys(fname);
		RegistrationPageObjects.lastName.sendKeys(lname);
	}

	public static void maritalStatus(WebDriver driver)
			throws InterruptedException {
		RegistrationPageObjects.singleRadioBtn.click();
	}

	public static void hobby(WebDriver driver) {
		RegistrationPageObjects.cricketCheckBox.click();

	}

	public static void country() {
		// RegistrationPageObjects.countryDropDown.click();
		Select country = new Select(RegistrationPageObjects.countryDropDown);
		country.selectByValue("India");

	}

	public static void dateOfBirth(WebDriver driver)
			throws InterruptedException {
		Select month = new Select(RegistrationPageObjects.monthDropDown);
		month.selectByValue("5");

		Select day = new Select(RegistrationPageObjects.dayDropDown);
		day.selectByIndex(24);

		Select year = new Select(RegistrationPageObjects.yearDropDown);
		year.selectByVisibleText("1991");
		

	}

	public static void enterData(String phone, String uname,
			String eMail, String pwd, String cPwd)  {
		RegistrationPageObjects.phoneNum.sendKeys(phone);
		RegistrationPageObjects.userName.sendKeys(uname);
		RegistrationPageObjects.email.sendKeys(eMail);
		RegistrationPageObjects.password.sendKeys(pwd);
		RegistrationPageObjects.conPassword.sendKeys(cPwd);
		
	}

	public static void submit(WebDriver driver) throws InterruptedException {
		RegistrationPageObjects.submit.click();
		
		Thread.sleep(5000);
		
	}

	public static void verifyLogin(WebDriver driver) {
		System.out.println("All my data has stored already");
		
	}

	public static void verifyErrorMessage(WebDriver driver) throws Throwable {
		String errorMsg = RegistrationPageObjects.error_msg.getText();
		Assert.assertEquals("* This field is required", errorMsg);
		
	}

}
