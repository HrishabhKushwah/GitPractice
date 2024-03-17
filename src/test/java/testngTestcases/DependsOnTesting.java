package testngTestcases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//dependsOnGroup&dependsOnMethods
public class DependsOnTesting {
	WebDriver driver;
	@BeforeTest
	public void chromeTearUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dependsOnGroups= {"A"})
	
	public void Banana() throws InterruptedException{
		driver.get("https://www.google.com");
		System.out.println("banana");
		Thread.sleep(5000);
	}
	//@Test(dependsOnMethods = {"Banana"})
	@Test(groups="A")
	public void Apple() throws InterruptedException{
		driver.get("https://www.facebook.com");
		System.out.println("apple");
		Thread.sleep(5000);
	}
	@AfterTest
	public void fireFoxTearDown() {
		driver.close();
	}
}