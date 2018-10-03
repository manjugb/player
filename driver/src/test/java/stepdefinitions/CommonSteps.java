package stepdefinitions;

import browserFactory.DriversFactory;
import cucumber.api.java.en.Then;
import pageObjects.Common;

public class CommonSteps extends DriversFactory{
	
	@Then("^I Click On \"([^\"]*)\"Image Statistics$")
	public void clk_Image(String strImage) throws Throwable{
		new Common(wd).clickAllHyperImages(strImage);
	}
	
	@Then("^I Wait For Some Time$")
	public void waitfor() throws Throwable{
		new Common(wd).waifortime();
	}

}
