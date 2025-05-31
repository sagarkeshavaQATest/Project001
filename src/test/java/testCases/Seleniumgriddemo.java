package testCases;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Seleniumgriddemo {
	
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		//caps.setPlatform(Platform.);

		
		
		WebDriver driver = new RemoteWebDriver(new URI("http://172.20.10.11:4444").toURL(), caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("SHIVA");
		Thread.sleep(3000);
		driver.close();
	
	}
	
		
}


