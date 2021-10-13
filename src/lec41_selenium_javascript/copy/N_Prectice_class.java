package lec41_selenium_javascript.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class N_Prectice_class {
	WebDriver driver;

	@BeforeTest
	public void hoverOverActions() {
		System.setProperty("webdriver.gecko.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/geckodriver");
		driver = new FirefoxDriver();
		
	}

	@Test(enabled = true, priority = 1)
	public void fullscreenWindow() {
		driver.get("https://amazon.com/");
		driver.manage().window().fullscreen();
	}


	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
