package com.cucumber.framework.helper.Actions;/*
 * @author Murali
 */

import com.cucumber.framework.helper.Browser.BrowserHelper;
import com.cucumber.framework.helper.Generic.GenericHelper;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.interfaces.IwebComponent;
import com.cucumber.framework.settings.ObjectRepo;
import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHelper implements IwebComponent {

    private WebDriver driver;
    private Logger oLog = LoggerHelper.getLogger(BrowserHelper.class);

    public ActionHelper(WebDriver driver) {
        this.driver = driver;
        oLog.debug("ActionHelper : " + this.driver.hashCode());
    }
    public void moveToElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

//    public void moveToElement(int x, int y){
//        Actions action = new Actions(driver);
//        action.moveByOffset(x,y).build().perform();
//    }

//    public void moveToElementAndClick(int x, int y){
//        Actions action = new Actions(driver);
//        action.moveByOffset(x,y).click().build().perform();
//    }





}
