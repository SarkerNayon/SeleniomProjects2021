package lec32_selenium_javascript;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class L_use_of_mouse_hover_over_action {
	WebDriver driver;
	
	@BeforeTest
	public void hoverOverActions() {
		System.setProperty("webdriver.chrome.driver","/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://github.com/");
	}
	
	@Test (enabled = true ,priority = 1)
	public void whyGithubButton() throws InterruptedException {
		Actions actions = new Actions(driver); // very importent interview question.
		WebElement whyGithub = driver.findElement(By.xpath("(//summary[@class='HeaderMenu-summary HeaderMenu-link px-0 py-3 border-0 no-wrap d-block d-lg-inline-block'])[1]"));
		Thread.sleep(3000);
		actions.moveToElement(whyGithub).build().perform();
		Thread.sleep(5000);
		// to know the text of 
		//System.out.println("\n the Text fromText the github website");
	}
	
//	@Test(enabled = true ,priority = 2)
//	public void useSearchAndEnter() {
//		
//		}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
