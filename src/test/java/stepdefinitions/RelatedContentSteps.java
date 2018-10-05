package stepdefinitions;

import browserFactory.DriversFactory;
import cucumber.api.java.en.Then;
import pageObjects.RelatedContent;

public class RelatedContentSteps extends DriversFactory {
	
	@Then("^I Verify RelatedContentPage \"([^\"]*)\"h1title$")
	public void ver_h1title_relatd(String ex1title) throws Throwable{
		new RelatedContent(wd).ver_h1tit_related(ex1title);
	}
	
	@Then("^I Verify RelatedContentPage \"([^\"]*)\"h2title$")
	public void ver_h2title_relatd(String exh2title) throws Throwable{
		new RelatedContent(wd).ver_h2tit_related(exh2title);
	}
	
	@Then("^I Verify htitle Advertising as \"([^\"]*)\"$")
	public void vr_ht(String exph1rtitle) throws Throwable{
		
		new RelatedContent(wd).vr_h1title_adv_rel(exph1rtitle);
	}
	
	@Then("^I Scroll Vertically$")
	public void vr_scroll() throws Throwable{
		
		new RelatedContent(wd).scroll_bar_related();
	}
	
	@Then("^I Click ylaplay$") 
	public void clk_play_ylam() throws Throwable{
		new RelatedContent(wd).clickylaplay();
		
	}
	
	@Then("^I Click ylaplay1 Vedio$") 
	public void clk_play_ylam1() throws Throwable{
		new RelatedContent(wd).clickylaplay1();
		
	}
//Audio ID3 MA
	@Then("^I Verify \"([^\"]*)\"audiTitle$")
    public void vr_adhtitle(String strexpadtitle) throws Throwable{
		new RelatedContent(wd).vr_h1title_aud_rel(strexpadtitle);
	}
	@Then("^I Verify \"([^\"]*)\"songArtist$")
    public void vr_songartist(String strexsonginfo) throws Throwable{
		new RelatedContent(wd).ver_songartst(strexsonginfo);
	}
	@Then("^I Verify \"([^\"]*)\"songTitle$")
    public void vr_songinfo(String strexsonginfo) throws Throwable{
		new RelatedContent(wd).ver_songtit(strexsonginfo);
	}

}
