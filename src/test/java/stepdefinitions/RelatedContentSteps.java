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
	
	@Then("^I Scroll Vertically protected CONTENT$")
	public void vr_scrolpPR() throws Throwable{
		
		new RelatedContent(wd).scroll_bar_related_prot();
	}
	
	
	@Then("^I Scroll Vertically ChromeCast$")
	public void vr_scroll_crome() throws Throwable{
		
		new RelatedContent(wd).scroll_bar_related_chrome();;
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
		new RelatedContent(wd).vr_h1title(strexpadtitle);
	}
	@Then("^I Verify \"([^\"]*)\"songArtist$")
    public void vr_songartist(String strexsonginfo) throws Throwable{
		new RelatedContent(wd).ver_songartst(strexsonginfo);
	}
	@Then("^I Verify \"([^\"]*)\"songTitle$")
    public void vr_songinfo(String strexsonginfo) throws Throwable{
		new RelatedContent(wd).ver_songtit(strexsonginfo);
	}
	
	@Then("^I Verify \"([^\"]*)\"h1Title$")
    public void vr_h1title(String strexpadtitle) throws Throwable{
		new RelatedContent(wd).vr_h1title(strexpadtitle);
	}
	
	//Chrome Cast
	@Then("^I Click on Auto Behaviour Vedio$")
	public void aut_bhr() throws Throwable{
		new RelatedContent(wd).autbr_clik();
	}
	
	@Then("^I Click on Manual Behaviour Vedio$")
	public void man_bhr() throws Throwable{
		new RelatedContent(wd).manbr_clik();
	}
	
	//Protected Content
	@Then("^I Should Select \"([^\"]*)\"listValue$")
	public void list_sel(String Text) throws Throwable{
		new RelatedContent(wd).listSection(Text);
	}
	
	@Then("^I Verify \"([^\"]*)\"Note$")
	public void ver_nt(String expNote) throws Throwable{
		new RelatedContent(wd).ver_note(expNote);
	}
	
	@Then("^I Click and Pause$")
	public void ver_clik() throws Throwable{
		new RelatedContent(wd).clk_play_pause_protect();
	}
	
	@Then("^I Click On Azure Stream$")
	public void ver_az_clik() throws Throwable{
		new RelatedContent(wd).azurclik();
	}
	
	@Then("^I Click On Child of 90s$")
	public void ver_child_clik() throws Throwable{
		new RelatedContent(wd).childclik();
	}
	
	@Then("^I Click On Tears of Steal$")
	public void ver_tears_clik() throws Throwable{
		new RelatedContent(wd).tearsclik();
	}
//Picture-In-Picture
	@Then("^I Click on Language on Video Chapter$")
	public void clk_lang() throws Throwable{
		new RelatedContent(wd).langs_clik();
	}
	
	@Then("^I Choose Language \"([^\"]*)\"Option$")
	public void list_selec(String langtext) throws Throwable{
		new RelatedContent(wd).list_click(langtext);
	}
	
	@Then("^I Language one click$")
	public void lang1_clk() throws Throwable{
		new RelatedContent(wd).lang1_click();
	}
	
	@Then("^I Language Two click$")
	public void lang2_clk() throws Throwable{
		new RelatedContent(wd).lang2_click();
	}
	
	@Then("^I Click on Playback Rate$")
	public void playbkrt() throws Throwable{
		new RelatedContent(wd).playbackrt_click();
	}
	
	
	
	
	

}
