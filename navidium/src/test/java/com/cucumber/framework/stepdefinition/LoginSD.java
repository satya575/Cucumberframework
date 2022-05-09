package com.cucumber.framework.stepdefinition;

import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage.HomePage;
import com.cucumber.framework.helper.PageObject.loginPage.LoginPage;
import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage.Wait.WaitHelper;
import com.cucumber.framework.settings.ObjectRepo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSD {

	private LoginPage lPage;
	private HomePage hPage;
	private WaitHelper helper;

	@Then("^login to navidium application$")
	public void login() throws Exception  {
		lPage = (LoginPage) ObjectRepo.data.get("LoginPage");
		lPage.logIn();

	}
	@Given("^I am at the login page$")
	public void loginPage(){
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());
		lPage = new LoginPage(ObjectRepo.driver);
		ObjectRepo.data.put("LoginPage",lPage);
	}

	@When("^I login to the application$")
	public void i_login_to_the_application()throws Exception{
		lPage.logIn();
	}
	@When("^I click on logout button$")
	public void i_click_on_logout_button()throws Exception  {
		hPage.logout();
	}
	@Then("^I verify the title of the page \"([^\"]*)\"$")
	public void i_verify_the_title_of_the_page_is_something(String strArg1)  {
		Assert.assertEquals(ObjectRepo.driver.getTitle(),strArg1);
		
	}

	@And("^I am at the home page$")
	public void i_am_at_the_home_page()  {
		hPage = new HomePage(ObjectRepo.driver);
		ObjectRepo.data.put("HomePage",hPage);
		
	}
}
