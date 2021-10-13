package lec41_selenium_javascript.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_use_of_get_and_click_button {
	WebDriver driver;

	// public static void main(String[] args) throws InterruptedException {
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
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
