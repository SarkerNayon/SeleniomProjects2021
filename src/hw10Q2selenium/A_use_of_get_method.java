package hw10Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_use_of_get_method {
	WebDriver driver;
	
	@BeforeTest
	public void bankOfAmerica() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
		
		@Test
		public void clickOnSearch() throws InterruptedException {
			driver.findElement(By.className("spa-btn spa-btn--primary spa-btn--block spa-btn--medium")).click();
			Thread.sleep(5000);
		}
		
		@AfterTest
		public void tearUp() {
			driver.quit();
		}

}
