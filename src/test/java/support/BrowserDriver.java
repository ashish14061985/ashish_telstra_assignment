package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class BrowserDriver {
    private static WebDriver mDriver;
    private static WebDriverWait wait;


    public synchronized static WebDriver getCurrentDriver(){
        if (mDriver==null) {
            try {
                mDriver = BrowserFactory.getBrowser();
                mDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } catch (UnreachableBrowserException e) {
                mDriver = BrowserFactory.getBrowser();
            } catch (WebDriverException e) {
                mDriver = BrowserFactory.getBrowser();
            }
        }
        return mDriver;
    }

    public synchronized static WebDriverWait getCurrentWaitDriver(int waitTimeInSeconds){
        if (wait==null) {
            wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
        }
        return wait;
    }

    public static void close() {
        try {
            mDriver.quit();
            mDriver = null;
        } catch (UnreachableBrowserException e) {
            System.out.println(e);
        }
    }

    public static void loadPage(String url){
        mDriver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        mDriver.get(url);
    }


}
