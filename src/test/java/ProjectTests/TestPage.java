package ProjectTests;

import org.manipal.base.BaseConfigurations;
import org.manipal.pageObjects.HomePage;
import org.manipal.pageObjects.MenuPage;
import org.manipal.pageObjects.MobilePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage extends BaseConfigurations {
	public HomePage homeObj;
	public MenuPage menuObj;
	public MobilePage mobileObj;
	WebDriver driver;

	
	/* gave the memory to pageObjects */

	@BeforeMethod
	public void initialiSetup() {
		driver = getDriver();
		homeObj = new HomePage(driver);
		menuObj = new MenuPage(driver);
		mobileObj = new MobilePage(driver);

	}

	/* TestCase */
	@Test
	public void scenario1() {
		homeObj.verifyHomeLaunchSuccess(); 
		menuObj.menuNavigation();
		mobileObj.verifyMobileHeader();
	}
	
	@AfterMethod()
	public void closeBrowser(){
		 driver.quit();
            System.out.println("Browser Closed");

}
}
