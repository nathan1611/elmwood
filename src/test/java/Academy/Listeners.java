package Academy;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listeners implements ITestListener {
	
	ExtentReports extent;
	
public void	onTestStart(ITestResult result) {
	   System.out.println("inside the listener");
	  }
	
public void onTestSuccess(ITestResult result) {
	String path=System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter report=new ExtentSparkReporter(path);
	report.config().setDocumentTitle("test report");
	extent = new ExtentReports();
	extent.attachReporter(report);
	ExtentTest test = extent.createTest("name");
	extent.flush();
	
    
  }

 
  public void onTestFailure(ITestResult result) {
	  System.out.println(result.getMethod());
    // not implemented
  }

 public void onTestSkipped(ITestResult result) {
    // not implemented
  }

 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // not implemented
  }

 public void onTestFailedWithTimeout(ITestResult result) {
    onTestFailure(result);
  }

  public void onStart(ITestContext context) {
    // not implemented
  }

 public void onFinish(ITestContext context) {
    // not implemented
  }
}
