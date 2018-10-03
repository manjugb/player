package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import browserFactory.DriversFactory;

public class DemoHlsDashPage extends DriversFactory {
	public WebDriver driver;
	public static final String ANSI_RED_TEXT = "\033[31m";
	public static final String ANSI_GREEN_TEXT = "\033[32;1;2m";
	
	public DemoHlsDashPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	//h1 title hls dash player
	@FindBy(how=How.XPATH,using="//h1[@class='no-margin']")
	WebElement elmh1Title;
	
	//Verify h1 title
	public void ver_h1tit_dash(String expH1title){
		 String strH1title=elmh1Title.getText().toString();
   	if(expH1title.equalsIgnoreCase(strH1title)){
   		Assert.assertEquals(expH1title, strH1title);
   		System.out.println(ANSI_GREEN_TEXT + ""+ strH1title+"" + "Title Found");
   	}else{
   		Assert.assertNotSame("Not Matched", expH1title, strH1title);
   		System.out.println(ANSI_RED_TEXT + ""+ strH1title+""+expH1title+ "" + "Title Not Found");
   	}
   }
	
	
	//Find content
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/p[1]")
	WebElement elmContent;
	
	//Verify Content
	public void ver_content_dash(String expContent){
		 String strContent=elmContent.getText().toString();
  	if(expContent.equalsIgnoreCase(strContent)){
  		Assert.assertEquals(expContent, strContent,"Matched");
  		System.out.println(ANSI_GREEN_TEXT + ""+ expContent+""+strContent+ "" + "Title Found");
  	}else{
  		Assert.assertNotSame("Not Matched", expContent, strContent);
  		System.out.println(ANSI_RED_TEXT + ""+ expContent+""+strContent+ "" + "Title Not Found");
  	}
  }
	
	
	
}
