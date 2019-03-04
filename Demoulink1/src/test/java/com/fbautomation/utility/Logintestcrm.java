package com.fbautomation.utility;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.leaning.pages.Baseclass;
import com.leaning.pages.Loginpages;

public class Logintestcrm extends Baseclass
{	
	@Test
	public void loginapp() throws InterruptedException
	{
		Loginpages loginPages= new Loginpages(Browserfactory.getDriver());
		loginPages.Logintocrm("ulinktest_20@testmail.com","1234@abcdef");
		Reporter.log("Username and password is inserted",true);
	}
	//
	//@Test
	//public void loginapp1() throws InterruptedException
	//{
		//Loginpages loginPages= new Loginpages(Browserfactory.getDriver());
		//loginPages.Logintocrm1("111111");
		//Reporter.log("Username and password is inserted",true);
	//}
}
