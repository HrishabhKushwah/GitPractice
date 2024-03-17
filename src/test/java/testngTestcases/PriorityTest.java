package testngTestcases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTest{
	WebDriver driver;
	@BeforeTest
	public void chromeTearUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority = 0)
	public void Banana() throws InterruptedException{
		driver.get("https://www.google.com");
		System.out.println("banana");
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void Apple() throws InterruptedException{
		driver.get("https://www.facebook.com");
		System.out.println("apple");
		Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void Cat() throws InterruptedException{
		driver.get("https://www.twitter.com");
		System.out.println("cat");
		Thread.sleep(5000);
	}
	@AfterTest
	public void fireFoxTearDown() {
		driver.close();
	}
}