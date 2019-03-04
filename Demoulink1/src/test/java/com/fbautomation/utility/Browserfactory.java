package com.fbautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.Reporter;

public class Browserfactory {

	public static WebDriver driver;

	public static WebDriver getDriver()
	{
		return driver;
	}

	public static WebDriver startapplication(String browserName, String appURL)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");  
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("disable-infobars");
			//options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			Reporter.log("Chrome launched",true);

		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");  
			//driver=new FirefoxDriver();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("disable-infobars");
			//options.addArguments("--start-maximized");
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
			Reporter.log("Firefox launched",true);
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");  
			//driver=new InternetExplorerDriver();
			InternetExplorerOptions options = new InternetExplorerOptions();
			//options.addArguments("--disable-extensions");
			//options.addArguments("disable-infobars");
			//options.addArguments("--start-maximized");
			driver = new InternetExplorerDriver(options);
			driver.manage().window().maximize();
			Reporter.log("IE launched",true);
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}
	public static void quitbrowser(WebDriver driver2)
	{
		Reporter.log("Browser closed !!!",true);
		driver.quit();
	}
}

