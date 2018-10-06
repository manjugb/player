package stepdefinitions;

import browserFactory.DriversFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.TheoHomePage;




public class TheoHomePageSteps extends DriversFactory{
	
public browserFactory.DriversFactory df = new browserFactory.DriversFactory();
		 
	
	@Given("^I Go to \"([^\"]*)\" on \"([^\"]*)\"$") 
	 public void open_browser(String url,String browser) throws Throwable{
		df.chooseDriver(url, browser);
		df.getDriver().getTitle();
	 }
	
	@Then("^I Verify h1 \"([^\"]*)\"Title$")
	public void h1_title(String strExh1title) throws Throwable{
		new TheoHomePage(wd).verh1title(strExh1title);
	}
	
	@Then("^I Verify Contains \"([^\"]*)\"Text$")
	public void containtext(String expctxt) throws Throwable{
		new TheoHomePage(wd).vertexttitle(expctxt);
	}
	
	@Then("^I Verify h3 \"([^\"]*)\"Title$")
	public void h3text(String exph3txt) throws Throwable{
		new TheoHomePage(wd).verh3title(exph3txt);
	}
	
	@Then("^I Close Browser$")
    public void close(){
    	df.destroyDriver();
    }
	}


