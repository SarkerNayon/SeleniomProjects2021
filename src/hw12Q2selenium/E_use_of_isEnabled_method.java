package hw12Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E_use_of_isEnabled_method {
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
	public void clickSearchButton() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='search-query']")).click();
		Thread.sleep(2000);
	}

	@Test(enabled = true, priority = 2)
	public void isEnabledMethod() throws InterruptedException {
		boolean elementEnable = driver.findElement(By.xpath("//a[@id='forgot-oid-pwd']")).isEnabled();
		Thread.sleep(2000);
		System.out.println("This is from isEnable method" + elementEnable);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
