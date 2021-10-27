package hw12Q2selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class J_page_Load_Timeout {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();

	}

	@Test(enabled = true, priority = 1)
	public void pageTimeOutMethod() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.bankofamerica.com/");

		// here my question is , if i use pageload timeout instaed of thread.sleep.. the
		// code failed...so why does it failed.
		// my understanding was pageload timeout doing the same function as
		// theard.sleep.
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
