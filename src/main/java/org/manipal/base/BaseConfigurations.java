package org.manipal.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseConfigurations {
	@Test
	public WebDriver getDriver() {
       
		System.setProperty("webdriver.chrome.driver", "D:\\Manipal Workshops\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		return driver;

}
}
