package pageObjects;

import static org.assertj.core.api.Assertions.*;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserFactory.DriversFactory;

public class RelatedContent extends DriversFactory{
	public WebDriver driver;
	public static final String ANSI_RED_TEXT = "\033[31m";
	public static final String ANSI_GREEN_TEXT = "\033[32;1;2m";
	
	
	public RelatedContent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//h1 title
	@FindBy(how=How.XPATH,using="//h1[@class='demoindexheader page-center']")
	WebElement elmh1tit_related;
	
	// Verify h1 title
		public void ver_h1tit_related(String ex1title) {
			String strH1title = elmh1tit_related.getText().toString();
			if (ex1title.equalsIgnoreCase(strH1title)) {
				Assert.assertEquals(ex1title, strH1title);
				System.out.println(ANSI_GREEN_TEXT + "" + strH1title + "" + "Title Found");
			} else {
				Assert.assertNotSame("Not Matched", ex1title, strH1title);
				System.out.println(ANSI_RED_TEXT + "" + strH1title + "" + ex1title + "" + "Title Not Found");
			}
		}
	
	//h2 title
		@FindBy(how=How.XPATH,using="//h2[contains(text(),'About Related Content')]")
		WebElement elmh2title;
		
		public void ver_h2tit_related(String ex2title) {
			String strh2title = elmh2title.getText().toString();
			if (ex2title.equalsIgnoreCase(strh2title)) {
				Assert.assertEquals(ex2title, strh2title);
				System.out.println(ANSI_GREEN_TEXT + "" + strh2title + "" + "Title Found");
			} else {
				Assert.assertNotSame("Not Matched", ex2title, strh2title);
				System.out.println(ANSI_RED_TEXT + "" + strh2title + "" + ex2title + "" + "Title Not Found");
			}
		}
		
		
		@FindBy(how=How.XPATH,using="//h1[@class='demoindexheader page-center']")
		WebElement elmh1rel;
	//h1 title
		public void vr_h1title_adv_rel(String strph1rtitle) throws Throwable{
			String strh1rtitle = elmh1rel.getText().toString();
			if (strph1rtitle.equalsIgnoreCase(strh1rtitle)) {
				Assert.assertEquals(strph1rtitle, strh1rtitle);
				System.out.println(ANSI_GREEN_TEXT + "" + strh1rtitle + "" + "Title Found");
			} else {
				Assert.assertNotSame("Not Matched", strph1rtitle, strh1rtitle);
				System.out.println(ANSI_RED_TEXT + "" + strph1rtitle + "" + strph1rtitle + "" + "Title Not Found");
			}
		}

		
		//Scroll Bar
	    public void scroll_bar_related() throws Throwable{
	    	JavascriptExecutor js = (JavascriptExecutor) driver;  
	    	js.executeScript("window.scrollBy(0,700)");

	    }
	    
	  //Scroll Bar
	    public void scroll_bar_related_chrome() throws Throwable{
	    	JavascriptExecutor js = (JavascriptExecutor) driver;  
	    	js.executeScript("window.scrollBy(0,1100)");

	    }
	    
	    public void scroll_bar_related_prot() throws Throwable{
	    	JavascriptExecutor js = (JavascriptExecutor) driver;  
	    	js.executeScript("window.scrollBy(0,300)");

	    }
	    
	    @FindBy(how=How.XPATH,using="//div[@id='yLa1383']//button[contains(@title,'Play Video')]")
	    WebElement elmylaplay;
	    
	    public void clickylaplay() throws Throwable{
	    	Actions action = new Actions(driver);
	        action.moveToElement(elmylaplay).perform(); 
	        //WebDriverWait wait = new WebDriverWait(driver, 10);
	        //wait.until(ExpectedConditions.elementToBeClickable(elmFirsPlayclick));
	        elmylaplay.click();
	    }
	    
	    @FindBy(how=How.XPATH,using="//div[@id='yLa2670']//button[contains(@title,'Play Video')]")
	    WebElement elmylaplay1;
	    
	    public void clickylaplay1() throws Throwable{
	    	Actions action = new Actions(driver);
	        action.moveToElement(elmylaplay1).perform(); 
	        //WebDriverWait wait = new WebDriverWait(driver, 10);
	        //wait.until(ExpectedConditions.elementToBeClickable(elmFirsPlayclick));
	        elmylaplay1.click();
	    }
	    
	

//Related Content:Audio ID3 Metadata
  //h1 title
  @FindBy(how=How.XPATH,using="//h1[@class='demoindexheader page-center']")
  WebElement elmh1title;
  public void vr_h1title(String streaudtitle) throws Throwable{
		String strah1rtitle = elmh1title.getText().toString();
		if (streaudtitle.equalsIgnoreCase(strah1rtitle)) {
			Assert.assertEquals(streaudtitle, strah1rtitle);
			System.out.println(ANSI_GREEN_TEXT + "" + strah1rtitle + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", streaudtitle, strah1rtitle);
			System.out.println(ANSI_RED_TEXT + "" + streaudtitle + "" + strah1rtitle + "" + "Title Not Found");
		}
	}

  
  
  //Song Info
   @FindBy(how=How.XPATH,using="//p[@class='song-artist']")
   WebElement elmsongartst;
   public void ver_songartst(String expsongartst) {
		String strSongartist = elmsongartst.getText().toString();
		
		if (expsongartst.equalsIgnoreCase(strSongartist)) {
			Assert.assertEquals(expsongartst, strSongartist);
			System.out.println(ANSI_GREEN_TEXT + "" + strSongartist + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", expsongartst, strSongartist);
			System.out.println(ANSI_RED_TEXT + "" + expsongartst + "" + strSongartist + "" + "Title Not Found");
		}
	}
   
   //h3 song title
   @FindBy(how=How.XPATH,using="//h3[@class='song-title']")
   WebElement elmh3songtitle;
   public void ver_songtit(String expsongtit) {
		String strSongtitle = elmh3songtitle.getText().toString();
		
		if (expsongtit.equalsIgnoreCase(strSongtitle)) {
			Assert.assertEquals(expsongtit, strSongtitle);
			System.out.println(ANSI_GREEN_TEXT + "" + strSongtitle + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", expsongtit, strSongtitle);
			System.out.println(ANSI_RED_TEXT + "" + expsongtit + "" + strSongtitle + "" + "Title Not Found");
		}
	}
   
   
 //CromeCast
   
   @FindBy(how=How.XPATH,using="//div[@id='yLa3']//button[@title='Play Video']")
   WebElement autbhrclik;
   public void autbr_clik() throws Throwable{
	   Actions action = new Actions(driver);
       action.moveToElement(autbhrclik).perform(); 
       //WebDriverWait wait = new WebDriverWait(driver, 10);
       //wait.until(ExpectedConditions.elementToBeClickable(elmFirsPlayclick));
       autbhrclik.click();
	   
   }
   
   @FindBy(how=How.XPATH,using="//div[@id='yLa1383']//button[@title='Play Video']")
   WebElement elmmanbrclick;
   
   public void manbr_clik() throws Throwable{
	   Actions action = new Actions(driver);
       action.moveToElement(elmmanbrclick).perform(); 
       //WebDriverWait wait = new WebDriverWait(driver, 10);
       //wait.until(ExpectedConditions.elementToBeClickable(elmFirsPlayclick));
       elmmanbrclick.click();
	   
   }
   
//Content Protectioin
   //listSelect
   @FindBy(how=How.XPATH,using="//select[@class='demo']")
   WebElement listSelect;
   
   public void listSection(String value) throws Throwable{
	   Select dropdown = new Select(listSelect);
	   dropdown.selectByVisibleText(value);
   }
   
   //Verify Note:
   @FindBy(how=How.XPATH,using="//small[contains(text(),'Note: the DRM example only supports Widevine and P')]")
   WebElement elmvernote;
   
   public void ver_note(String expNote) {
		String strNote = elmvernote.getText().toString();
		
		if (expNote.equalsIgnoreCase(strNote)) {
			Assert.assertEquals(expNote, strNote);
			System.out.println(ANSI_GREEN_TEXT + "" + strNote + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", expNote, strNote);
			System.out.println(ANSI_RED_TEXT + "" + expNote + "" + strNote + "" + "Title Not Found");
		}
	}
   
   //Click Play Protect Content
   @FindBy(how=How.XPATH,using=" //div[contains(@class,'theo-player-wrapper')]//div[9]//button[1]")
   WebElement clickplay_protect;
   public void clk_play_pause_protect() throws Throwable{
   	//elmPlay_Pause.click();
   	/*Actions builder = new Actions(driver);
      	builder.moveToElement(elmPlay_Pause).click().perform();*/
      	
      	Actions action = new Actions(driver);
       action.moveToElement(clickplay_protect).perform(); 
       WebDriverWait wait = new WebDriverWait(driver, 30);
       wait.until(ExpectedConditions.elementToBeClickable(clickplay_protect));
       clickplay_protect.click();
   }
   
   @FindBy(how=How.XPATH, using="//h1[contains(@class,'demoindexheader page-center')]")
   WebElement elmdrmh1title;
   public void ver_drmtitle(String expdrmtitl) {
		String strdtitle = elmdrmh1title.getText().toString();
		
		if (expdrmtitl.equalsIgnoreCase(strdtitle)) {
			Assert.assertEquals(expdrmtitl, strdtitle);
			System.out.println(ANSI_GREEN_TEXT + "" + strdtitle + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", expdrmtitl, strdtitle);
			System.out.println(ANSI_RED_TEXT + "" + expdrmtitl + "" + strdtitle + "" + "Title Not Found");
		}
	}
   
//Fast Channel Switching
   //switchbuttons
   //Azure
   @FindBy(how=How.XPATH,using="//button[@class='btnDemo actived']")
   WebElement elmzurebut;
   
   public void azurclik() throws Throwable{
	   elmzurebut.click();
   }
   
   @FindBy(how=How.XPATH,using="//button[contains(text(),'Child of the 90s')]")
   WebElement elmchildbut;
   
   public void childclik() throws Throwable{
	   elmchildbut.click();
   }
   
   @FindBy(how=How.XPATH,using=" //button[contains(text(),'Tears of steel')]")
   WebElement elmtearof;
   
   public void tearsclik() throws Throwable{
	   elmtearof.click();
   }
   
   
   
  }