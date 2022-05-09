package src.main.java.canvas;/*
 * @author CanvasTag
 */


import com.cucumber.framework.utility.ResourceHelper;
import org.openqa.selenium.*;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class CanvasTag {

    public static void main(String[] args) throws Exception{
        FirefoxOptions firefox = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        firefox.setCapability(FirefoxDriver.PROFILE, profile);
        firefox.setCapability("marionette", true);
//        System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", ResourceHelper.getResourcePath("driver/geckodriver.exe"));
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette",true);


        WebDriver driver = new FirefoxDriver(firefox);
//

        driver.manage().window().maximize();
        driver.get("http://137.117.200.23:6500/fleet-overview");

Thread.sleep(20000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
     WebElement email =   driver.findElement(By.xpath("//input[@name='email']"));

        email.click();

     email.sendKeys("TestUser@navidium.com");
    WebElement password =   driver.findElement(By.xpath("//span[text()='Password']"));
    password.sendKeys("Welcome@123");
       WebElement signIn = driver.findElement(By.xpath("//p[text()='Sign in']"));
               signIn.click();
        Actions a = new Actions(driver);
       WebElement canvas =  driver.findElement(By.xpath("//*[@id='map']/div/canvas"));
       System.out.println(canvas.getSize());
        Dimension canvas_dimensions = null;
        var canvas_center_x = canvas_dimensions.getWidth() / 2;
        System.out.println(canvas_center_x);
        var canvas_center_y = canvas_dimensions.getHeight() / 2;
        System.out.println(canvas_center_y);
        int button_x = (canvas_center_x / 3) * 2;
        int button_y = (canvas_center_y / 3) * 2;

        Actions action = new Actions(driver);
        action.moveToElement( canvas, button_x, button_y);
        action.click();
        action.perform();

    }
}






































