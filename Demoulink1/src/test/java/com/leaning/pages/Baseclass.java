package com.leaning.pages;

import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.fbautomation.utility.Browserfactory;
import com.fbautomation.utility.Helper;

public class Baseclass {

	@Parameters({"browser", "appURL"})
	@BeforeClass
	public void setup(String browserName, String appURL)
	{
		Browserfactory.startapplication(browserName, appURL);
		Browserfactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	//@AfterClass
	//public void tearDown()
	//{
		//Browserfactory.quitbrowser(Browserfactory.getDriver());
	//}

	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshots(Browserfactory.getDriver(), result.getName());
			Reporter.log("Screenshoot taken",true);
		}
	}
}
