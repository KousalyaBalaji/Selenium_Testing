package com.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement best = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		Actions ac = new Actions(driver);
		ac.contextClick(best).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement elec = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		Actions ac1 = new Actions(driver);
		ac1.contextClick(elec).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// getWindowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}
		String myTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
		for (String title : windowHandles) {
			if (driver.switchTo().window(title).getTitle().equals(myTitle)) {
				break;
			}

		}

	}
}
