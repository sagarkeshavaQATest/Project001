package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends BasePage {
	WebDriver driver;
	
	public loginpage(WebDriver driver){
		super(driver);
	}
	
	@FindBy (xpath="//input[@id='input-email']")
	WebElement emailtf;
	
	@FindBy (xpath="//input[@id='input-password']")
	WebElement passwordtf;
	@FindBy (xpath="//input[@type='submit']")
	WebElement loginbutton;
	@FindBy (xpath="//div[@class='list-group']//a[text()='Logout']")
	  WebElement loginoutbutton;
	  @FindBy (xpath="//a[normalize-space()='Continue']")
	  WebElement conexitbutton;
	
	
	public void emailvalue(String emailtxt) {
		emailtf.sendKeys(emailtxt);
	}
	public void pwdvalue(String pwdtxt) {
		passwordtf.sendKeys(pwdtxt);
	}
	public void loginact() {
		loginbutton.click();
	}
	public void logout() {
		  loginoutbutton.click();
	  }
	  public void contexit() {
		  conexitbutton.click();
	  }

	
}
