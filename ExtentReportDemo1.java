package ExtentReportDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportDemo1 
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest childExtentLogger;
	public static ExtentTest parentExtentLogger;

	@Test
	public void ExtentReportDemo()
	{
		htmlReporter=new ExtentHtmlReporter("C:\\Users\\Admin\\OneDrive\\Desktop\\Selenium Demo\\ExtentReports\\Test1.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger=extent.createTest("Test1");
		childExtentLogger=parentExtentLogger.createNode("Scenario1");
		childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		extent.flush();
		System.out.println("Done");
		system.out.println("Ajith");
	}

}



