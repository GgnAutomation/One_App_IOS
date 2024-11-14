package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.qameta.allure.Allure;

public class listner extends Base_Utility implements ITestListener {

	ExtentReports extent = getreports();
	ThreadLocal<ExtentTest> extent_test = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName() + " = " + result.getMethod().getMethodName());

		extent_test.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		test = test.log(Status.PASS, "Test Case Pass");
		extent_test.set(test);
	}

	public void onTestFailure(ITestResult result) {
		test = test.log(Status.FAIL, "Test Case Fail");
		test = test.addScreenCaptureFromPath(getcapcture(result.getName()));
		getcapcture(result.getName());
		extent_test.set(test);

	}

	public void onTestSkipped(ITestResult result) {
		test = test.log(Status.SKIP, "Test Case Skip");
		test = test.addScreenCaptureFromPath(getcapcture(result.getName()));
		getcapcture(result.getName());
		extent_test.set(test);
	}

	public void onFinish(ITestContext context) {
		extent.flush();

	}

	public String getcapcture(String screenshot_name) {
		String destination = System.getProperty("user.dir") + "/failed_Tests_ScreenShots/" + screenshot_name + ".png"
				+ date_and_Time("dd-MM-yyyy_hh mm ss");
		try {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File finaldestination = new File(destination);
			FileUtils.copyFile(source, finaldestination);
			Allure.addAttachment("Page Screenshot", FileUtils.openInputStream(finaldestination));
		} catch (Exception e) {
			System.out.println(e);
		}
		return destination;
	}

//		public void getScreenShot(String foldername, String filename) {
//			String path = System.getProperty("user.dir") + "\\Screen_Shot\\" + foldername + "\\" + filename + ".png";
//			try {
//				@SuppressWarnings("deprecation")
//				EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
//				@SuppressWarnings("deprecation")
//				File src = ewf.getScreenshotAs(OutputType.FILE);
//				FileUtils.copyFile(src, new File(path));
//			} catch (Exception e) {
//				System.out.println("Problem in getScreen shot meythod" + e);
//				
//			}
	public String date_and_Time(String formate) {
		String value = "";
		try {
			Date db = new Date();
			DateFormat df = new SimpleDateFormat(formate);
			value = df.format(db);
		} catch (Exception e) {
			System.out.println("Problem in data and time" + e);
		}
		return value;
	}

}

//code for location handle
//HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
//HashMap<String, Object> profile = new HashMap<String, Object>(); 
//HashMap<String, Object> prefs = new HashMap<String, Object>();
//
//contentSettings.put("notifications", 2);// 0 is ask  , 1 is allow , 2 is block
//
//contentSettings.put("geolocation", 1);
//
//contentSettings.put("media_stream", 1);
//
//profile.put("managed_default_content_settings", contentSettings);
//
//prefs.put("profile", profile);
//
//co.setExperimentalOption("prefs", prefs);
