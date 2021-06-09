package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Kirti\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\freecrm.feature", //the path of the feature file
		glue={"com/qa/stepDefinitions"}, //the path of the step definition files		
		plugin = {"pretty","html:test-outout","json: json_output\\cucumber.json", "junit:junit_xml\\cucumber.xml"}, // to generate diff types of reporting
		monochrome = true, //to display the console output in a proper readable format
		strict = true,  //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping between feature file & step definition file
		//tags = {"~@SmokeTest","~@RegressionTest","~@End2End"}
		)

public class TestRunner {

}
