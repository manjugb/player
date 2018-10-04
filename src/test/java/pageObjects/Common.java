package pageObjects;

/* author:Manjunath Golla Bala
 * desc:this class contains Common methods and elements
 * features:Common Objects which call in all the features
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
/* @author:Manjunath Golla Bala
 * @desc:this class contains common methods 
 */
import org.openqa.selenium.support.ui.WebDriverWait;

import browserFactory.DriversFactory;

public class Common extends DriversFactory {
	public WebDriver driver;

	public Common(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Click links text
	public void clickAllHyperLinksName(String strlinkName) {
		int numberOfElementsFound = getNumberOfElementsFound(By.linkText(strlinkName));
		System.out.println(numberOfElementsFound);
		for (int pos = 0; pos < numberOfElementsFound; pos++) {
			getElementWithIndex(By.tagName(strlinkName), pos).click();
			wd.navigate().back();
		}
	}

	// Click Images each one using this method
	public void clickAllHyperImages(String imageName) {
		int numberOfElementsFound = getNumberOfElementsFound(By.xpath(imageName));
		System.out.println(numberOfElementsFound);
		for (int pos = 0; pos < numberOfElementsFound; pos++) {
			getElementWithIndex(By.xpath(imageName), pos).click();
			// wd.navigate().back();
		}
	}

	public int getNumberOfElementsFound(By by) {
		return wd.findElements(by).size();
	}

	public static WebElement getElementWithIndex(By by, int pos) {
		return wd.findElements(by).get(pos);
	}

	public void waifortime() throws Throwable {
		Thread.sleep(3000);
	}
	
	public void waifortime_vedio() throws Throwable {
		Thread.sleep(6000);
	}


	// First Time click Play Vedio element
	@FindBy(how = How.XPATH, using = "//button[@title='Play Video']")
	WebElement elmFirsPlayclick;

	// Click first time vedio
	public void clk_play_first() throws Throwable {
		//elmFirsPlayclick.click();
		Actions builder = new Actions(driver);
       	builder.moveToElement(elmFirsPlayclick).click().perform();
	}

	// Find play button element from Play Chapter
    @FindBy(how=How.XPATH,using="//div[@class='theo-player-wrapper']//div[9]//button[1]")
    WebElement elmPlay_Pause;
    
    //Click Play or Pause using this method
    public void clk_play_pause() throws Throwable{
    	//elmPlay_Pause.click();
    	/*Actions builder = new Actions(driver);
       	builder.moveToElement(elmPlay_Pause).click().perform();*/
       	
       	Actions action = new Actions(driver);
        action.moveToElement(elmPlay_Pause).perform(); 
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(elmPlay_Pause));
        elmPlay_Pause.click();
    }
    
    //Find Mute Button Element
    @FindBy(how=How.XPATH,using="//div[contains(@class,'theo-player-wrapper')]//div[9]//button[2]")
    WebElement elmute_unmute;
    
    //Click mute and mute options
    public void clk_mute_unmute() throws Throwable{
    	elmute_unmute.click();;
    }
    
    
    
    
    
}
