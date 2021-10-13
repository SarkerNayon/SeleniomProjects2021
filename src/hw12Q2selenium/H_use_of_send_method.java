package hw12Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class H_use_of_send_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(enabled = true, priority = 1)
	public void sendMethod() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='nav-search-query']")).sendKeys("Home Loan");
		driver.findElement(By.name("Search Module - Top Result – Search Button")).click();
		Thread.sleep(5000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
