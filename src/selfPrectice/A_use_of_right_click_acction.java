package selfPrectice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_use_of_right_click_acction {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
	}
	
	@Test
	public void rightClick() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//a[@id='NAV_CONTACT_US']"));
		actions.contextClick(rightClick).build().perform();
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
		
	}
}
