package com.cucumber.framework.helper.PageObject.fleetOverviewPage;/*
 * @author Murali
 */

import com.cucumber.framework.helper.Actions.ActionHelper;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FleetOverviewPage extends PageBase {

    private WebDriver driver;
    private final Logger log = LoggerHelper.getLogger(HomePage.class);

    public FleetOverviewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@title='Zoom in']")
    public WebElement zoomIn;

    @FindBy(how = How.XPATH, using = "//*[@title='Zoom out']")
    public WebElement zoomOut;

    @FindBy(how = How.XPATH, using = "//*[@title='Center']")
    public WebElement recenter;

    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=3]")
    public WebElement wind;

    @FindBy(how = How.ID, using = "particlesOpt")
    public WebElement particles;


    @FindBy(how = How.ID, using = "barbsOpt")
    public WebElement barbs;

    @FindBy(how = How.XPATH, using = "//*[@id='nextSlider']")
    public WebElement nextSlider;

    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=4]")
    public WebElement seaCurrent;

    @FindBy(how = How.ID, using = "arrowOpt")
    public WebElement arrow;

    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=11]")
    public WebElement visibility;

    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=12]")
    public WebElement tropicalRevolvingStorm;

    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=39]")
    public WebElement icing;

    //    @FindBy(how = How.XPATH, using =
//    public WebElement emissionControlArea;
    @FindBy(how = How.XPATH, using = "//*[@id='free-solo-2-demo']")
    public WebElement searchvessel;

    @FindBy(how = How.XPATH, using = "//*[@id='free-solo-2-demo']")
    public WebElement searchvesseldropdown;

    @FindBy(how = How.XPATH, using = "//*[@id='layoutDiv']")
    public WebElement currentutc;

    @FindBy(how = How.XPATH, using = "//*[@id='iconButtonTheme']")
    public WebElement themechange;

    @FindBy(how = How.XPATH, using = "//*[@title='Logout']")
    public WebElement logout;

    @FindBy(how = How.XPATH, using = "//*[@title='Vessel Alerts']")
    public WebElement vesselalerts;


    @FindBy(how = How.XPATH, using = "//*[@id='landingMapLegends']")
    public WebElement signalreceivedlegend;

    @FindBy(how = How.XPATH, using = "//*[@id='landingMapLegends']")
    public WebElement totalvesselslegend;

    @FindBy(how = How.XPATH, using = "//*[@id='landingMapLegends']")
    public WebElement satliveunderimplementation;

    @FindBy(how = How.XPATH, using = "//*[@id='landingMapLegends']")
    public WebElement colorcode;

    @FindBy(how = How.XPATH, using = "//*[@id='layoutDiv']")
    public WebElement closebutton;

    @FindBy(how = How.XPATH, using = "//*[@id='landingMapLegends']")
    public WebElement colour;
    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=1]")
    public WebElement pressuretab;

    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=6]")
    public WebElement windgust;

    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=7]")
    public WebElement precipitation;

    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=2]")
    public WebElement windwavetab;


    @FindBy(how = How.XPATH, using = "//*[@weatherstationpropertyid=5]")
    public WebElement swelltab;

    @FindBy(how = How.XPATH, using = "//*[@title='Emission Control Area']")
    public WebElement emissioncontrolarea;

    @FindBy(how = How.XPATH, using = "//*[@title='Coordinate Reference Grid']")
    public WebElement coordinatereferencegrid;

    @FindBy(how = How.XPATH, using = "//*[@title='Loadline Zone']")
    public WebElement loadlinezone;

    @FindBy(how = How.XPATH, using = "//*[@title='High Risk Area']")
    public WebElement highriskarea;

    @FindBy(how = How.XPATH, using = "//*[@title='Voluntary Reporting Area']")
    public WebElement voluntaryreportingarea;

    @FindBy(how = How.XPATH, using = "//*[@title='International Navigating Limit']")
    public WebElement internationalnavigatinglimit;


    @FindBy(how = How.XPATH, using = " //*[@title='Joint War Committee Area']")
    public WebElement jointwarcommitteearea;


    public boolean isZoomInClickable() {
        return zoomIn.isEnabled();
    }

    public boolean isZoomOutClickable() {
        return zoomOut.isEnabled();
    }

//    public void vesseldropDown(){
//        vesseldropdown.sendKeys("Vess");
//    }

    public boolean isRecenterClickable() {
        return recenter.isEnabled();
    }

//    public void emissionClick() {
//        ActionHelper a = new ActionHelper(ObjectRepo.driver);
//        a.moveToElementAndClick(20, 11);
//    }


    public void mouseHoverOnWindIcon() {
        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(wind);
    }

    public void mouseHoverOnSeaCurrentIcon() {
        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(seaCurrent);
    }


    public boolean assertWindFieldOptionsDisplayed() {

        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option not displayed");

        boolean c = barbs.isDisplayed();
        if (b)
            log.info("barbs option displayed");
        else
            log.info("barbs option not displayed");

        return b && c ? true : false;
    }


    public boolean assertSeaCurrentFieldOptionsDisplayed() {

        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option not displayed");

        boolean c = arrow.isDisplayed();
        if (b)
            log.info("arrow option displayed");
        else
            log.info("arrow option not displayed");

        return b && c ? true : false;
    }


    public boolean assertTotalVesselsLegend() {

        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option not displayed");

        boolean c = totalvesselslegend.isDisplayed();
        if (b)
            log.info("total vessels legend option displayed");
        else
            log.info("total vessels legend option not displayed");

        return b && c ? true : false;
    }









    public boolean assertEmissionControlArea() {

        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option not displayed");

        boolean c = emissioncontrolarea.isDisplayed();
        if (b)
            log.info("emission control area option displayed");
        else
            log.info("emission control area option not displayed");

        return b && c ? true : false;
    }

    public boolean assertSatLiveUnderimplementation() {

        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option not displayed");

        boolean c = satliveunderimplementation.isDisplayed();
        if (b)
            log.info("sat live underimplementation option displayed");
        else
            log.info("sat live underimplementation option not displayed");

        return b && c ? true : false;
    }

    public boolean isParticlesClickable() {
        return particles.isEnabled();
    }

    public void clickOnParticles() {
        particles.click();
    }

    public boolean isBarbsClickable() {
        return barbs.isEnabled();
    }

    public void clickOnBarbs() {
        barbs.click();
    }

    public boolean isNextSliderPresent() {
        return nextSlider.isDisplayed();
    }

    public boolean isArrowsClickable() {
        return arrow.isEnabled();
    }

    public void clickOnArrows() {
        arrow.click();
    }


    public void clickOnTropicalRevolvingStorm() {
        tropicalRevolvingStorm.click();
    }


    public boolean assertTropicalRevolvingStormClickable() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = tropicalRevolvingStorm.isDisplayed();
        if (b)
            log.info("tropical revolving storm option displayed");
        else
            log.info("tropical revolving storm option not displayed");

        return b && c ? true : false;
    }

    public boolean assertIcingClickable() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = icing.isDisplayed();
        if (b)
            log.info("icing option displayed");
        else
            log.info("icing option not displayed");

        return b && c ? true : false;
    }

    public boolean assertSearchVesselClickable() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = searchvessel.isDisplayed();
        if (b)
            log.info("search vessel option displayed");
        else
            log.info("search vessel option not displayed");

        return b && c ? true : false;
    }

    public boolean assertSearchVesseldropdown() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = searchvesseldropdown.isDisplayed();
        if (b)
            log.info("search vessel dropdown option displayed");
        else
            log.info("search vessel  dropdown option not displayed");

        return b && c ? true : false;
    }

    public boolean assertCurrentUTC() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = currentutc.isDisplayed();
        if (b)
            log.info("current UTC option displayed");
        else
            log.info("current UTC option not displayed");

        return b && c ? true : false;
    }

    public boolean assertThemeChange() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = themechange.isDisplayed();
        if (b)
            log.info("theme change UTC option displayed");
        else
            log.info("theme change option not displayed");

        return b && c ? true : false;
    }

    public boolean assertvesselalerts() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = vesselalerts.isDisplayed();
        if (b)
            log.info("vessel alerts option displayed");
        else
            log.info("vessel alerts option not displayed");

        return b && c ? true : false;
    }

    public boolean assertsignalreceivedlegend() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = signalreceivedlegend.isDisplayed();
        if (b)
            log.info("signal received legend option displayed");
        else
            log.info("signal received legend option not displayed");

        return b && c ? true : false;
    }

    public boolean assertColorCode() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = colorcode.isDisplayed();
        if (b)
            log.info("color code option displayed");
        else
            log.info(" colorcode option not displayed");

        return b && c ? true : false;
    }

    public boolean assertCloseButton() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = closebutton.isDisplayed();
        if (b)
            log.info("close button option displayed");
        else
            log.info(" close button option not displayed");

        return b && c ? true : false;
    }

    public boolean assertLogoutclickable() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = logout.isDisplayed();
        if (b)
            log.info("logout clickable option displayed");
        else
            log.info(" logout clickable option not displayed");

        return b && c ? true : false;
    }

    public boolean isVisiblityClickable() throws Exception {
        return visibility.isEnabled();
    }

    public boolean isTropicalRevolvingStormClickable() {
        return tropicalRevolvingStorm.isEnabled();
    }

    public void clickOnVisibility() {
        visibility.click();
    }

    public boolean isIcingtabClickable() {
        return icing.isEnabled();
    }

    public boolean assertColour() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = colour.isDisplayed();
        if (b)
            log.info("colour  option displayed");
        else
            log.info(" colour  option not displayed");

        return b && c ? true : false;
    }

    public boolean assertPressureTab() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = pressuretab.isDisplayed();
        if (b)
            log.info("pressure tab option displayed");
        else
            log.info(" pressure tab  option not displayed");

        return b && c ? true : false;
    }

    public boolean assertWindGust() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = windgust.isDisplayed();
        if (b)
            log.info("wind gust option displayed");
        else
            log.info(" wind gust  option not displayed");

        return b && c ? true : false;
    }

    public boolean assertPrecipitation() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = precipitation.isDisplayed();
        if (b)
            log.info("precipitation option displayed");
        else
            log.info(" precipitation  option not displayed");

        return b && c ? true : false;
    }

    public boolean assertWindWaveTab() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = windwavetab.isDisplayed();
        if (b)
            log.info("wind wave tab option displayed");
        else
            log.info(" wind wave tab option not displayed");

        return b && c ? true : false;
    }

    public boolean assertSwellTab() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = swelltab.isDisplayed();
        if (b)
            log.info("swell tab option displayed");
        else
            log.info(" swell tab option not displayed");

        return b && c ? true : false;
    }

    public boolean assertCoordinateReferenceGrid() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = coordinatereferencegrid.isDisplayed();
        if (b)
            log.info("coordinate reference grid option displayed");
        else
            log.info(" coordinate reference grid option not displayed");

        return b && c ? true : false;
    }

    public boolean assertLoadlineZone() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = loadlinezone.isDisplayed();
        if (b)
            log.info("loadline zone option displayed");
        else
            log.info(" loadline zone option not displayed");

        return b && c ? true : false;
    }

    public boolean assertHighRiskArea() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = highriskarea.isDisplayed();
        if (b)
            log.info("high risk area option displayed");
        else
            log.info(" high risk area option not displayed");

        return b && c ? true : false;
    }

    public boolean assertVoluntaryReportingArea() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = voluntaryreportingarea.isDisplayed();
        if (b)
            log.info("voluntary reporting area option displayed");
        else
            log.info(" voluntary reporting option not displayed");

        return b && c ? true : false;
    }

    public boolean assertInternationalNavigationLimit() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");
        boolean c = internationalnavigatinglimit.isDisplayed();
        if (b)
            log.info("international navigation limit option displayed");
        else
            log.info(" international navigation limit option not displayed");

        return b && c ? true : false;
    }

    public boolean assertJointWarCommitteeArea() {
        boolean b = particles.isDisplayed();
        if (b)
            log.info("particles option displayed");
        else
            log.info("particles option  not displayed");

        boolean c = jointwarcommitteearea.isDisplayed();
        if (b)
            log.info("joint war committee area option displayed");
        else
            log.info(" joint war committee area option not displayed");

        return b && c ? true : false;
    }
////
//    public void moveToEmissionControl() {
//
//        ActionHelper a = new ActionHelper(ObjectRepo.driver);
//        a.moveToElementAndClick(20, 11);
//    }


    public void clickOnIcing() {
        icing.click();
    }

//
//    public boolean isEmissionControlAreaClickable() {
//        return EmissionControlArea.isEnabled();
//    }
//
//    public void clickOnEmissionControlArea() {
//        EmissionConrolArea.click();
//    }
//}


    public void mouseHoverOnSearchVessel() {

        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(searchvessel);
    }

    public void clickOnSearchVessel() {
        searchvessel.click();
    }

    public boolean isSearchVesselClickable() {
        return searchvessel.isEnabled();
    }

    public void clickOnSearchVesseldropdown() {
        searchvesseldropdown.click();
    }

    public boolean isSearchVesseldropdown() {
        return searchvesseldropdown.isEnabled();
    }

    public void sendkeysSearchVesseldropdown() {
        searchvesseldropdown.sendKeys("Vess");
    }

    public void mouseHoverOnSearchVesseldropdown() {
        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(searchvesseldropdown);
    }

    public boolean isCurrentUTC() {
        return currentutc.isEnabled();
    }

    public void clickOnThemeChange() {
        themechange.click();
    }

    public boolean isThemeChange() {
        return themechange.isEnabled();
    }


    public boolean isVesselAlerts() {
        return vesselalerts.isEnabled();
    }


//    public void clickOnVesselAlerts() {
//        vesselalerts.click();
//    }

    public boolean isSignalReceivedLegend() {
        return signalreceivedlegend.isEnabled();
    }

    public void mouseHoverOnSignalReceivedLegend() {
        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(signalreceivedlegend);
    }


    public boolean isTotalvesselslegend() {
        return totalvesselslegend.isEnabled();
    }

    public void mouseHoverOnTotalVesselsLegend() {
        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(totalvesselslegend);
    }

    public boolean isSatLiveUnderimplementation() {
        return satliveunderimplementation.isEnabled();
    }


    public void mouseHoverOnSatLiveUnderimplementation() {
        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(satliveunderimplementation);
    }

    public boolean isColorcode() {
        return colorcode.isEnabled();
    }

    public boolean isCloseButton() {
        return closebutton.isEnabled();
    }

    public void mouseHoverOnCloseButton() {
        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(closebutton);
    }


    public boolean isColour() {
        return colour.isEnabled();
    }


    public void clickOnColour() {
        colour.click();
    }

    public void mouseHoverOncolour() {
        ActionHelper action = new ActionHelper(driver);
        action.moveToElement(colour);
    }

    public boolean isLogoutClickable() {
        return logout.isEnabled();
    }

    public boolean isPressureTabClickable() {
        return pressuretab.isEnabled();
    }

    public boolean isWindGustClickable() {
        return windgust.isEnabled();
    }

    public boolean isPrecipitationClickable() {
        return precipitation.isEnabled();
    }

    public boolean isWindWaveTabClickable() {
        return windwavetab.isEnabled();
    }

    public boolean isSwellTabClickable() {
        return swelltab.isEnabled();
    }

    public void clickOnEmissionControlArea() {
        emissioncontrolarea.click();
    }

    public boolean isEmissionControlAreaClickable() {
        return emissioncontrolarea.isEnabled();
    }

    public boolean isCoordinateReferenceGridClickable() {
        return coordinatereferencegrid.isEnabled();
    }

    public void clickOnCoordinateReferenceGrid() {
        coordinatereferencegrid.click();
    }

    public boolean isLoadlineZoneClickable() {
        return loadlinezone.isEnabled();
    }

    public void clickOnLoadlineZone() {
        loadlinezone.click();
    }

    public boolean isHighRiskAreaClickable() {
        return highriskarea.isEnabled();
    }

    public void clickOnHighRiskArea() {
        highriskarea.click();
    }

    public boolean isVoluntaryReportingAreaClickable() {
        return voluntaryreportingarea.isEnabled();
    }

    public void clickOnVoluntaryReportingArea() {
        voluntaryreportingarea.click();
    }

    public boolean isInternationalNavigationLimitClickable() {
        return internationalnavigatinglimit.isEnabled();
    }

    public void clickOnInterntionalNavigationTab() {
        internationalnavigatinglimit.click();
    }

    public void clickOnJointWarAreaCommittee() {
        jointwarcommitteearea.click();
    }

    public boolean isJointWarCommitteeAreaClickable() {
        return jointwarcommitteearea.isEnabled();
    }

    public void clickOnPressureTab() {
        pressuretab.click();
    }

    public void clickOnWindGustTab() {
        windgust.click();
    }

    public void clickOnprecipitation() {
        precipitation.click();
    }

    public void clickOnWindWaveTab() {
        windwavetab.click();
    }


    public void clickOnswellTab() {
        swelltab.click();
    }

//    public void clickOnVesselAlerts() {
//        vesselalerts.click();
//    }
}





