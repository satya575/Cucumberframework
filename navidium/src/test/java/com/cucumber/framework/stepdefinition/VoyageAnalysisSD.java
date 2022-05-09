package com.cucumber.framework.stepdefinition;/*
 * @author Murali
 */

import com.cucumber.framework.helper.PageObject.VoyageAnalysis.VoyageAnalysis;
import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage.Wait.WaitHelper;
import com.cucumber.framework.settings.ObjectRepo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VoyageAnalysisSD {
    private VoyageAnalysis VAPage;


    @Then("^verify Voyage Summary$")
    public void verify_voyage_summary()
    {
        Assert.assertTrue(VAPage.isVoyageSummary());
    }

    @And("^click on menu$")
    public void click_on_menu()
    {
        VAPage.clickOnMenu();
    }

    @And("^click on Voyage analysis$")
    public void click_on_voyage_analysis()
    {
        VAPage.clickOnVoyageAnalysis();
    }

    @And("^click on menu button$")
    public void click_on_menu_button()
    {
        VAPage.clickOnMenuButton();
    }

    @And("^click on voyage analysis menu$")
    public void click_on_voyage_analysis_menu()
    {
        VAPage.clickOnVoyageAnalysisMenu();
    }

    @And("^click on vessel events info$")
    public void click_on_vessel_events_info() {
//        WaitHelper.hardWait(10000);
        VAPage.clickOnVesselEventsInfo();
    }

    @Then("^verify vessel events$")
    public void verify_vessel_events()  {
        Assert.assertTrue(VAPage.isVesselEvents());

    }

    @And("^click on theme change button$")
    public void click_on_theme_change_button() {
        VAPage.clickOnThemeChange();
        Assert.assertTrue(VAPage.isTheme());

    }
    @Then("^click on logout button$")
    public void click_on_logout_button()  {
        VAPage.clickOnLogoutButton();

    }
    @Then("^verify list of voyages$")
    public void verify_list_of_voyages()  {

        Assert.assertTrue(VAPage.isListOfVoyage());
    }



    @And("^click on select voyage button$")
    public void click_on_select_voyage_button()  {
        VAPage.clickOnSelectVoyage();
    }

    @Then("^verify logout$")
    public void verify_logout()
    {
        Assert.assertTrue(VAPage.isLogout());
    }
    @Then("^verify select voyage button is clickable$")
    public void verify_select_voyage_button_is_clickable()  {
        Assert.assertTrue(VAPage.isSelectVoyageclickable());
    }
    @And("^I am at the Voyage Analysis page$")
    public void i_am_at_the_Voyage_Analysis_page() {
        VAPage = new VoyageAnalysis(ObjectRepo.driver);

        ObjectRepo.data.put("VoyageAnalysis", VAPage);
    }
}


