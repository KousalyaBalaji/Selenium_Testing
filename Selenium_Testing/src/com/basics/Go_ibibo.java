package com.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.sun.glass.events.KeyEvent;

public class Go_ibibo {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.goibibo.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Actions as = new Actions(driver);

		WebElement city = driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]"));

		as.click(city).build().perform();

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(city));
		WebElement cityenter = driver.findElement(By.xpath("//input[@type='text']"));
		cityenter.sendKeys("Chennai");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

//		Thread.sleep(1000);
		WebElement dest = driver.findElement(By.xpath("//input[@type='text']"));

		dest.sendKeys("canada");
		Thread.sleep(1000);
		WebElement toro = driver.findElement(By.xpath("(//div[@class='sc-iAKWXU iyyKqe'])[1]"));
		toro.click();
		WebElement done = driver.findElement(By.xpath("//span[text()='Cancel']"));
		done.click();

		WebElement adult = driver.findElement(By.xpath("(//p[@class='sc-dJjYzT cjzxWN fswWidgetTitle'])[4]"));
		adult.click();

		WebElement child = driver.findElement(By.xpath("(//span[@class='sc-faUpoM jSgnBw'])[4]"));
		as.click(child).build().perform();

		WebElement bus = driver.findElement(By.xpath("//li[text()='business']"));
		as.click(bus).build().perform();

		WebElement don = driver.findElement(By.xpath("//a[text()='Done']"));
		don.click();

		WebElement search = driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']"));
		search.click();

	}
}
