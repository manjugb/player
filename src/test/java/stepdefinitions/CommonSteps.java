package stepdefinitions;

import browserFactory.DriversFactory;
import cucumber.api.java.en.Then;
import pageObjects.Common;
/* author:Manjunath Golla Bala
 * desc:this class contains Gerkin annoation steps which calls into Gerkin language
 * features:Common Objects which call in all the features
 * 
 */
public class CommonSteps extends DriversFactory {
    
	//Click First Time Play Option
	@Then("^I Click First time Play Image$")
	public void clk_firstPlay()throws Throwable{
		new Common(wd).clk_play_first();
		
	}
	//
	@Then("^I Click On \"([^\"]*)\"Image$")
	public void clk_Image(String strImage) throws Throwable {
		new Common(wd).clickAllHyperImages(strImage);
	}

	@Then("^I Click On \"([^\"]*)\"Footer Text$")
	public void clk_FooterText(String strFooterText) throws Throwable {
		new Common(wd).clickAllHyperLinksName(strFooterText);
	}
	
	@Then("^I Wait For Some Time$")
	public void waitfor() throws Throwable {
		new Common(wd).waifortime();
	}
	
	@Then("^I Wait Vedio For Some Time$")
	public void waitforv() throws Throwable {
		new Common(wd).waifortime_vedio();
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
