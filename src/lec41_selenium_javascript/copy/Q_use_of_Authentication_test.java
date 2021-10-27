package lec41_selenium_javascript.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q_use_of_Authentication_test {
	WebDriver driver;

	@BeforeTest
	public void hoverOverActions() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://softaretestingplace/");
	}

	@Test(enabled = true, priority = 1)
	public void 
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
