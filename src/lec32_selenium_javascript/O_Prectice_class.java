package lec32_selenium_javascript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class O_Prectice_class {
	WebDriver driver;

	@BeforeTest
	public void hoverOverActions() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@Test(enabled = true, priority = 1)
	public void fullscreenWindow() {
		driver.get("https://amazon.com/");
		driver.manage().window().fullscreen();
	}


	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
