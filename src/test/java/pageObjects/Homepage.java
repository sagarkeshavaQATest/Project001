package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends BasePage {
WebDriver driver;
	
	
	public Homepage(WebDriver driver){
		super(driver);
	}
	

	  @FindBy (xpath="//a[@title='My Account']")
	WebElement titleclick;
	  @FindBy (xpath="//a[normalize-space()='Register']")
	  WebElement registerbuton;
	  @FindBy (xpath="//a[normalize-space()='Login']")
	  WebElement loginbutton;
	  @FindBy (xpath="//a[normalize-space()='Logout']")
	  WebElement loginoutbutton;
	  @FindBy (xpath="//a[normalize-space()='Continue']")
	  WebElement conexitbutton;
	 
	  
	  
	  public void logo() {
		  titleclick.click();
	  }
	  public void regi() {
		  registerbuton.click();
	  }
	  public void login() {
		  loginbutton.click();
	  }
	  public void logout() {
		  loginoutbutton.click();
	  }
	  public void contexit() {
		  conexitbutton.click();
	  }
	  
	 
	  

}

