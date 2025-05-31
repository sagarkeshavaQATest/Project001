package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePage{
	
	WebDriver driver;
	
	
	public RegistrationPage(WebDriver driver){
		super(driver);
	}
	

	  @FindBy (xpath="//input[@id='input-firstname']")
	WebElement firstnameinput;
	  @FindBy (xpath="//input[@id='input-lastname']")
		WebElement Lastnameinput;
	  @FindBy (xpath="//input[@id='input-email']")
		WebElement emailinput;
	  @FindBy (xpath="//input[@id='input-telephone']")
		WebElement telephoneinput;
	  @FindBy (id="input-telephone")
		WebElement passwordinput;
	  @FindBy (xpath="//input[@id='input-confirm']")
		WebElement confirmpassinput;
	 
	  @FindBy (xpath="//label[normalize-space()='Yes']")
		WebElement yesradioinput;
	  @FindBy (xpath="//input[@name='agree']")
		WebElement checkboxinput;
	  
	  @FindBy (xpath="//input[@value='Continue']")
	  WebElement continueinput;
	
	  
	  public void firstname(String firstname) {
		  
		  firstnameinput.sendKeys(firstname);
		  
	  }
 public void lastname(String lastname) {
		  Lastnameinput.sendKeys(lastname);
		  
	  } public void email(String email) {
		  
		  emailinput.sendKeys(email);
		  
	  } public void telephone(String telephone) {
		  
		  telephoneinput.sendKeys(telephone);
		  
	  } public void password(String password) {
		  
		  passwordinput.sendKeys(password);
		  
	  } public void confmpass(String confmpass) {
		  
		 confirmpassinput.sendKeys(confmpass);
		  
	  } public void yesrb() {
		  
		 yesradioinput.click();
		  
	  } public void checkbox() {
		  
		  checkboxinput.click();
		  
	  }
	  public void conwtinue() {
		  continueinput.click();
	  }

}
