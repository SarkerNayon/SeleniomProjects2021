package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C_use_of_click_method {
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

	@Test
	public void clickSearchButton() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='search-query']")).click();
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
