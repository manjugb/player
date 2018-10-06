package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*@Author:Manjunath GOlla Bala
 * @Descriptios: Locate objects and creates as WebElements
 * @Feature:Theo HOME Page
 */

public class TheoHomePage {
	public WebDriver driver;
	public static final String ANSI_RED_TEXT = "\033[31m";
	public static final String ANSI_GREEN_TEXT = "\033[32;1;2m";
	
	public TheoHomePage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}

	//navigation demos class
	@FindBy(how=How.XPATH,using="//nav[@class='demoOverview page-center']")
    WebElement listDemo;
	
	//Image:HLS/MPEG/DASH 
	@FindBy(how=How.XPATH,using="//img[@src='https://www.theoplayer.com/hubfs/Demo_zone/teststream.svg?t=1538490081232']")
	WebElement elmImage_hls_mpeg_dash;
	
	public void clk_imag_hls_mpeg() throws Throwable{
		if(elmImage_hls_mpeg_dash.isDisplayed()) {
			elmImage_hls_mpeg_dash.click();
		}else {
			System.out.println("Object not found");
		}
		
	}
	
	//h1 title from home page
	@FindBy(how=How.XPATH,using="//h1[@class='page-center']")
	WebElement elmh1titlehomepage;
	
	public void verh1title(String expH1title){
		 String stractH1title=elmh1titlehomepage.getText().toString();
    	if(expH1title.equalsIgnoreCase(stractH1title)){
    		Assert.assertEquals(expH1title, stractH1title);
    		System.out.println(ANSI_GREEN_TEXT + ""+ stractH1title+"" + "Title Found");
    	}else{
    		Assert.assertNotSame("Not Matched", expH1title, stractH1title);
    		System.out.println(ANSI_RED_TEXT + ""+ stractH1title+""+expH1title+ "" + "Title Not Found");
    	}
    }
	
	
	
	//contains text on home page
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Every device. Every platform. No plugins.')]")
	WebElement elmcontainstxt;
	
	public void vertexttitle(String exptxttitle){
		 String stractitle=elmcontainstxt.getText().toString();
   	if(exptxttitle.equalsIgnoreCase(stractitle)){
   		Assert.assertEquals(exptxttitle, stractitle);
   		System.out.println(ANSI_GREEN_TEXT + ""+ stractitle+"" + "Title Found");
   	}else{
   		Assert.assertNotSame("Not Matched", exptxttitle, stractitle);
   		System.out.println(ANSI_RED_TEXT + ""+ stractitle+""+exptxttitle+ "" + "Title Not Found");
   	}
   }
	 
	
	//h3 title
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'Do you want to get started with THEOplayer?')]")
	WebElement elmh3title_homepage;
	
	public void verh3title(String exph3title){
		 String stracth3title=elmh3title_homepage.getText().toString();
  	if(exph3title.equalsIgnoreCase(stracth3title)){
  		Assert.assertEquals(exph3title, stracth3title);
  		System.out.println(ANSI_GREEN_TEXT + ""+ stracth3title+"" + "Title Found");
  	}else{
  		Assert.assertNotSame("Not Matched", exph3title, stracth3title);
  		System.out.println(ANSI_RED_TEXT + ""+ stracth3title+""+exph3title+ "" + "Title Not Found");
  	}
  }
	
}
