package testngTestcases;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelTesting {
	@Test
	public void chromeBrowser() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(20000);
		driver.quit();
	}
	@Test
	public void firefoxDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}
	
	/*<suite name="Suite">
  		<test name="Test" parallel="methods">
    		<classes>
    			<class name="testngTestcases.ParallelTesting"/>
    		</classes>
  		</test>
	</suite>*/

}
