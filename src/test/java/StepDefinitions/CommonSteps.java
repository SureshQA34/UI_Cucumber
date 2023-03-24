package StepDefinitions;










import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import Constants.Constants;
import Utils.commonUtils;
import WEBdriverManage.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CommonSteps {
	
	//public static WebDriver driver;
	
	public static Logger logger = Logger.getLogger(CommonSteps.class);
	
 
	
	@Before()
	public void beforeScenario() {
		
		PropertyConfigurator.configure("C:/Users/DB-L-133/eclipse-workspace/UI_Automation_Cucumber/src/test/resources/log4j.properties");
		//logger.info("Start Execution");
		try {
			//logger.info("Driver start");
		commonUtils.getInstance().LoadProp();
			
			if(DriverManager.getDriver() == null) 
			{
			DriverManager.launchbrowser();
			//logger.info("Start browser");
			commonUtils.getInstance().intelement();
		    }
		  }catch(Exception e) {
		   e.printStackTrace();
	}
		
		
		

}

/*
 * public void launchbrowser() {
 * 
 * try { switch (Constants.BROWSER) { case "chrome":
 * 
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
 * driver.manage().deleteAllCookies(); driver.manage().window().maximize();
 * break;
 * 
 * case "Firefox":
 * 
 * WebDriverManager.firefoxdriver().setup();; driver = new FirefoxDriver();
 * break;
 * 
 * default: WebDriverManager.chromedriver().setup(); driver = new
 * ChromeDriver(); break; } }catch(Exception e){
 * 
 * e.printStackTrace();
 * 
 * } }
 */
	
	
	
	
	
	
	
	 @AfterStep 
	 
	 public void attachscreenshot(Scenario scenario) {
	 
	  if(scenario.isFailed()) {
	  
	  byte[] screen = ((TakesScreenshot)
	 DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	 
	 scenario.attach(screen, "image/png", "errorScreen"); }
	 
	  }
	



  
    

}