package com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage;/*
 * @author Murali
 */

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageBase {

    private WebDriver driver;
    private final Logger log = LoggerHelper.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /**
     * Web Elements
     */

    @FindBy(how = How.XPATH, using = "//*[@id='iconButtonLogout']")
    public WebElement logOutBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='iconButtonMenu']/span[@class='MuiIconButton-label']")
    public WebElement iconMenu;

    @FindBy(how = How.XPATH, using = "//*[@href='/live-fleet-monitoring']")
    public WebElement liveFleetMonitoring;

    @FindBy(how = How.XPATH, using = "//*[@href='/voyage-analysis']")
    public WebElement voyageAnalysis;

    @FindBy(how = How.XPATH, using = "//*[@href='/voyage-monitoring']")
    public WebElement voyageMonitoring;

    @FindBy(how = How.XPATH, using = "//*[@href='/hp-performance']")
    public WebElement hpPerformance;

    @FindBy(how = How.XPATH, using = "//*[@href='/vessel-performance']")
    public WebElement vesselPerformance;

    @FindBy(how = How.XPATH, using = "//*[@href='/machinery-monitoring']")
    public WebElement machineryMonitoring;

    @FindBy(how = How.XPATH, using = "//*[@href='/vessel-monitoring']")
    public WebElement vesselMonitoring;

    @FindBy(how = How.XPATH, using = "//*[@href='/cp-performance']")
    public WebElement cpPerformance;

    @FindBy(how = How.XPATH, using = "//*[@href='/environmental-monitoring']")
    public WebElement enviromentalMonitoring;

    @FindBy(how = How.XPATH, using = "//*[@href='/activity-logs']")
    public WebElement activityLogs;

    @FindBy(how = How.XPATH, using = "//*[@href='/vessel-health']")
    public WebElement vesselHealth;

    /**
     * Public Methods
     **/

    public WebDriver getDriver() {
        return this.driver;
    }

    public void logout() {
        logOutBtn.click();
    }

    public void navigateToLiveFleetMonitoring() {
        iconMenu.click();
        liveFleetMonitoring.click();

    }

    public void navigateToVoyageAnalysis() {
        iconMenu.click();
        voyageAnalysis.click();

    }

    public void navigateToVoyageMonitoring() {
        iconMenu.click();
        voyageMonitoring.click();

    }

    public void navigateToHpPerformance() {
        iconMenu.click();
        hpPerformance.click();

    }

    public void navigateToVesselPerformance() {
        iconMenu.click();
        vesselPerformance.click();

    }

    public void navigateToMachineryMonitoring() {
        iconMenu.click();
        machineryMonitoring.click();

    }

    public void navigateToVesselMonitoring() {
        iconMenu.click();
        vesselMonitoring.click();

    }

    public void navigateToCpPerformance() {
        iconMenu.click();
        cpPerformance.click();

    }

    public void navigateToEnviromentalMonitoring() {
        iconMenu.click();
        enviromentalMonitoring.click();

    }

    public void navigateToActivityLogs() {
        iconMenu.click();
        activityLogs.click();

    }

    public void navigateToVesselHealth() {
        iconMenu.click();
        vesselHealth.click();

    }

}