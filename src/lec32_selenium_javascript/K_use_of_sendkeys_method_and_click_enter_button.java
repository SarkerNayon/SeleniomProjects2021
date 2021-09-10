package lec32_selenium_javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class K_use_of_sendkeys_method_and_click_enter_button {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

	@Test(enabled = true, priority = 1)
	public void useClickAndSearch() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("CPU");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	}

	@Test(enabled = true, priority = 2)
	public void useSearchAndEnter() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("GPU");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys(Keys.ENTER);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
