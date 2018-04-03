package step_definitions;

import java.net.MalformedURLException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid
	 * shared state between tests
	 */
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\2.33\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		DOMConfigurator.configure("log4j.xml");

	}

	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());

				byte[] screenshot = ((TakesScreenshot) driver)
						.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException e ) {
				System.out.println(e.getMessage());
						
			}

		}
		driver.quit();

	}
}
/*
 * @After public void embedScreenshot(ITestResult result) throws Throwable { if
 * (ITestResult.FAILURE == result.getStatus()) { try { TakesScreenshot ts =
 * (TakesScreenshot) driver; File source = ts.getScreenshotAs(OutputType.FILE);
 * 
 * FileUtils.copyFile(source, new File(
 * "D:\\BitBucket\\teluguvideos\\ScreenShots.jpeg")); //String res =
 * result.getName();
 * 
 * 
 * } catch (Exception e) {
 * 
 * System.out.println("Exception while Taking ScreenShot"); }
 * 
 * } } }
 */

/*
 * @Before
 *//**
 * Delete all cookies at the start of each scenario to avoid shared state
 * between tests
 */
/*
 * public static WebDriver openBrowserNexus() throws MalformedURLException {
 * System.out.println("Called openBrowser");
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\chromedriver_win32\\2.33\\chromedriver.exe"); driver = new
 * ChromeDriver(); driver.manage().deleteAllCookies();
 * driver.manage().window().setSize(new Dimension(412, 732));
 * 
 * return driver; }
 */