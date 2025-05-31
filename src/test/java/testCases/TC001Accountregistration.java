package testCases;


import org.testng.annotations.Test;
import pageObjects.Homepage;
import pageObjects.RegistrationPage;

public class TC001Accountregistration extends Baseclasspage {
	

		@Test(groups= {"Master","Regression"})
		public void actualtest() {
			Homepage hp=new Homepage(driver);
			logger.info("Execution has begin");
			hp.logo();
			logger.info("Clicked on account button");
			hp.regi();
			logger.info("Clicked on account Registration");
			/*RegistrationPage rp=new RegistrationPage(driver);
			rp.firstname("sagar");
			rp.lastname("keshava");
			rp.email("sagarkeshav5@gmail.com");
			rp.telephone("9050875477");
			rp.password("?Sks864321");
			rp.confmpass("?Sks864321");
			rp.yesrb();
			rp.checkbox();*/
			
			
			RegistrationPage rp=new RegistrationPage(driver);
			logger.info("Actula execution has started");
			
			rp.firstname(randomString().toUpperCase());
			rp.lastname(randomString().toLowerCase());
			rp.email(randomalphnumeric());
			rp.telephone(randomNumberic());
			String passs=randomvalue();
			rp.password(passs);
			rp.confmpass(passs);
			rp.yesrb();
			rp.checkbox();
			rp.conwtinue();
			logger.info("Actul execution has completed");
	
		}
				
	}


	


