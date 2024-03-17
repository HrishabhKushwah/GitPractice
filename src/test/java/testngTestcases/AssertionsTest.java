package testngTestcases;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class AssertionsTest {
	WebDriver driver;
	String userxpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/p[1]";
	@BeforeTest
	public void browserIntialization() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void softAssertionTest() {
		String username = driver.findElement(By.xpath(userxpath)).getText();
		SoftAssert asset = new SoftAssert();
		asset.assertNotEquals(username, "dfdhjj");
	}
	@Test
	public void hardAssertionTest() {
		String username = driver.findElement(By.xpath(userxpath)).getText();
		Assert.assertEquals(username, "fsdf");		
	}
}