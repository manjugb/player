package stepdefinitions;

import browserFactory.DriversFactory;
import cucumber.api.java.en.Then;
import pageObjects.DemoHlsDashPage;

public class DemoHlsDashPageSteps extends DriversFactory{
	
	@Then("^I Verify DemoHlsDashPage \"([^\"]*)\"h1title$")
	public void DHDP_h1title(String strh1Title)throws Throwable{
		new DemoHlsDashPage(wd).ver_h1tit_dash(strh1Title);
	}
	
	@Then("^I Verify DemoHlsDashPage \"([^\"]*)\"content$")
	public void DHDP_content(String strcontnt)throws Throwable{
		new DemoHlsDashPage(wd).ver_content_dash(strcontnt);
	}
	
	@Then("^I Verify DemoHlsDashPage \"([^\"]*)\"EventLog$")
	public void evnt_log(String expelog) throws Throwable{
		new DemoHlsDashPage(wd).ver_eventlog(expelog);
	}
	
	@Then("^I Verify on Vedio Player \"([^\"]*)\"current time$")
	public void curtime(String strexptime) throws Throwable{
		new DemoHlsDashPage(wd).ver_ctime(strexptime);
	}
	
	@Then("^I Verify on Vedio Player \"([^\"]*)\"end time$")
	public void durtime(String strextime) throws Throwable{
		new DemoHlsDashPage(wd).ver_dur(strextime);
	}

}
