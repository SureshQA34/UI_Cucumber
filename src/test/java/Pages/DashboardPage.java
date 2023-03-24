package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
private static DashboardPage dashInstance;
	
	private DashboardPage() {
		
	}
	
	public static DashboardPage getInstance() {
		
		if(dashInstance==null) {
			
			dashInstance = new DashboardPage();
		}
		return dashInstance;
		
	}
	
	@FindBy(xpath="//li[normalize-space()='Admin Roles']") public static WebElement adminroles;
	@FindBy(xpath="//button[@class='green-btn']") public static WebElement clickAdd ;
	@FindBy(xpath="//*[@class='MuiTableBody-root css-1xnox0e']/tr[1]/td[1]") public static WebElement Verify ;

	
	
	public void click_adminrole() {
		adminroles.click();
	}
	
	public void click_addRoleButton() {
		clickAdd.click();
	}

	public String Verify_addRole() {
		
		return Verify.getText();
	}


	
	
}




