package testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrokenLinks {
	@Test
	public void findBrokenLinks() throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opengov.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link: links) {
			String str = link.getAttribute("href");
			System.out.println(str);
			VerifyLink(str);
		}
		driver.close();
	}
	public void VerifyLink(String url) throws IOException {
		try {
			URL link = new URL(url);
			HttpURLConnection connection = (HttpURLConnection)link.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();
			if(connection.getResponseCode()==200) {
				System.out.println(connection.getResponseCode()+":"+"Request is OK!");
			}
			else {
				System.out.println(connection.getResponseCode()+":"+"Bad Request!");
			}
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}