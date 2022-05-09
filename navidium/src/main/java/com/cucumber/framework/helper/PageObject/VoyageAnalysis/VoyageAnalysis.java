package com.cucumber.framework.helper.PageObject.VoyageAnalysis;/*
 * @author Murali
 */

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VoyageAnalysis extends PageBase {

    private WebDriver driver;
    private final Logger log = LoggerHelper.getLogger(HomePage.class);

    public VoyageAnalysis(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id='iconButtonMenu']")
    public WebElement menu;


    @FindBy(how = How.XPATH, using = "//*[@id='scrollable-prevent-tab-0']")
    public WebElement voyagesummary;

    @FindBy(how = How.XPATH, using = "//*[@href='/voyage-analysis']")
    public WebElement voyageanalysis;


    @FindBy(how = How.XPATH, using = "//*[@title='Vessel Events Info']")
    public WebElement vesseleventsinfo;

    @FindBy(how = How.XPATH, using = "//*[@id='iconButtonMenu']")
    public WebElement menubutton;

    @FindBy(how = How.XPATH, using = "//*[@href='/voyage-analysis']")
    public WebElement voyageanalysismenu;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/button/span[1]")
    public WebElement vesselevents;


    @FindBy(how = How.XPATH, using = "//*[@title='Theme Change']")
    public WebElement themechange;

    @FindBy(how = How.XPATH, using = "//*[@title='Logout']")
    public WebElement logoutbutton;

    @FindBy(how = How.XPATH, using = "//*[@id='LoginRootDiv']")
    public WebElement logout;

    @FindBy(how = How.XPATH, using = "//*[@id='pageTitle']")
    public WebElement theme;


    @FindBy(how = How.XPATH, using = "//*[@id='contentLayout']")
    public WebElement selectvoyage;


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/hr")
    public WebElement listofvoyage;

//
//    @FindBy(how = How.XPATH, using = "//*[@id='free-solo-2-demo']")
//    public WebElement searchvesseldropdown;

    public boolean assertVoyageSummaryDisplayed() {


        boolean c = voyagesummary.isDisplayed();
        if (c)
            log.info(" voyage summary is displayed");
        else
            log.info("voyage summary  not displayed");

        return c ? true : false;
    }

    public boolean assertVesselEventsDisplayed() {


        boolean c = vesselevents.isDisplayed();
        if (c)
            log.info(" vessel events is displayed");
        else
            log.info("vessel events  not displayed");

        return c ? true : false;
    }

    public boolean assertThemeisplayed() {


        boolean c = theme.isDisplayed();
        if (c)
            log.info(" theme change is displayed");
        else
            log.info("theme change  not displayed");

        return c ? true : false;
    }

    public boolean assertLogoutisplayed() {


        boolean c = logout.isDisplayed();
        if (c)
            log.info(" logout  is displayed");
        else
            log.info("logout   not displayed");

        return c ? true : false;
    }

    public boolean assertSelectVoyageisdisplayed() {


        boolean c = selectvoyage.isDisplayed();
        if (c)
            log.info(" select voyage is displayed");
        else
            log.info("select voyage  not displayed");

        return c ? true : false;
    }

    public boolean assertListOfVoyageisdispalyed() {
        boolean c= listofvoyage.isDisplayed();
        if (c)
            log.info(" list of voyage is displayed");
        else
            log.info("list of voyage not dispalyed");
        return  c ? true : false;
    }
//
//    public boolean assertVoyageAnalysisDisplayed() {
//
//
//        boolean c = voyageanalysis.isDisplayed();
//        if (c)
//            log.info(" voyage analysis is displayed");
//        else
//            log.info("voyage analysis  not displayed");
//
//        return c ? true : false;
//    }

    public boolean isVoyageSummary() {
        return voyagesummary.isEnabled();
    }

    public void clickOnMenu() {
        menu.click();
    }

    public void clickOnVoyageAnalysis() {

        voyageanalysis.click();
    }

    public boolean isVesselEvents() {
        return vesselevents.isEnabled();

    }

    public void clickOnMenuButton() {
        menubutton.click();
    }

    public void clickOnVoyageAnalysisMenu() {
        voyageanalysismenu.click();
    }

    public void clickOnVesselEventsInfo() {
        vesseleventsinfo.click();
    }

    public void clickOnThemeChange() {
        themechange.click();
    }

    public boolean isTheme() {
        return theme.isEnabled();
    }

    public void clickOnLogoutButton() {
        logoutbutton.click();
    }


    public boolean isLogout() {
        return logout.isEnabled();
    }

    public boolean isSelectVoyageclickable() {
        return selectvoyage.isEnabled();
    }



    public void clickOnSelectVOyage() {
        selectvoyage.click();
    }

    public boolean isListOfVoyage() {
        return listofvoyage.isEnabled();
    }

    public void clickOnSelectVoyage() {
        selectvoyage.click();
    }
}
