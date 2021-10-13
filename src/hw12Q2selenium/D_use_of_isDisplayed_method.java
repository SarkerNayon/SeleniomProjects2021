package hw12Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D_use_of_isDisplayed_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(enabled = true , priority = 1)
	public void clickSearchButton() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='search-query']")).click();
		Thread.sleep(2000);
	}
	
	// Use of cssSelector
	@Test(enabled = true , priority = 2)
	public void isDisplayedMethod() throws InterruptedException {
		boolean elementDisplay = driver.findElement(By.cssSelector(".tl-private.spa-input-text")).isDisplayed();
		//passcode feild of user sign on.
		Thread.sleep(2000);
		System.out.println(elementDisplay);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
