package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.remote.BrowserType.*;


public class BrowserFactory {

    private static final String BROWSER_KEY = "browser";


    public static final WebDriver getBrowser() {
        WebDriver driver;
        String browser;

        if(System.getProperty("BROWSER_KEY")==null){
            browser = "chrome";
        }else{
            browser = System.getProperty("BROWSER_KEY");
        }

        if (browser.equalsIgnoreCase(CHROME)) {
            driver = createChromeDriver();
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase(IE)) {
            driver = createIEDriver();

        } else if (browser.equalsIgnoreCase(FIREFOX)) {
            driver = createFirefoxDriver();
            driver.manage().window().maximize();

        } else {
            driver = createChromeDriver();
            driver.manage().window().maximize();

        }
        addAllBrowserSetup(driver);
        return driver;
    }

    private static void addAllBrowserSetup(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    
    private static WebDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        return new ChromeDriver();
    }
    
    private static WebDriver createFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
        return new FirefoxDriver();
    }

    private static WebDriver createIEDriver() {
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\IEDriverServer.exe");
        return new InternetExplorerDriver();
    }
}
 
