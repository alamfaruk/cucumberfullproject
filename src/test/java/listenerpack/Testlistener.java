package listenerpack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import utilities.Commons;

public class Testlistener extends Commons implements ITestListener {
	@Override
	public void onStart(ITestContext context) {
	configreport();
		
		log.info("on start listener,extent report configurtion done");
	}

	@Override
	public void onFinish(ITestContext context) {
		  extent.flush();
		  log.info("on finish listener,extent report configurtion done");
	}
	@Override
	public void onTestStart(ITestResult result) {
		log.info("ontest start,now executing :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver=((Commons)result.getInstance()).driver;
		test=extent.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel("name of the passed method :"+result.getName(),ExtentColor.GREEN));
	//	test.addScreenCaptureFromPath(capturessfor("Allsuccess"),"succesfully verify hompage ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver=((Commons)result.getInstance()).driver;
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("name of the passed method :"+result.getName(),ExtentColor.RED));
		//test.addScreenCaptureFromPath(capturessfor("Allfailed"),"verify hompage failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("name of the passed method :"+result.getName(),ExtentColor.YELLOW));	
	}


	
	

}
