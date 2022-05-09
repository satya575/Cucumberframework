package com.cucumber.framework.helper.PageObject.liveFleetMonitoringPage;/*
 * @author Murali
 */

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LiveFleetMonitoringPage extends PageBase {

    private WebDriver driver;
    private final Logger log = LoggerHelper.getLogger(LiveFleetMonitoringPage.class);

    public LiveFleetMonitoringPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /**
     * Web Elements
     */

    @FindBy(how = How.XPATH, using = "//*[@id='pageTitle']")
    public WebElement pageHeading;

    public String getPageHeading() {
        log.info("page heading -->" +pageHeading.getText());
       return pageHeading.getText();
    }

}
