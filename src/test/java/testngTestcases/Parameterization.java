package testngTestcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {
	WebDriver driver;
	@Parameters ({"url"})
	@BeforeTest
	public void driverInit(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Parameters({"username","password"})
	@Test
	public void userLogin(String username , String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(5000);
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}

/*
 <suite name="Suite">
	<parameter name="username" value="admin"></parameter>
	<parameter name="password" value="admin123"></parameter>
	<test thread-count="5" name="Test">
		<classes>
			<class name="testngTestcases.Parameterization" />
		</classes>
	</test>
</suite>  
 
*/
 