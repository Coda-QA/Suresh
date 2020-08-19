/**
 * 
 */
package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import reusables.goibboActions;

/**
 * @author sureshbabui
 *
 */
public class BaseTest {
	
	protected WebDriver driver = null;
	protected goibboActions goibbo;


	@BeforeMethod
	@Parameters(value = { "browser" })
	public void beforeMethod(String browser) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "");
		ChromeOptions options = new ChromeOptions();
		options.merge(capabilities);
		capabilities.setCapability("browserName", browser);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.get("https://www.goibibo.com/");
		
		goibbo = PageFactory.initElements(driver, goibboActions.class);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	

	public void WaitUntilElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60, 1000);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void WaitUntilElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60, 1000);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
