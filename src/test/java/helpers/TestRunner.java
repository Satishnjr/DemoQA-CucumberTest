package helpers;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = { "pretty",
		"html:target/cucumber-html-report", "json:cucumber.json" }, tags = {}, monochrome=true, glue = {"helpers","step_definitions"})
public class TestRunner {

}
