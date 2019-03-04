package com.fbautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Helper {


	public static void captureScreenshots(WebDriver driver, String methodName)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//Screenshots//"+ methodName + getCurrentDateTime() +".png")); 

			Reporter.log("Screenshoot taken",true);
			System.out.println("Screenshoot captured");

		} catch (IOException e) {

			System.out.println("Unable to capture screenshoot "+e.getMessage());
		}
	}

	public static String getCurrentDateTime()
	{
		SimpleDateFormat customFormat= new SimpleDateFormat("_yyyy_MM_dd_hh_mm_ss");

		Date currentDate=new Date();

		return customFormat.format(currentDate);
	}
}


