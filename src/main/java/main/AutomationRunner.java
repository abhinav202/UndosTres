package main;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.ExtentReportsLogger;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
				glue = "stepDefinitions",
				strict = true,
				monochrome = true
				//plugin = {"pretty", "html:target/HTMLReport"}
)

public class AutomationRunner {
	
	private static ExtentReportsLogger extentReportsLogger;
	
	// Get the assigned logger after initialization
	public static ExtentReportsLogger getLogger() {
		if(extentReportsLogger == null) {
			extentReportsLogger = new ExtentReportsLogger();
			initializeLogger();
		}
		return extentReportsLogger;
		
	}
	
	private static void initializeLogger() {
		//extentReportsLogger = new ExtentReportsLogger();
		extentReportsLogger.setExtentReports("UndosTres Recharge");		
		extentReportsLogger.setLogger(extentReportsLogger);
	}
	
}
