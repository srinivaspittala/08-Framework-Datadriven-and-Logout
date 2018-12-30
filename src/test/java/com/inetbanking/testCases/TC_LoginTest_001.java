package com.inetbanking.testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	
	public void LoginTest()
	{
		driver.get(baseURL);
		
		logger.info("URL is Opened");
		
		LoginPage lp=new LoginPage(driver);
		
		           lp.setUserName(username);
		           
		           logger.info("Entered Username");
		           		           
		           lp.setPassword(password);
		           
		           logger.info("Entered Password");
		         
		           lp.clickSubmit();
		           
		           logger.info("Clicked Submit Button");
		           
		if(driver.getTitle().equals(exptitle))
		{
			Assert.assertTrue(true);
			
			logger.info("Login test is Passed");
		}
		else
		{
			Assert.assertTrue(false);
			
			logger.info("Login test is Failed");
		}
					
	}
	 
	 
}
