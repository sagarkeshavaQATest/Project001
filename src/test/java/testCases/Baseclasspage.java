package testCases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class Baseclasspage {
public WebDriver driver;
public Logger logger;
public Properties p;
	
	@BeforeClass(groups= {"Master","Sanity","Regression"})
	@Parameters({"os","browser"})
	public void setup(String os,String bro) throws IOException {
		
		
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();	
		p.load(file);
		logger=LogManager.getLogger(this.getClass());
		switch(bro.toLowerCase()){
		case "chrome":driver=new ChromeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		case "edge":driver=new EdgeDriver();break;
		default:System.out.println("no browser found");return;
		
			
		}
		
		//driver=new ChromeDriver();
		
		driver.get(p.getProperty("appurl"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
	}
	public String randomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}
	public String randomNumberic() {
		String generatenumber=RandomStringUtils.randomNumeric(10);
		return generatenumber;
	}
	public String randomalphnumeric() {
		String generaredalphanumeric=RandomStringUtils.randomAlphanumeric(3);
		return (generaredalphanumeric+"@gmail.com");
	}
	
	public String randomvalue() {
		String pass1=RandomStringUtils.randomNumeric(5);
		String pass2=RandomStringUtils.randomAlphabetic(10);
		return (pass1+"@"+pass2);
	}
	
	public String captureScreenshot(String tname) {
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		File source=takescreenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\screenshots01\\"+tname+"-"+timestamp+".png";
		
		try {
			FileUtils.copyFile(source, new File(destination));
		}
		catch(Exception e) {
			e.getMessage();
		}
		return destination;
		
		
	}
	@AfterClass(groups= {"Master","Sanity","Regression"})
	public void tearout() {
		driver.quit();
	}

}
