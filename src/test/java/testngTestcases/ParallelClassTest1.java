package testngTestcases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ParallelClassTest1 {
	WebDriver driver;
	@BeforeTest
	public void fireFoxTearUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void fireFoxMethod() throws InterruptedException{
		driver.get("https://www.google.com");
		Thread.sleep(10000);
	}
	@AfterTest
	public void fireFoxTearDown() {
		driver.close();
	}
}

/*
<suite name="Suite">
<test thread-count="5" name="Test" parallel="classes">
  <classes>
    <class name="testngTestcases.ParallelTest2"/>
    <class name="testngTestcases.ParallelTest1"/>
  </classes>
</test>
</suite>
*/