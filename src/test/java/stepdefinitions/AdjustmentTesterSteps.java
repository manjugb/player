package stepdefinitions;

import browserFactory.DriversFactory;
import cucumber.api.java.en.Then;
import pageObjects.AdjustmentTester;

public class AdjustmentTesterSteps extends DriversFactory{
	
	//Verify h1 title adjustment tester page
	@Then("^I Verify h1 adjustement \"([^\"]*)\"Title$")
	public void ver_h1title_adj(String exph1title) throws Throwable{
		new AdjustmentTester(wd).vr_h1title(exph1title);
	}
	
	//content 1 in adj
	@Then("^I Verify \"([^\"]*)\"Content1$")
	public void ver_contn1_adj(String expcont1) throws Throwable{
		new AdjustmentTester(wd).vr_content(expcont1);
	}
	//Content adjtester
	@Then("^I Verify \"([^\"]*)\"Content2$")
	public void ver_contn2_adj(String expcont2) throws Throwable{
		new AdjustmentTester(wd).vr_conte2(expcont2);
	}
	
	//Content 3
	@Then("^I Verify \"([^\"]*)\"Content3$")
	public void ver_contn3_adj(String expcont3) throws Throwable{
		new AdjustmentTester(wd).vr_content3(expcont3);
	}
	
	//Event log when ad comes
	@Then("^I Verify \"([^\"]*)\"EventLog$")
	public void ver_eventlog_adj(String expeventlog) throws Throwable{
		new AdjustmentTester(wd).vr_eventlog(expeventlog);
	}
	//Adbreak names
	@Then("^I Check Ad Contains \"([^\"]*)\"EventLog$")
	public void ver_vcontent_adj(String expadcontent) throws Throwable{
		new AdjustmentTester(wd).vr_vcont(expadcontent);
	}
	//verify adurl
	@Then("^I Verify \"([^\"]*)\"as Adurl$")
	public void ver_adrl_adj(String expadurl) throws Throwable{
		new AdjustmentTester(wd).ver_adurl(expadurl);
	}
	
	//verify adurl
		@Then("^I Verify \"([^\"]*)\"as Vdurl$")
		public void ver_vdrl_adj(String expvdurl) throws Throwable{
			new AdjustmentTester(wd).ver_vdurl(expvdurl);
		}
		
  //Click Radio Buttons
		@Then("^I Select on Midroll$")
		public void clk_midroll() throws Throwable{
			new AdjustmentTester(wd).clk_midroll();
		}
		
		@Then("^I Select on Postroll$")
		public void clk_postroll() throws Throwable{
			new AdjustmentTester(wd).clk_postroll();
		}
		
		@Then("^I Select on VMAP$")
		public void clk_vmp() throws Throwable{
			new AdjustmentTester(wd).clk_vmap();
		}
		
		@Then("^I Select on VPAID$")
		public void clk_vpd() throws Throwable{
			new AdjustmentTester(wd).clk_vpaid();
		}
		
		@Then("^I Click on Update Button$")
		public void clk_upd() throws Throwable{
			new AdjustmentTester(wd).clk_updatebut();
		}
		

}
