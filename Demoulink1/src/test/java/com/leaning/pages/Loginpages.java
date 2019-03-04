package com.leaning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Loginpages
{
	public Loginpages(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="email")
	WebElement email1;
	@FindBy(name="password")
	WebElement pass;

	@FindBy(xpath="//button[@type='submit'][text()='  Login']")WebElement login;

	
	@FindBy(xpath="//span[@class='radio'][@id='mobileRadioSpan']")
    WebElement checkbox1;

	@FindBy(xpath=".//*[@for='emailRadio']//following::span[@id='emailRadioSpan']")
    WebElement checkbox2;
	
	@FindBy(xpath="//span[@class='radio'][@id='mobileRadioSpan']")
    WebElement checkbox3;
	
	@FindBy(xpath=".//*[@class='btn-container']//following::button[@onclick='sendIdentificationCode();']")
	//@FindBy(xpath="//div[@class='btn-container']//button[@type='button'][contains(text(),'Continue')]")
	WebElement conformbutton1;
	
	@FindBy(xpath=".//*[@class='has-feedback']//following::input[@id='identityCode'][@name='identityCode']")
	WebElement textbox1;

	@FindBy(xpath=".//*[@class='btn-container btn-multiple']//following::button[text()='Submit']")
	WebElement Submit2;
	//@FindBy(xpath="//button[@class='btn btn-success'][@value='register']")
	//WebElement proceedButton;

	public void Logintocrm(String email2,String password1) throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		email1.sendKeys(email2);
		Reporter.log("User entered "+email2,true);

		Thread.sleep(2000);
		pass.sendKeys(password1);
		Reporter.log("User entered "+password1,true);

		Thread.sleep(2000);
		login.click();
		Reporter.log("User clicked on login button ",true);

		Thread.sleep(2000);
		checkbox1.click();
		Reporter.log("User clicked on Mobile checkbox1 ",true);
		
		Thread.sleep(2000);
		checkbox2.click();
		Reporter.log("User clicked on Mobile checkbox2 ",true);
		
		Thread.sleep(2000);
		checkbox3.click();
		Reporter.log("User clicked on Mobile checkbox3 ",true);
		
		Thread.sleep(2000);
		conformbutton1.click();
		Reporter.log("User click on the conformbutton ",true);
		
		Thread.sleep(2000);
		textbox1.sendKeys("221122");
		Reporter.log("Insert value in textbox ",true);
		
		Thread.sleep(2000);
		Submit2.click();;
		Reporter.log("Click on submit button ",true);
		
		//Thread.sleep(2000);
		//((JavascriptExecutor) Browserfactory.getDriver()).executeScript("arguments[0].click();", checkbox1);
		//Reporter.log("User clicked on  registerComputerCheck checkbox",true);

		//Thread.sleep(2000);
		//((JavascriptExecutor) Browserfactory.getDriver()).executeScript("arguments[0].click();", checkbox2);
		//Reporter.log("User clicked on termsAndConditions checkbox",true);

		//Thread.sleep(2000);
		//((JavascriptExecutor) Browserfactory.getDriver()).executeScript("arguments[0].click();", proceedButton);
		//Reporter.log("User clicked on Proceed button ",true);

		//Thread.sleep(2000);
		//Assert.assertEquals(driver.getCurrentUrl(), "https://10.72.12.74:8443/registerEnterCode", "Url is not same");
		//Reporter.log("Url is same as expected !!!",true);
	}
	//public void Loginpages1(WebDriver driver)
	//{
		//PageFactory.initElements(driver,this);
	//}
	//@FindBy(xpath=".//*[@class='required-field-block has-feedback']//following::input[@id='inputSuccess2'][@aria-describedby='inputSuccess2Status']")
	//WebElement email4;
	//@FindBy(xpath="//button[@class='btn btn-success'][@type='submit']")
	//WebElement proced1;

	//public void Logintocrm1(String email3) throws InterruptedException
	//{
		
		//email4.sendKeys(email3);
		//Reporter.log("User entered varification value "+email3,true);
		
		//Thread.sleep(2000);
		//proced1.click();
		//Reporter.log("Proced button is clicked ",true);
			//}
	}
