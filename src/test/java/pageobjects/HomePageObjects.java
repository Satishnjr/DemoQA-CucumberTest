package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageObjects extends BaseClass {

	public HomePageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBys(@FindBy(css = "#menu-primary-menu > li"))
	public static List<WebElement> verifyMenuLinks;

}
