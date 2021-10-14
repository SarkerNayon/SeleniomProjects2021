package hw12Q2selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class L_javascript_enter_and_send {
	WebDriver driver;
	JavascriptExecutor js; //casting javascriptExecutor/driver

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(2000);
	}
	
	@Test(enabled = true, priority = 1)
	public void sendAndEnterByjsExecutor() throws InterruptedException {
		WebElement serchBox = driver.findElement(By.xpath("//input[@id='nav-search-query']"));
		js.executeScript("arguments[0].click()", serchBox );
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Car Loan' ", serchBox); //.sendKeys("Car Loan", Keys.ENTER)
		Thread.sleep(2000);
		WebElement serchButton = driver.findElement(By.cssSelector(".submit.track-me"));
		js.executeAsyncScript("arguments[0].click()",serchButton);
		Thread.sleep(2000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
