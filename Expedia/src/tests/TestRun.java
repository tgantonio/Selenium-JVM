package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features="src/features",
		glue={"stepdefinition"}
		)

public class TestRun{

}
