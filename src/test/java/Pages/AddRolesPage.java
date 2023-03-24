package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRolesPage {
	
	private static AddRolesPage RolesInstance;
	
private AddRolesPage() {
		
	}
	
	public static AddRolesPage getInstance() {
		
		if(RolesInstance==null) {
			
			RolesInstance = new AddRolesPage();
		}
		return RolesInstance;
		
	}
	
	@FindBy(xpath="//input[@placeholder='Enter here']") public static WebElement enterRole;
	@FindBy(xpath="//button[@class='green-btn']") public static WebElement clickSave ;
	@FindBy(xpath="//label[normalize-space()='Dashboard']") public static WebElement Select_Permission ;
	
	public void enter_rollname(String roll) {
		
		enterRole.sendKeys(roll);
		
		
	}
	
     public void Click_Save() {
    	 clickSave.click();
	}

    public void addRole(String roll) {
    	
    	enterRole.sendKeys(roll);
    	Select_Permission.click();
    	clickSave.click();
    }
	
	

}
