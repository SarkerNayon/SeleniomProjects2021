package lec41_selenium_javascript.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B02_get_title {
	WebDriver driver;

	@BeforeTest
	public void hoverOverActions() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test(enabled = true, priority = 1)
	public void fullscreenWindow() throws InterruptedException {
		driver.get("https://amazon.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
	}
	
	@Test(enabled = true, priority = 2)
	public void getTitleFunction() throws InterruptedException {
		System.out.println("The title of the website is : " + driver.getTitle());
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
