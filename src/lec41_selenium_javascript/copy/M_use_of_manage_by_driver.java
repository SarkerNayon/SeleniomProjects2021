package lec41_selenium_javascript.copy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class M_use_of_manage_by_driver {
	WebDriver driver;

	@BeforeTest
	public void hoverOverActions() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window();
	}

	@Test(enabled = true, priority = 1)
	public void fullscreenWindow() {
		driver.get("https://amazon.com/");
		driver.manage().window().fullscreen();
	}

	@Test(enabled = true, priority = 2)
	public void sixeOfTheWindow() {
		driver.get("https://google.com/");
		System.out.println("The size of the screen is " + driver.manage().window().getSize());
	}

	@Test(enabled = true, priority = 3)
	public void deleteCocies() {
		driver.manage().deleteAllCookies();
		driver.get("https://staples.com/");
	}

	@Test(enabled = true, priority = 4)
	public void waitForWindow() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().window().wait(3000);
		driver.manage().deleteAllCookies();
		driver.get("https://ebay.com/");
	}

	// to set a fixed browser window.
	@Test(enabled = true, priority = 1)
	public void setASpecificSizeOfWindow() {
		Dimension dimension = new Dimension(800, 800);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://cvs.com/");
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
