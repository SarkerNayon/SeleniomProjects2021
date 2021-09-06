package lec29_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C_use_of_click_method_by_Diffrent_locator {

	WebDriver driver;

	// public static void main(String[] args) throws InterruptedException {
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(3333);
	}
	@Test
	public void loginButtonTest() {
		driver.findElement(By.id("cms-login-submit")).click();
		
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
