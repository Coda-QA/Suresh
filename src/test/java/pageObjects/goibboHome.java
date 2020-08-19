/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

/**
 * @author sureshbabui
 *
 */
public class goibboHome extends BaseTest {
	
	public goibboHome(WebDriver driver) {
		this.driver =driver ;
	}

	@FindBy(id = "gosuggest_inputSrc")
    public WebElement fromTextbox;
	
	@FindBy(id = "gosuggest_inputDest")
    public WebElement toTextbox;
	
	@FindBy(xpath = "//div[@aria-label='Fri Aug 21 2020']")
    public WebElement dateSelect;
	
	@FindBy(id = "gi_search_btn")
    public WebElement SearchButton;
	

}
