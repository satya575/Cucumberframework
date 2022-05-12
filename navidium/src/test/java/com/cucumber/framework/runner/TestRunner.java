package com.cucumber.framework.runner;

import com.cucumber.framework.listeners.reportlistener.CucumberReport;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterClass;

@CucumberOptions(features = "src/test/resources/featurefile", glue = {
		"com.cucumber.framework.stepdefinition",
		"com.cucumber.framework.helper" },tags= "@cleaning",
 		plugin = { "pretty","json:target/TestRunner.json"})
//	plugin=	{ "pretty","html:target/cucumber-reports" })



public class TestRunner extends AbstractTestNGCucumberTests {


}




