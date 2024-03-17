package testCases;

import java.io.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void IntWebDriver() throws InterruptedException, IOException {
		
	
		
		
		//System.setProperty("WebDriver.driver.chrome", "");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//js.executeScript("window.scrollBy(500,500)");//scrolling horizontal or vertical
		//String str = js.executeScript("return document.title;").toString();
		//System.out.println(str);
		//driver.navigate().refresh();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//body[1]/div[7]/div[1]/div[8]/div[9]/div[1]/img[1]")).click();
		
		WebDriver driver = new ChromeDriver();
		
		WebElement from = driver.findElement(By.xpath("xpath"));
		WebElement to = driver.findElement(By.xpath("xpath"));
		
		//drag n drop
		//Actions act = new Actions(driver);
		//act.dragAndDrop(from, to).build().perform();
		
		//screenshot
		//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("location"+"Name"+".jpeg"));
		
		/*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");		
		driver.findElement(By.tagName("button")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String str = js.executeScript("return document.title;").toString();
		System.out.println(str);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		
		//window
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		
		//TakesScreenshot screenshot = (TakesScreenshot) driver;
		//File source = screenshot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
		
		//Screenshot code
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Image location"+"FileName"+".jpeg"));
		
		/*
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//js.executeScript("window.scrollBy(0,100)");
		WebElement ele = driver.findElement(By.xpath("//body[1]/footer[1]/section[1]/div[2]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		ele.click();
		Thread.sleep(5000);
		
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		
		Iterator<String> I1 = allwin.iterator();
		while(I1.hasNext()) {
			String childwindow = I1.next();
			if(!parentwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow).getTitle();
				//driver.close();
				Thread.sleep(5000);
				driver.switchTo().window(parentwindow);
				Thread.sleep(5000);
				WebElement ele1 = driver.findElement(By.xpath("//body[1]/footer[1]/section[1]/div[2]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]"));
				JavascriptExecutor js1 = (JavascriptExecutor)driver;
				js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(5000);
				ele1.click();
				Thread.sleep(5000);
			}
		}
		
		
		
		/*driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("toys");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("id=\"nav-search-submit-button\"")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		
		
		
			
		//waits,windowhandling,locators,javascriptexecutor, scrolling,screenshot, dropdowns,radio and checkboxes
		//navigations, drivers, alerts, xpath,execption handling,assertions,<list>
		
		//oops, 
		
		//frameworks design
		
		//git
		
		//jenkins
		
		//testng cucumber data driven
		
		//array and string programs
		
	/*Scroll methods
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(40,50)");//scroll 40 horizontally and 50 vertically
	jse.executeScript("window.scrollBy(-40,-50)");//scroll left 40 hori and 50 up
	WebElement element = driver.findElement(By.cssSelector(parentwindow));
	jse.executeScript("arguments[0].scrollIntoView();", element);//scroll till element found
	jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	*/
		
	/* Waits
	WebDriverWait wait = new WebDriverWait(driver, 250);
	wait.until(ExpectedConditions.alertIsPresent());
	FluentWait fw = new FluentWait(driver);
	fw.withTimeout(250,Duration.ofSeconds(10));
	fw.pollingEvery(20,Duration.ofSeconds(20));
	fw.ignoring(NoSuchElementException.class);
	fw.until(ExpectedConditions.alertIsPresent());
	*/
	
	/*dropdowns	
	Select dropdown = new Select(driver.findElement(By.id("quantity")));
	dropdown.selectByIndex(1);
	//dropdown.selectByValue("");
	//dropdown.selectByVisibleText("");
	*/
		
	}
}






