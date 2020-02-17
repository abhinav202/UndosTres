package utils;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsLogger {

	static ExtentReports objExtentReports;
	static ExtentHtmlReporter htmlReporter;
	static ExtentTest objExtentTest;
	static String reportPath = System.getProperty("user.dir")+"\\logs\\";		
	private static String currentDate;		
	static ExtentReportsLogger objLogger;
	
	
	//Set the objExtentReports for reporting utility
	public void setExtentReports(String reportName) {
		// initialize ExtentReports 				
		objExtentReports = new ExtentReports();	
		
		//initialize ExtentHTMLReporter
		ExtentHtmlReporter objHtmlReporter = getHtmlReporter(reportName);
		
		//attach reporter to ExtentReports
		objExtentReports.attachReporter(objHtmlReporter);		
	}
	
	private ExtentHtmlReporter getHtmlReporter(String reportName) {
		currentDate = new Date().toString();		
		currentDate = currentDate.replaceAll(":", "_").replaceAll(" ", "_");
		reportPath = reportPath +"\\"+ reportName + currentDate + ".html";
		htmlReporter = new ExtentHtmlReporter(reportPath);	
		
		htmlReporter.config().setDocumentTitle("UndosTres");
		htmlReporter.config().setReportName("UndosTres Recharge Automation Report");
		htmlReporter.config().setTheme(Theme.STANDARD);

		return htmlReporter;
	}
		
	public void createTest(String testName, String testDescription, String testCategory){
		objExtentTest = objExtentReports.createTest(testName, testDescription).assignCategory(testCategory);	
	}
	
	public void logInfoMessage(String strInfoMessage ){
		objExtentTest.log(Status.PASS, strInfoMessage);
	}	
	
	public void logErrorMessage(String strErrorMessage ){		
		objExtentTest.log(Status.ERROR,strErrorMessage);		
	}	
	
	public void logFailMessage(String strErrorMessage ){		
		objExtentTest.log(Status.FAIL,strErrorMessage);						
	}
	
	public void flushLogResults() {
		// writes everything to the log file
		objExtentReports.flush();
							
	}

	//Set the logger 
	public void setLogger(ExtentReportsLogger loggerParam) {	
		objLogger = loggerParam;
	}
	
	//Get the assigned logger
	public static ExtentReportsLogger getLogger() {
		return objLogger;
	}
	
	// Get the assigned objExtentReports after initialization
	public ExtentTest getExtentTest() {
		return objExtentTest;
	}
}

