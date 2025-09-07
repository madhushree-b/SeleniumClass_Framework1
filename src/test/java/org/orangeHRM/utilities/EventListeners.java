package org.orangeHRM.utilities;

import org.orangeHRM.allGenericScripts.I_ApplicationContants;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class EventListeners implements ITestListener, I_ApplicationContants
{
	ExtentSparkReporter reporter; //ExtentSparkReporter Will create a document for the report generation
	ExtentReports reports; //ExtentReports will generate the report and add it to the document created by ExtentSparkReporter
	
	public void onStart(ITestContext context)
	{
		//Initializing report generation
		reporter= new ExtentSparkReporter(reportsPath+" "+context.getName() +"_"+ GetSystemTime.getcurrentTime()+".png");
		
		String docTitle = null;
		String reportTitle = null;
		try {
			docTitle = ReadFileProperty.readData("reportDocumentTitle");
			reportTitle = ReadFileProperty.readData("reportName");
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reporter.config().setDocumentTitle(docTitle);
		reporter.config().setReportName(reportTitle);
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		
		
		System.out.println("The suite "+context.getName()+ " exectution is started");
	}
	
	public void onFinish(ITestContext context)
	{
		//Terminating report execution
		reports.flush();
		
		
		System.out.println("The suite "+context.getName()+ " exectution is Completed");
	}
	
	public void onTestStart(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.INFO,result.getName()+" execution is started");
		
		
		System.out.println("The testcase "+result.getName()+ " exectution is Started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.PASS,result.getName()+" execution is Passed");
		
		System.out.println("The testcase "+result.getName()+ " exectution is Scccessful");
	}
	
	public void onTestFailure(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.FAIL,result.getName()+" execution is started");
		
		System.out.println("The testcase "+result.getName()+ " exectution is failed");
		try 
		{
			DefectsScreenshot.defectscreenshot(result.getName());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		ExtentTest test = reports.createTest(result.getName());
		test.log(Status.SKIP,result.getName()+" execution is skipped");
		
		System.out.println("The testcase "+result.getName()+ " exectution is Skipped");
	}
}
