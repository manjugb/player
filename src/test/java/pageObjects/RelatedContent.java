package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		
		//aside[contains(@class,'floatleft othertests')]

	
}
