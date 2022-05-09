
package com.cucumber.framework.stepdefinition;/*
 * @author Murali
 */

import com.cucumber.framework.helper.PageObject.fleetOverviewPage.FleetOverviewPage;
import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage.Wait.WaitHelper;
import com.cucumber.framework.settings.ObjectRepo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FleetOverviewSD {

    private FleetOverviewPage foPage;


    @Then("^verify zoom in icon is clickable$")
    public void verify_zoom_in_icon_is_clickable()
    {
        Assert.assertTrue(foPage.isZoomInClickable());
    }

    @Then("^verify zoom out icon is clickable$")
    public void verify_zoom_out_icon_is_clickable()
    {
        Assert.assertTrue(foPage.isZoomOutClickable());
    }

    @Then("^verify recenter icon is clickable$")
    public void verify_recenter_icon_is_clickable()
    {
        Assert.assertTrue(foPage.isRecenterClickable());
    }

    @Then("^verify wind field have particles and barbs options$")
    public void verify_wind_field_have_particles_and_barbs_options() {
        foPage.mouseHoverOnWindIcon();
        Assert.assertTrue(foPage.assertWindFieldOptionsDisplayed());

    }

    @Then("^verify particles clickable$")
    public void verify_particles_clickable() {
        Assert.assertTrue(foPage.isParticlesClickable());

    }

    @Then("^verify Arrows clickable$")
    public void verify_arrows_clickable() {
        Assert.assertTrue(foPage.isArrowsClickable());

    }

    @Then("^verify slider is present$")
    public void verify_slider_is_present()
    {
        Assert.assertTrue( foPage.isNextSliderPresent());
    }

    @And("^mouse hover on the wind property icon$")
    public void mouse_hover_on_the_wind_property_icon() {
        foPage.mouseHoverOnWindIcon();


    }

    @And("^click on particles tab$")
    public void click_on_particles_tab()
    {
        foPage.clickOnParticles();
    }

    @And("^click on barbs tab$")
    public void click_on_the_barbs()
    {
        foPage.clickOnBarbs();
    }

    @And("^click on arrows tab")
    public void click_on_the_arrows()
    {
        foPage.clickOnArrows();
    }

    @Then("^verify sea current field have particles and barbs options$")
    public void verify_sea_current_field_have_particles_and_barbs_options() {
        foPage.mouseHoverOnSeaCurrentIcon();
       Assert.assertTrue(foPage.assertSeaCurrentFieldOptionsDisplayed());
    }

    @And("^mouse over on the sea current property icon$")
    public void mouse_over_on_the_sea_current_property_icon() {
        foPage.mouseHoverOnSeaCurrentIcon();
    }

    @Then("^verify visibility tab is clickable$")
    public void verify_visibility_tab_is_clickable() throws Exception{
        Assert.assertTrue(foPage.isVisiblityClickable());

    }

    @And("^click on visibility tab$")
    public void click_on_visibility_tab()  {

            foPage.clickOnVisibility();


    }

    @Then("^verify tropical revolving storm is clickable$")
    public void verify_tropical_revolving_storm_is_clickable(){
        Assert.assertTrue(foPage.isTropicalRevolvingStormClickable());


    }

    @And("^click on tropical revolving storm$")
    public void click_on_tropical_revolving_storm()  {
        foPage.clickOnTropicalRevolvingStorm();

    }

    @Then("^verify icing tab is clickable$")
    public void verify_icing_tab_is_clickable()  {
        Assert.assertTrue(foPage.isIcingtabClickable());

    }




    @And("^click on icing tab$")
    public void click_on_icing_tab() {
        foPage.clickOnIcing();

    }


    @Then("^click on Emission control Area$")
    public void click_on_emission_control_area()  {
        foPage.clickOnEmissionControlArea();
    }

    @And("^verify Emission Control Area is clickable$")
    public void verify_emission_control_area_is_clickable()  {
        Assert.assertTrue(foPage.isEmissionControlAreaClickable());
    }

    @Then("^verify co-ordinate reference grid is clickable$")
    public void verify_coordinate_reference_grid_is_clickable() {
        Assert.assertTrue(foPage.isCoordinateReferenceGridClickable());

    }

    @And("^click co-ordinate reference grid$")
    public void click_coordinate_reference_grid()  {
        foPage.clickOnCoordinateReferenceGrid();

    }

    @And("^verify load line zones tab is clickable$")
    public void verify_load_line_zones_tab_is_clickable()  {
        Assert.assertTrue(foPage.isLoadlineZoneClickable());
    }

    @And("^click on load line zone tab$")
    public void click_on_load_line_zone_tab()  {
        foPage.clickOnLoadlineZone();

    }
    @Then("^click on High Risk Area$")
    public void click_on_high_risk_area()  {
        foPage.clickOnHighRiskArea();
    }

    @And("^verify High Risk Area is clickable$")
    public void verify_high_risk_area_is_clickable()  {
        Assert.assertTrue(foPage.isHighRiskAreaClickable());
    }
    @Then("^click on Voluntary Reporting Area$")
    public void click_on_voluntary_reporting_area()  {
        foPage.clickOnVoluntaryReportingArea();
    }

    @And("^verify voluntary Reporting Area$")
    public void verify_voluntary_reporting_area()  {
        Assert.assertTrue(foPage.isVoluntaryReportingAreaClickable());
    }

    @Then("^click on International Navigation Tab$")
    public void click_on_international_navigation_tab()  {
        foPage.clickOnInterntionalNavigationTab();
    }

    @And("^verify International Navigation Limit Tab$")
    public void verify_international_navigation_limit_tab()  {
        Assert.assertTrue(foPage.isInternationalNavigationLimitClickable());
    }

    @Then("^click on Joint War Committee Area$")
    public void click_on_joint_war_committee_area()  {
        foPage.clickOnJointWarAreaCommittee();
    }

    @And("^verify Joint War Committee Area$")
    public void verify_joint_war_committee_area() {
        Assert.assertTrue(foPage.isJointWarCommitteeAreaClickable());
    }


    //
     @Then("^click on search vessel$")
    public void click_on_search_vessel()  {

         foPage.clickOnSearchVessel();

}

    @And("^mouse over on the search vessel$")
    public void mouse_over_on_the_search_vessel() {

            foPage.mouseHoverOnSearchVessel();

    }

    @And("^verify search vessel  is clickable$")
    public void verify_search_vessel_is_clickable()
    {
        Assert.assertTrue(foPage.isSearchVesselClickable());
    }


    @Then("^verify Auto Search option$")
    public void verify_auto_search_option()  {
        Assert.assertTrue(foPage.isSearchVesseldropdown());


    }

    @And("^click on the search vessel dropdown$")
    public void click_on_the_search_vessel_dropdown()
    {
        foPage.clickOnSearchVesseldropdown();
    }

    @Then("^verify scroll bar in search vessel dropdown$")
    public void verify_scroll_bar_in_search_vessel_dropdown()  {
        Assert.assertTrue(foPage.isSearchVesseldropdown());
    }

    @And("^mouse over on the search vessel dropdown$")
    public void mouse_over_on_the_search_vessel_dropdown()  {
        foPage.mouseHoverOnSearchVesseldropdown();
    }

    @And("^click on search vessel dropdown$")
    public void click_on_search_vessel_dropdown()  {
        foPage.clickOnSearchVesseldropdown();
    }

    @Then("^verify the Current UTC$")
    public void verify_the_current_utc() throws InterruptedException {
        Assert.assertTrue(foPage.isCurrentUTC());
        WaitHelper.hardWait(10000);
    }

    @Then("^verify Theme change is present$")
    public void verify_theme_change_is_present()  {
        Assert.assertTrue(foPage.isThemeChange());
    }

    @And("^click on Theme change$")
    public void click_on_theme_change() {
        foPage.clickOnThemeChange();
    }


    @Then("^verify  logout is clickable$")
    public void verify_logout_is_clickable()  {
        Assert.assertTrue(foPage.isLogoutClickable());
    }


    @Then("^verify  vessel alerts$")
    public void verify_vessel_alerts()  {
        Assert.assertTrue(foPage.isVesselAlerts());
    }
    @And("^click on vessel alerts$")


    @Then("^verify page of vessel alerts$")
    public void verify_page_of_vessel_alerts()
    {
        Assert.assertTrue(foPage.isVesselAlerts());
    }
    @Then("^verify search bar in vessel alerts$")
    public void verify_search_bar_in_vessel_alerts()
    {
        Assert.assertTrue(foPage.isVesselAlerts());
    }

    @Then("^verify signal received legend$")
    public void verify_signal_received_legend()
    {
        Assert.assertTrue(foPage.isSignalReceivedLegend());
    }

    @And("^mouse over on the signal received legend$")
    public void mouse_over_on_the_signal_received_legend()
    {
        foPage.mouseHoverOnSignalReceivedLegend();
    }

    @Then("^verify total vessels legend$")
    public void verify_total_vessels_legend()
    {
        Assert.assertTrue(foPage.isTotalvesselslegend());
    }

    @And("^mouse over on the total vessels legend$")
    public void mouse_over_on_the_total_vessels_legend()
    {
        foPage.mouseHoverOnTotalVesselsLegend();
    }
    @Then("^verify Sat Live and underimplementation$")
    public void verify_sat_live_and_underimplementation()
    {
        Assert.assertTrue(foPage.isSatLiveUnderimplementation());
    }


    @Then("^verify color code$")
    public void verify_color_code()
    {
        Assert.assertTrue(foPage.isColorcode());
    }

    @And("^mouse over on sat live underimplementation$")
    public void mouse_over_on_sat_live_underimplementation()
    {
        foPage.mouseHoverOnSatLiveUnderimplementation();
    }
    @Then("^verify close button$")
    public void verify_close_button()
    {
        Assert.assertTrue(foPage.isCloseButton());
    }

    @And("^mouse over on close button$")
    public void mouse_over_on_close_button()
    {
        foPage.mouseHoverOnCloseButton();

    }

    @Then("^verify colour$")
    public void verify_colour()
    {
        Assert.assertTrue(foPage.isColour());

    }

    @And("^mouse over on colour$")
    public void mouse_over_on_colour()
    {
        foPage.mouseHoverOncolour();
    }

    @And("^click on colour$")
    public void click_on_colour()
    {
        foPage.clickOnColour();
    }


    @Then("^verify pressure tab is clickable$")
    public void verify_pressure_tab_is_clickable()
    {
        Assert.assertTrue(foPage.isPressureTabClickable());
    }

    @And("^click on pressure tab$")
    public void click_on_pressure_tab()
    {
        foPage.clickOnPressureTab();
    }


    @Then("^verify wind gust tab is clickable$")
    public void verify_wind_gust_tab_is_clickable()
    {
        Assert.assertTrue(foPage.isWindGustClickable());
    }
    @And("^click on wind gust tab$")
    public void click_on_wind_gust_tab()
    {
        foPage.clickOnWindGustTab();
    }

    @Then("^verify wind precipitation is clickable$")
    public void verify_wind_precipitation_is_clickable()
    {
        Assert.assertTrue(foPage.isPrecipitationClickable());
    }
    @And("^click on precipitation$")
    public void click_on_precipitation()
    {
        foPage.clickOnprecipitation();
    }

    @Then("^verify wind wave tab is clickable$")
    public void verify_wind_wave_tab_is_clickable()
    {
        Assert.assertTrue(foPage.isWindWaveTabClickable());
    }

    @And("^click on wind wave tab$")
    public void click_on_wind_wave_tab()
    {
        foPage.clickOnWindWaveTab();
    }

    @Then("^verify swell tab is clickable$")
    public void verify_swell_tab_is_clickable()
    {
        Assert.assertTrue(foPage.isSwellTabClickable());
    }

    @And("^click on  swell tab$")
    public void click_on_swell_tab()  {
        foPage.clickOnswellTab();
    }

    @And("^I am at the fleet overview page$")
    public void i_am_at_the_fleet_overview_page() {
        foPage = new FleetOverviewPage(ObjectRepo.driver);
        ObjectRepo.data.put("FleetOverviewPage", foPage);
    }

}
