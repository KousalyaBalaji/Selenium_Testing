package com.basics;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;


public class Alternate_SendKeys {

	public static void main(String[] args) throws AWTException {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
					
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();

			WebElement user = driver.findElement(By.name("q"));
			//user.sendKeys("Kousalya");
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			//executor.executeScript("document.getElementsByName('username')[0].value='q'", "");  //username is webelement name
			
			//executor.executeScript("arguments[0].value='JAVA'", user );
			
			driver.switchTo().activeElement();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_Q);
			r.keyRelease(KeyEvent.VK_Q);
			r.keyPress(KeyEvent.VK_L);
			r.keyRelease(KeyEvent.VK_L);
	
	}

}
