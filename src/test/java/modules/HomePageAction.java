package modules;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import pageobjects.HomePageObjects;

public class HomePageAction {

	public static void verifyHeaderLinks(WebDriver driver) {
		
		List<WebElement> items = HomePageObjects.verifyMenuLinks;

		Reporter.log("Found Menu links: ", items.size());
		System.out.println(items.size());
		Assert.assertTrue(items.size() > 5);
		Assert.assertTrue(items.size() < 10);
		for (WebElement links : items) {
			System.out.println(links.getText());
		}
	}
}
