package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageObjects.Homepage;
import pageObjects.MyAccount;
import pageObjects.loginpage;


public class TC003_LoginDDT extends Baseclasspage {
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups={"Sanity","Regression"})
	public void verify_loginDDT(String email, String password, String exp)
	{
		logger.info("** Starting TC_003_LoginDDT ***");
		
	//	try {
	
		//Home page
			Homepage hp=new Homepage(driver);
			hp.logo();
			hp.login();//Login link under MyAccount
			
				
			//Login page
			loginpage lp=new loginpage(driver);
			lp.emailvalue(email);
			lp.pwdvalue(password);
			lp.loginact(); //Login button 
			
		
			//My Account Page
			MyAccount macc=new MyAccount(driver);
			boolean targetPage=macc.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					lp.contexit();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					lp.contexit();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}			
		//logger.info("** Finished TC_003_LoginDDT ***");
		
	}
