package testngTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void dragAndDrop() {
		WebDriver driver = new ChromeDriver();
		WebElement from = driver.findElement(By.xpath(""));
		WebElement to = driver.findElement(By.xpath(""));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
	}
}
