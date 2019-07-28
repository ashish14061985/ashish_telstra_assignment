package support;

import com.google.common.base.Function;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class ExecutionWrapper {
    public static WebDriver driver;

    
    @Before
    public void openBrowser() throws MalformedURLException {
    	System.out.println("opening Browser....");
        BrowserDriver.getCurrentDriver();
        BrowserDriver.getCurrentWaitDriver(50);
    }

     
    @After
    public void embedScreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL : " + BrowserDriver.getCurrentDriver().getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot)BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }
        BrowserDriver.close();
    }

    public static void waitForPageLoad() {

        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }    
}