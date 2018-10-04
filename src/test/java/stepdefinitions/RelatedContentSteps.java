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
		new RelatedContent(wd).ver_h1tit_related(exh2title);
	}

}
