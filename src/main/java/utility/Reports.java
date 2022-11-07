package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports createReports() {
		
		ExtentSparkReporter htmlReports = new ExtentSparkReporter("extentreport.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReports);
		reports.setSystemInfo( "Created", "Deepak");
		reports.setSystemInfo("Type", "Regression");
		return reports;
		
		
	}

}
