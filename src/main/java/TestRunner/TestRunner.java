package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\teerthp\\eclipse-workspace\\FreecrmBDDframework\\src\\main\\java\\Feature\\addcontact.feature", //the path of the feature files
		glue={"stepDefination"},//the path of the step definition files
		plugin= {"pretty","html:test-outout/test.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun = false, // check if all corrosponding  step definition are present 
		monochrome = true // display console output in readable format
		//strict = true
		)

public class TestRunner {

}
