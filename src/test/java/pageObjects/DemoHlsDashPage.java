package pageObjects;
/*@Author:Manjunath GOlla Bala
 * @Descriptios: Locate objects and creates as WebElements
 * @Feature:HLS DASH Player objects and methods
 */

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserFactory.DriversFactory;

public class DemoHlsDashPage extends DriversFactory {
	public WebDriver driver;
	public static final String ANSI_RED_TEXT = "\033[31m";
	public static final String ANSI_GREEN_TEXT = "\033[32;1;2m";
	
	
	public DemoHlsDashPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// h1 title hls dash player
	@FindBy(how = How.XPATH, using = "//h1[@class='no-margin']")
	WebElement elmh1Title;

	// Verify h1 title
	public void ver_h1tit_dash(String expH1title) {
		String strH1title = elmh1Title.getText().toString();
		if (expH1title.equalsIgnoreCase(strH1title)) {
			Assert.assertEquals(expH1title, strH1title);
			System.out.println(ANSI_GREEN_TEXT + "" + strH1title + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", expH1title, strH1title);
			System.out.println(ANSI_RED_TEXT + "" + strH1title + "" + expH1title + "" + "Title Not Found");
		}
	}

	// Find content
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/p[1]")
	WebElement elmContent;

	// Verify Content
	public void ver_content_dash(String expContent) {
		String strContent = elmContent.getText().toString();
		if (expContent.equalsIgnoreCase(strContent)) {
			Assert.assertEquals(expContent, strContent, "Matched");
			System.out.println(ANSI_GREEN_TEXT + "" + expContent + "" + strContent + "" + "Title Found");
		} else {
			Assert.assertNotEquals("Not Matched", expContent, strContent);
			System.out.println(ANSI_RED_TEXT + "" + expContent + "" + strContent + "" + "Title Not Found");
		}
	}

	// Event logs HLS DASH
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'eventlogcontainer testContainer')]")
	WebElement elmEventlogs;

	// Verify event logs text contains true or not
	public void ver_eventlog(String expText) {
		String strContent = elmEventlogs.getText().toString();
		if (strContent.contains(expText)) {
			Assert.assertTrue(strContent.contains(expText));
			System.out.println(ANSI_GREEN_TEXT + "" + expText + "" + strContent + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", expText, strContent);
			System.out.println(ANSI_RED_TEXT + "" + expText + "" + strContent + "" + "Title Not Found");
		}
	}
	//current time display
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[9]/div[3]/div[1]")
	WebElement elmctime;
	
	//verify play current time
	public void ver_ctime(String exptime) {
		String strtime = elmctime.getText();
		System.out.println(strtime);
		if (strtime.contains(exptime)) {
			//Assert.assertThat("123456", Matchers.strtime("^[0-9]+$"));
			Assert.assertTrue(strtime.contains(exptime));
			System.out.println(ANSI_GREEN_TEXT + "" + exptime + "" + strtime + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", exptime, strtime);
			System.out.println(ANSI_RED_TEXT + "" + exptime + "" + strtime + "" + "Title Not Found");
		}
	}
	
	//Whole duration of the vedio while playing
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[9]/div[5]/div[1]")
	WebElement elmduration;//div[contains(@class,'theo-secondary-color vjs-control-bar')]//button[4]
	
	//Verify the time
	public void ver_dur(String expDur) {
		String strDur = elmduration.getAttribute("value");
		System.out.println(strDur);
		if (expDur.equalsIgnoreCase(strDur)) {
			Assert.assertEquals(expDur, strDur, "Matched");
			System.out.println(ANSI_GREEN_TEXT + "" + expDur + "" + strDur + "" + "Title Found");
		} else {
			Assert.assertNotEquals("Not Matched", expDur, strDur);
			System.out.println(ANSI_RED_TEXT + "" + expDur + "" + strDur + "" + "Title Not Found");
		}
	}
	
	//Sub Tiltes Element
	@FindBy(how=How.XPATH,using="//div[contains(@class,'theo-secondary-color vjs-control-bar')]//button[4]")
	WebElement elmsubtit;
	
	//Click on Subtitle
	public void clk_subtit() throws Throwable{
		//elmsubtit.click();
		Actions action = new Actions(driver);
        action.moveToElement(elmsubtit).perform(); 
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(elmsubtit));
        elmsubtit.click();
	}
	
	//chinees click element
	@FindBy(how=How.XPATH,using="//ul[contains(@class,'vjs-menu-content theo-menu-content')]//li[1]//div[1]//div[1]")
	WebElement elmSelChinees;
	
	//Click on chinees option as subtitle
	public void clk_subtit_chinios() throws Throwable{
		elmSelChinees.click();
	}
	
	@FindBy(how=How.XPATH,using="//ul[contains(@class,'vjs-menu-content theo-menu-content')]//li[2]//div[1]//div[1]")
   WebElement elmFrench;
	
	//Click on chinees option as subtitle
		public void clk_subtit_french() throws Throwable{
			elmFrench.click();
		}
}