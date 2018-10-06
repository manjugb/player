package browserFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;

public class DriversFactory {

    protected static WebDriver wd;
    RemoteWebDriver driver;
   
   /* @Rule
	public BrowserWebDriverContainer chrome =
			new BrowserWebDriverContainer()
            .withDesiredCapabilities(DesiredCapabilities.chrome());*/
	
	
    /*public DriversFactory() {
        initialize();
    }*/

   /* public void initialize() {
    	
        String url = null;
		String browser = null;
		if (wd == null)
        	chooseDriver(url, browser);
    }
*/
    
    
    public  WebDriver chooseDriver(
   			 
    			String url, 
    			String browser) {
    		try {
    			if (browser.equalsIgnoreCase("Firefox")) {
    				DesiredCapabilities caps = new DesiredCapabilities();

    				 caps.setJavascriptEnabled(true);

    				
    				wd = new FirefoxDriver();
    			} else if (browser.equalsIgnoreCase("Chrome")) {
    				DesiredCapabilities caps = new DesiredCapabilities();

    				 caps.setJavascriptEnabled(true);

    			 caps.setCapability("takesScreenshot", true);
    				
    				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    				wd = new ChromeDriver();
    				//driver=chrome.getWebDriver();
    			} else if (browser.equalsIgnoreCase("IE")) {
    				System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
    				wd = new InternetExplorerDriver();}
    			 else if (browser.equalsIgnoreCase("Headless")) {
    				 String[] cli_args = new String[]{ "--ssl-protocol=any", "--ignore-ssl-errors=true", "--web-security=false" };
    				 DesiredCapabilities caps = new DesiredCapabilities();

    				  caps.setJavascriptEnabled(true);

    				 caps.setCapability("takesScreenshot", true);
    				 
    				 System.setProperty("phantomjs.binary.path", "./driver/phantomjs");
    				 caps.setCapability( PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cli_args );
    				wd = new PhantomJSDriver();
    				
    				
                   
    			}
    			wd.get(url);
    			wd.manage().window().maximize();
    			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    			return wd;
    		} catch (WebDriverException e) {
    			//logger.log(LogStatus.INFO,e.getMessage());
    			System.out.println(e.getMessage());
    			return wd;}
    		}
    		
    		

    

    public WebDriver getDriver() {
        return wd;
    }

    public void destroyDriver() {
        wd.quit();
        wd = null;
    }
}