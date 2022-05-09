
package com.cucumber.framework.configuration.browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cucumber.framework.utility.ResourceHelper;

public class FirefoxBrowser {
	
	public FirefoxOptions getFirefoxCapabilities() {
		FirefoxOptions firefox = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);
		firefox.setCapability(FirefoxDriver.PROFILE, profile);
		firefox.setCapability("marionette", true);
		return firefox;
	}
	
	public WebDriver getFirefoxDriver(FirefoxOptions cap) {
		System.setProperty("webdriver.gecko.driver", ResourceHelper.getResourcePath("driver/geckodriver.exe"));
		return new FirefoxDriver(cap);

}
	
	public WebDriver getFirefoxDriver(String hubUrl,FirefoxOptions cap) throws MalformedURLException {
		return new RemoteWebDriver(new URL(hubUrl),cap);
	}

}

