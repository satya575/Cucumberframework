//package com.cucumber.framework.stepdefinition;//package com.cucumber.framework.stepdefinition;
//
//
//import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.homePage.HomePage;
//import com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage.LiveFleetMonitoringPage;
//
//import com.cucumber.framework.settings.ObjectRepo;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import org.testng.Assert;
//
//public class LiveFleetMonitoringSD {
//
//    private HomePage homePage = (HomePage) ObjectRepo.data.get("HomePage");
//    ;
//    private LiveFleetMonitoringPage liveFleetMonitoringPage;
//
////
//
//	@And("^I navigate to live fleet monitoring$")
//	public void i_navigate_to_live_fleet_monitoring() throws Exception {
//
//		homePage.navigateToLiveFleetMonitoring();
//		liveFleetMonitoringPage = new LiveFleetMonitoringPage(ObjectRepo.driver);
//		ObjectRepo.data.put("LiveFleetMonitoringPage",liveFleetMonitoringPage);
//
//			}
//	@Then("^I assert am on live fleet monitoring page$")
//	public void i_assert_am_on_live_fleet_monitoring_page() {
//		Assert.assertEquals("Live Fleet Monitoring",liveFleetMonitoringPage.getPageHeading());
//
//	}
//
////	@Then("^I assert am on voyage analysis page$")
////	public void i_assert_am_on_voyage_analysis_page()  {
////
////		Assert.assertEquals("Voyage Analysis",voyageAnalysisPage.getPageHeading());
////	}
////
////    @And("^I navigate to voyage analysis$")
////    public void i_navigate_to_voyage_analysis() {
////        homePage.navigateToVoyageAnalysis();
////        VAPage = new VoyageAnalysisPage(ObjectRepo.driver);
////        ObjectRepo.data.put("VoyageAnalysisPage", VAPage);
////    }
//
//}
////}
//
////}
