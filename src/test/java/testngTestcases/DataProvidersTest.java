package testngTestcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/*public class DataProvidersTest {
	@DataProvider(name="TestData")
	public Object[][] testData() {
		return new Object[][] {
			{"john",21},
			{"hrishabh",31}
		};
	}
	@Test(dataProvider="TestData")
	public void testMethod(String name, int age) {
		System.out.println(name+ ":"+ age);
		
	}
}*/

public class DataProvidersTest {
	@DataProvider(name="TestData")
	public Object[][] testData(){
		return new Object[][] {
			{"hrishabh","12345"},
			{"admin","admin123"}
		};
	}
	@Test(dataProvider="TestData")
	public void testMethod(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
	}
	
}

