package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.loginpage;

public class TC001login extends Baseclasspage {
	
	
     @Test(groups= {"Sanity","Regression"})  
	
	public void logintest() {
		
		logger.info("This is the very first step in execution");
		logger.error("here is an error");
	Homepage hop=new Homepage(driver);
		hop.logo();
		hop.login();
		
		loginpage lp=new loginpage(driver);
		logger.info("This is the actual value");
		lp.emailvalue(p.getProperty("email"));
		lp.pwdvalue(p.getProperty("password"));
		lp.loginact();
		
	}
	
}
