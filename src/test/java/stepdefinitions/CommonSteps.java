package stepdefinitions;
/*@Author:Manjunath GOlla Bala
 * @Descriptios: Locate objects and creates as WebElements
 * @Feature: using Given,Then,And will intialize gherkin language
 */
import browserFactory.DriversFactory;
import cucumber.api.java.en.Then;
import pageObjects.Common;

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
	public void clk_FooterText(String strFText) throws Throwable {
		new Common(wd).clickAllHyperLinksName(strFText);
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
	
	@Then("^I Scroll Bar$")
	public void scr_ll() throws Throwable{
		new Common(wd).scroll_bar();
	}
	
	/*@Then("^I click on \"([^\"]*)\"Text$")
	public void clicklinktext(String strText) throws Throwable{
		new Common(wd).clickLinkByText(strText);
	}*/

}
