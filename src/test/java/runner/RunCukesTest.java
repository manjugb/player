package runner;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/resources/related_content/13.related_content_ImageClick_ContentProtection_AES.feature"}, glue = {"stepdefinitions"},
                    plugin = {"listener.ExtentCucumberFormatter"},format={"pretty"},tags = {"~@ignore"})
public class RunCukesTest {

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@BeforeClass
    public static void setup() {
    	listener.ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	
    	listener.ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
    	listener.ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
    	listener.ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.1");

        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.5");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.1");
        listener.ExtentCucumberFormatter.addSystemInfo(systemInfo);
    }
    

}