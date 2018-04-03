package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPageObjects extends BaseClass {

	public RegistrationPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "a[href*='registration']")
	public static WebElement registration;

	@FindBy(how = How.NAME, using = "first_name")
	public static WebElement firstName;

	@FindBy(how = How.NAME, using = "last_name")
	public static WebElement lastName;

	@FindBy(how = How.CSS, using = "input[value='single']")
	public static WebElement singleRadioBtn;

	@FindBy(how = How.CSS, using = "input[value='cricket ']")
	public static WebElement cricketCheckBox;

	@FindBy(how = How.CSS, using = "#dropdown_7")
	public static WebElement countryDropDown;

	@FindBy(how = How.ID, using = "mm_date_8")
	public static WebElement monthDropDown;

	@FindBy(how = How.ID, using = "dd_date_8")
	public static WebElement dayDropDown;

	@FindBy(how = How.ID, using = "yy_date_8")
	public static WebElement yearDropDown;

	@FindBy(how = How.CSS, using = "#phone_9")
	public static WebElement phoneNum;

	@FindBy(how = How.CSS, using = "#username")
	public static WebElement userName;

	@FindBy(how = How.NAME, using = "e_mail")
	public static WebElement email;

	@FindBy(how = How.CSS, using = "#password_2")
	public static WebElement password;

	@FindBy(how = How.ID, using = "confirm_password_password_2")
	public static WebElement conPassword;

	@FindBy(how = How.NAME, using = "pie_submit")
	public static WebElement submit;
}
