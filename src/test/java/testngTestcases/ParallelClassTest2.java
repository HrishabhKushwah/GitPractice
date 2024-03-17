package testngTestcases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ParallelClassTest2 {
	WebDriver driver;
	@BeforeTest
	public void chromeTearUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void chromeMethod() throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(10000);
	}
	@AfterTest
	public void chromeTearDown() {
		driver.close();
	}
}