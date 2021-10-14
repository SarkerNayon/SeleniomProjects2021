package hw12Q2selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class K_page_Load_Timeout_and_scriptTimeOut {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();

	}

	@Test(enabled = true, priority = 1)
	public void pageTimeOutMethod() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bankofamerica.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		

		/*
		 * here my question is , if i use pageload timeout instaed of thread.sleep.. the
		 * code failed...so why does it failed. my understanding was pageload timeout
		 * doing the same function as theard.sleep.
		 */
	}
	
	@Test(enabled = true, priority = 2)
	public void setScriptTimeOut() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}