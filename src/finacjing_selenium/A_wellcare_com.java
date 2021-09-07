package finacjing_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_wellcare_com {
	WebDriver driver;

	@BeforeTest
	public void wellcareTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.wellcare.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='close-reveal-modal'])[3]")).click();
		driver.findElement(By.xpath("(//a[@class='button header-link'])[1]")).click();
		driver.findElement(By.xpath("(//p[@class='sl-label'])[3]")).click();
		driver.findElement(By.xpath("(//li[contains(text(),'I am a ')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class='sl-label'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[text()='New York'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class='sl-label'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Medicare']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("registrtionBtn")).click();
		
		Thread.sleep(5000);
		
	}
	

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
