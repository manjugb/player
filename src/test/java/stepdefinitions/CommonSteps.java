package stepdefinitions;

import browserFactory.DriversFactory;
import cucumber.api.java.en.Then;
import pageObjects.Common;

public class CommonSteps extends DriversFactory {

	@Then("^I Click On \"([^\"]*)\"Image Statistics$")
	public void clk_Image(String strImage) throws Throwable {
		new Common(wd).clickAllHyperImages(strImage);
	}

	@Then("^I Wait For Some Time$")
	public void waitfor() throws Throwable {
		new Common(wd).waifortime();
	}
	
	@Then("^I Click on Play From Play Chapter$")
	public void clk_play() throws Throwable{
		new Common(wd).clk_play_pause();
	}
	
	@Then("^I Click on Pause From Play Chapter$")
	public void clk_pause() throws Throwable{
		new Common(wd).clk_play_pause();
	}
	
	@Then("^I Click on Mute From Play Chapter$")
	public void clk_mute() throws Throwable{
		new Common(wd).clk_mute_unmute();
	}
	
	@Then("^I Click on UnMute From Play Chapter$")
	public void clk_unmute() throws Throwable{
		new Common(wd).clk_mute_unmute();
	}

}
