package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import browserFactory.DriversFactory;

public class AdjustmentTester extends DriversFactory {

	public WebDriver driver;
	public static final String ANSI_RED_TEXT = "\033[31m";
	public static final String ANSI_GREEN_TEXT = "\033[32;1;2m";

	public AdjustmentTester(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// h1 title
	@FindBy(how = How.XPATH, using = "//h1[@class='demoindexheader page-center']")
	WebElement elmh1Title;

	// Verify title
	public void vr_h1title(String streh1title) throws Throwable {

		String strh1title = elmh1Title.getText().toString();
		if (streh1title.equalsIgnoreCase(strh1title)) {
			Assert.assertEquals(streh1title, strh1title);
			System.out.println(ANSI_GREEN_TEXT + "" + strh1title + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", streh1title, strh1title);
			System.out.println(ANSI_RED_TEXT + "" + strh1title + "" + streh1title + "" + "Title Not Found");
		}
	}

	// Content
	@FindBy(how = How.XPATH, using = "//body[contains(@class,'hs-content-id-5287362972 hs-site-page page')]/div[contains(@class,'body-container-wrapper')]/div[contains(@class,'body-container container-fluid')]/div[contains(@class,'row-fluid-wrapper row-depth-1 row-number-1')]/div[contains(@class,'row-fluid')]/div[contains(@class,'span12 widget-span widget-type-widget_container flexible-content')]/span[@id='hs_cos_wrapper_module_1499408375548122']/div[@id='hs_cos_wrapper_widget_1501853307605']/div[contains(@class,'row-fluid democontent')]/div[contains(@class,'page-center content-wrapper')]/p[1]")
	WebElement elmcontent1;

	// Verify Content
	public void vr_content(String strexcont1) throws Throwable {

		String strcont1 = elmh1Title.getText().toString();
		if (strexcont1.equalsIgnoreCase(strcont1)) {
			Assert.assertEquals(strexcont1, strcont1);
			System.out.println(ANSI_GREEN_TEXT + "" + strcont1 + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", strexcont1, strcont1);
			System.out.println(ANSI_RED_TEXT + "" + strcont1 + "" + strexcont1 + "" + "Title Not Found");
		}
	}

	// Content2
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Switch between VAST and VPAID ads with an ad posit')]")
	WebElement elmcont2;

	// Verify content2
	public void vr_conte2(String strexcont2) throws Throwable {

		String strcont2 = elmh1Title.getText().toString();
		if (strexcont2.equalsIgnoreCase(strcont2)) {
			Assert.assertEquals(strexcont2, strcont2);
			System.out.println(ANSI_GREEN_TEXT + "" + strcont2 + "" + "Title Found");
		} else {
			Assert.assertNotEquals("Not Matched", strexcont2, strcont2);
			System.out.println(ANSI_RED_TEXT + "" + strcont2 + "" + strexcont2 + "" + "Title Not Found");
		}
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Learn more about our different client side adverti')]")
	WebElement elmContent3;

	// Verify content3
	public void vr_content3(String strecon3) throws Throwable {
		String strcont3 = elmh1Title.getText().toString();
		if (strecon3.equalsIgnoreCase(strcont3)) {
			Assert.assertEquals(strecon3, strcont3);
			System.out.println(ANSI_GREEN_TEXT + "" + strcont3 + "" + "Title Found");
		} else {
			Assert.assertNotEquals("Not Matched", strecon3, strcont3);
			System.out.println(ANSI_RED_TEXT + "" + strcont3 + "" + strecon3 + "" + "Title Not Found");
		}
	}

	// Events Log for ad breaks
	@FindBy(how = How.XPATH, using = "//table[contains(@class,'events-log')]")
	WebElement elmeventlog;

	public void vr_eventlog(String strEventname) throws Throwable {
		String strContent = elmeventlog.getText().toString();
		if (strContent.contains(strEventname)) {
			Assert.assertTrue(strContent.contains(strEventname));
			System.out.println(ANSI_GREEN_TEXT + "" + strEventname + "" + strContent + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", strEventname, strContent);
			System.out.println(ANSI_RED_TEXT + "" + strEventname + "" + strContent + "" + "Title Not Found");
		}

	}

	// Ad content on vedio
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'theo-player-wrapper')]//div[17]")
	WebElement elmvadcontnt;

	public void vr_vcont(String streContent) throws Throwable {
		String strvContent = elmeventlog.getText().toString();
		if (strvContent.contains(streContent)) {
			Assert.assertTrue(strvContent.contains(streContent));
			System.out.println(ANSI_GREEN_TEXT + "" + streContent + "" + strvContent + "" + "Title Found");
		} else {
			Assert.assertNotSame("Not Matched", streContent, strvContent);
			System.out.println(ANSI_RED_TEXT + "" + streContent + "" + strvContent + "" + "Title Not Found");
		}

	}

	// AdURL
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'//cdn.theoplayer.com/demos/preroll.xml')]")
	WebElement adurl;

	public void ver_adurl(String exdurl) throws Throwable {
		String actdurl = adurl.getAttribute("value");
		if (exdurl.equalsIgnoreCase(actdurl)) {
			Assert.assertEquals(exdurl, actdurl);
			System.out.println(ANSI_GREEN_TEXT + "" + exdurl + "" + "Title Found");
		} else {
			Assert.assertNotEquals("Not Matched", exdurl, actdurl);
			System.out.println(ANSI_RED_TEXT + "" + actdurl + "" + exdurl + "" + "Title Not Found");
		}

	}

	@FindBy(how = How.XPATH, using = "//input[contains(@value,'//cdn.theoplayer.com/video/big_buck_bunny/big_buck_bunny_metadata.m3u8')]")
	WebElement vdurl;

	public void ver_vdurl(String exvdurl) throws Throwable {
		String actvdurl = vdurl.getAttribute("value");
		if (exvdurl.equalsIgnoreCase(actvdurl)) {
			Assert.assertEquals(exvdurl, actvdurl);
			System.out.println(ANSI_GREEN_TEXT + "" + exvdurl + "" + "Title Found");
		} else {
			Assert.assertNotEquals("Not Matched", exvdurl, actvdurl);
			System.out.println(ANSI_RED_TEXT + "" + actvdurl + "" + exvdurl + "" + "Title Not Found");
		}

	}

	// Radio Buttons in Adjustment
	// vmap
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'vmap')]")
	WebElement elmvmap;

	// click vmap
	public void clk_vmap() throws Throwable {
		elmvmap.click();
	}

	// VPAID
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'vpaid')]")
	WebElement elmvpaid;

	// click vmap
	public void clk_vpaid() throws Throwable {
		elmvpaid.click();
	}

//Ad Positions
	// Mid-Roll
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'00:00:15')]")
	WebElement elmmidroll;

	// click vmap
	public void clk_midroll() throws Throwable {
		elmmidroll.click();
	}

	// Post Roll
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'end')]")
	WebElement elmpostroll;

	// click vmap
	public void clk_postroll() throws Throwable {
		elmpostroll.click();
	}
	//Update Button
	@FindBy(how=How.XPATH,using="//button[contains(@class,'try-button')]")
	WebElement elmupdate;
	//Click update button
	public void clk_updatebut()throws Throwable{
		elmupdate.click();
	}
	
	

}
