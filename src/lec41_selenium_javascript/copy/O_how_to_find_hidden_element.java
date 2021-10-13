package lec41_selenium_javascript.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class O_how_to_find_hidden_element {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@BeforeTest
	public void hoverOverActions() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://ebay.com/");
	}

	@Test(enabled = true, priority = 1)
	public void SelectByTheVisibletext() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Books");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".gh-tb.ui-autocomplete-input")).sendKeys("Herry Porter", Keys.ENTER);
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
