package stepdefinitions;

import browserFactory.DriversFactory;
import cucumber.api.java.en.Then;
import pageObjects.AdjustmentTester;

public class AdjustmentTesterSteps extends DriversFactory{
	
	//Verify h1 title adjustment tester page
	@Then("^I Verify h1 \"([^\"]*)\"Title$")
	public void ver_h1title_adj(String exph1title) throws Throwable{
		new AdjustmentTester(wd).vr_h1title(exph1title);
	}
	
	//content 1 in adj
	@Then("^I Verify  \"([^\"]*)\"Content1$")
	public void ver_contn1_adj(String expcont1) throws Throwable{
		new AdjustmentTester(wd).vr_content(expcont1);
	}
	//Content adjtester
	@Then("^I Verify  \"([^\"]*)\"Content2$")
	public void ver_contn2_adj(String expcont2) throws Throwable{
		new AdjustmentTester(wd).vr_conte2(expcont2);
	}
	
	//Content 3
	@Then("^I Verify  \"([^\"]*)\"Content3$")
	public void ver_contn3_adj(String expcont3) throws Throwable{
		new AdjustmentTester(wd).vr_content3(expcont3);
	}
	
	//Event log when ad comes
	@Then("^I Verify  \"([^\"]*)\"EventLog$")
	public void ver_eventlog_adj(String expeventlog) throws Throwable{
		new AdjustmentTester(wd).vr_eventlog(expeventlog);
	}
	
	@Then("^I Check Ad Contains  \"([^\"]*)\"EventLog$")
	public void ver_vcontent_adj(String expadcontent) throws Throwable{
		new AdjustmentTester(wd).vr_vcont(expadcontent);
	}
	
	@Then("^I Verify  \"([^\"]*)\" as Adurl$")
	public void ver_adrl_adj(String expadurl) throws Throwable{
		new AdjustmentTester(wd).ver_adurl(expadurl);
	}
	

}
