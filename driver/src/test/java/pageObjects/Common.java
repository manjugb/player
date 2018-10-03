package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
/* @author:Manjunath Golla Bala
 * @desc:this class contains common methods 
 */

import browserFactory.DriversFactory;

public class Common extends DriversFactory{
	public WebDriver driver;
	
	public Common(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	//Click links text 
	public  void clickAllHyperLinksName(String strlinkName){
	    int numberOfElementsFound = getNumberOfElementsFound(By.linkText(strlinkName));
	    System.out.println(numberOfElementsFound);
	    for (int pos = 0; pos < numberOfElementsFound; pos++) {
	        getElementWithIndex(By.tagName(strlinkName), pos).click();
	        wd.navigate().back();
	    }
	}

	
	
	//Click Images each one using this method 
		public  void clickAllHyperImages(String imageName){
		    int numberOfElementsFound = getNumberOfElementsFound(By.xpath(imageName));
		    System.out.println(numberOfElementsFound);
		    for (int pos = 0; pos < numberOfElementsFound; pos++) {
		        getElementWithIndex(By.xpath(imageName), pos).click();
		       // wd.navigate().back();
		    }
		}

		public  int getNumberOfElementsFound(By by) {
		    return wd.findElements(by).size();
		}

		public static WebElement getElementWithIndex(By by, int pos) {
		    return wd.findElements(by).get(pos);
		}
		
		public void waifortime() throws Throwable{
			Thread.sleep(2000);
		}

}
