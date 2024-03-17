package testngTestcases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	@Test
	public void findBrokenLinks() {
		String url = "";
		String homepage = "https://eportal.incometax.gov.in/";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.incometax.gov.in/iec/foportal/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext()) {
			try {
				url = it.next().getAttribute("href");
				System.out.println(url);
				if(url==null||url.isEmpty()) {
					System.out.println("Url not configured correctly.");
					continue;
				}
				if(!url.startsWith(homepage)) {
					System.out.println("Skipping as not belonging to homepage.");
					continue;
				}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}