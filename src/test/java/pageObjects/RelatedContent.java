package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	    
	
}
//Related Content:Advertising
   