package day10.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistenerclasses implements ITestListener {
	  public void onStart(ITestContext context) {
		 System.out.println("Start Test");
		  }
	  public void onTestStart(ITestResult result) {
		   System.out.println("Tets is started");
		  }
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test is successed");
		  }
	  public void onTestFailure(ITestResult result) {
		    System.out.println("Test is failed");
		  }
	  public void onTestSkipped(ITestResult result) {
		   System.out.println("Test is skipped");
		  }
	  public void onFinish(ITestContext context) {
		  System.out.println("Test is finished");
		  }
	  

}
