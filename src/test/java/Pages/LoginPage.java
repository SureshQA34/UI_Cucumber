package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	
	private static LoginPage loginInstance;
	
	private LoginPage() {
		
	}
	
	public static LoginPage getInstance() {
		
		if(loginInstance==null) {
			
			loginInstance = new LoginPage();
		}
		return loginInstance;
		
	}
	
	@FindBy(xpath="//input[@placeholder='Enter Email ID']") public static WebElement email;
	@FindBy(xpath="//input[@placeholder='Enter your password']") public static WebElement pass;
	@FindBy(xpath="//button[@class='sign-in-button background-color-green ']") public static WebElement button;
	
	public void dologin(String eid ,String pword) {
		
		email.sendKeys(eid);
		pass.sendKeys(pword);
		button.click();
	}
	
	
	

}
