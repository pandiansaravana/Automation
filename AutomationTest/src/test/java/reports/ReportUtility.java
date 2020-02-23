package reports;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.Base;

public class ReportUtility extends Base {

	public void initiateReport() {
		
		File file=new File("C:\\Users\\pandi\\eclipse-workspace\\AutomationTest\\target\\report.html");
		
		
		report=new ExtentReports();ExtentHtmlReporter reporter=new ExtentHtmlReporter(file);
		report.attachReporter(reporter);
		
		test=report.createTest("Test1");		
	
	}
	
	public void closeTheReport()
	{
		report.flush();//to close the report
	}

}
