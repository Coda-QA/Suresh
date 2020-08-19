package reusables;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import pageObjects.goibboHome;

public class goibboActions extends goibboHome {

	public goibboActions(WebDriver driver) {
		super(driver);
		System.out.println("driver : " + driver);
	}
	
	public void enterLocationDetail( String locationStart, String locationEnd ){
		WaitUntilElementVisible(fromTextbox);
		fromTextbox.sendKeys(locationStart);
		fromTextbox.sendKeys(Keys.DOWN);
		fromTextbox.click();
		toTextbox.sendKeys(locationEnd);
	}

	public void selectDate() {
		dateSelect.click();
		
	}

	public void search() {
		// TODO Auto-generated method stub
		SearchButton.click();
		
	}
	

}
