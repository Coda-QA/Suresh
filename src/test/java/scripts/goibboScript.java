package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import reusables.goibboActions;
import utilities.BaseTest;

public class goibboScript  extends BaseTest {
	
	@Test
	public void searchScript() {
		goibbo.enterLocationDetail("Chennai" ,"Delhi");
		goibbo.selectDate();
		goibbo.search();
	}

}
