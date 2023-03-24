package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Constants.Constants;
import Pages.AddRolesPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Utils.commonUtils;
import WEBdriverManage.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddRoleSteps {

	public static Logger logger = Logger.getLogger(AddRoleSteps.class);

	@Given("User login successfully")
	public void user_login_successfully() {

		// LoginPage.email.sendKeys(Constants.Email);
		 //LoginPage.pass.sendKeys(Constants.Password);
		 //LoginPage.button.click();
		try {
			DriverManager.getDriver().get(Constants.APP_URL);
		logger.info("Application is opened");
			LoginPage.getInstance().dologin(Constants.Email, Constants.Password);
		logger.info("Login successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			// commonUtils.getInstance().takescreen();
		}

	}

	@When("User clicks on the admiin role page")
	public void user_clicks_on_the_admiin_role_page() {

		try {
			DashboardPage.getInstance().click_adminrole();
			logger.info("Click on the adminrole page");

		} catch (Exception e) {
			e.printStackTrace();
			// commonUtils.getInstance().takescreen();
		}

	}

	@Then("User clicks on the add role button")
	public void user_clicks_on_the_add_role_button() {
		try {
			DashboardPage.getInstance().click_addRoleButton();
			logger.info("Click on the add role button");
		} catch (Exception e) {
			// commonUtils.getInstance().takescreen();

		}

	}

	@Then("User enters the rollname {string} click on the save button")
	public void user_enters_the_rollname_click_on_the_save_button(String roll) {

		try {
			AddRolesPage.getInstance().addRole(roll);
			logger.info("Add the role successfully");

		} catch (Exception e) {
			// commonUtils.getInstance().takescreen();

		}

	}

	@Then("Verify the added roles in list {string}")
	public void verify_the_added_roles_in_list(String expected) {

	
		
	
		 String actual = DashboardPage.getInstance().Verify_addRole(); 
		 if(actual.equalsIgnoreCase(expected)){ 
			 System.out.println(actual); 
			 }
		 DriverManager.Closeb();
		
	}

}
