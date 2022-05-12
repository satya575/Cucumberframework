package com.cucumber.framework.helper.PageObject.loginPage;

import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage.Wait.WaitHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.settings.ObjectRepo;

public class LoginPage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waitHelper = new WaitHelper(ObjectRepo.driver,ObjectRepo.reader);

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** Web Elements */
	

	@FindBy(how=How.XPATH,using="//input[@name='email']")
	public WebElement userName;

	@FindBy(how=How.XPATH,using="//input[@name='password']")
	public WebElement password;

	@FindBy(how=How.XPATH,using="//*[@id='LoginRootDiv']/div/div/form/button/span[1]")
	public WebElement signIn;

	/** Public Methods  **/
	
	public WebDriver getDriver() {
		return this.driver;
	}

	public void logIn() throws Exception{
		log.info("user name --> "+ObjectRepo.reader.getUserName());
		userName.sendKeys(ObjectRepo.reader.getUserName());
		log.info("password --> "+ObjectRepo.reader.getPassword());
		password.sendKeys(ObjectRepo.reader.getPassword());
		log.info("clicking on Sign In button");
		signIn.click();
		waitHelper.hardWait(15000);
	}
	

}
