package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class J_use_of_get_text_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.applebank.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(enabled = true, priority = 1)
	public void AccountDropDown() throws InterruptedException {
		driver.findElement(By.cssSelector(".col-xs-11.col-sm-4.pull-right.account-login-title.account-login-toggle")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='account-login-submit btn'])[1]")).click();
		Thread.sleep(3000);
	}
	
	

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
