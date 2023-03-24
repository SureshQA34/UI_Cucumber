package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import Constants.Constants;
import Pages.AddRolesPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import WEBdriverManage.DriverManager;

public class commonUtils {
	
	
private static commonUtils CommInstance;
	
	private commonUtils() {
		
	}
	
	public static commonUtils getInstance() {
		
		if(CommInstance==null) {
			
			CommInstance = new commonUtils();
		}
		return CommInstance;
		
	}
	
	
	public void LoadProp() {
		
		/*
		 * FileReader reader =null;
		 * 
		 * try { reader = new FileReader("config.properties"); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); }
		 * 
		 * 
		 * 
		 * try { prop.load(reader); } catch (IOException e) { e.printStackTrace(); }
		 */
		
		
		Properties prop = new Properties();
		
		try {
			prop.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Constants.APP_URL= prop.getProperty("APP_URL");
		Constants.BROWSER= prop.getProperty("BROWSER");
		Constants.Email= prop.getProperty("Email");
		Constants.Password= prop.getProperty("Password");
		
		
		
	
		
	}
	
	public void intelement() {
		
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), DashboardPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), AddRolesPage.getInstance());
	}

	public void takescreen() {
		
		File screen = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screen, new File ("C:/Users/DB-L-133/eclipse-workspace/UI_Automation_Cucumber/Screenshots/scree.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	 
	
}
