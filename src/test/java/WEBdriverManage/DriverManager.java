package WEBdriverManage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	


	public static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		return driver;
	}

	
	public static void launchbrowser() {
		
		   try {
				switch (Constants.BROWSER) {
				case "chrome":
					ChromeOptions option = new ChromeOptions();
		            option.addArguments("--remote-allow-origins=*");
					WebDriverManager.chromedriver().setup();
					 driver = new ChromeDriver(option);
					 driver.manage().deleteAllCookies();
				     driver.manage().window().maximize();
				     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					break;
					
		       case "Firefox":
		    	   
		    	   WebDriverManager.firefoxdriver().setup();;
					driver = new FirefoxDriver();
					break;

				default:
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
				}
				}catch(Exception e){
					
					e.printStackTrace();
					
				}
			}
	
			
			  public static void Closeb() {
			 
			driver.close(); }
			 
}
