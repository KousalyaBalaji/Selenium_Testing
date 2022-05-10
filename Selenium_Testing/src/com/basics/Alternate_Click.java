package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alternate_Click {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.yatra.com/flights");

		driver.manage().window().maximize();
		
		
		//click - webelement methods
		WebElement round = driver.findElement(By.xpath("//a[@title='Round Trip']"));
		round.click();
		
		Thread.sleep(3000);

		//by using sendKeys  -  using keys class- enter and return key
		WebElement multi = driver.findElement(By.xpath("//a[@title='Multicity']"));
		WebElement flights = driver.findElement(By.xpath("//a[@title='Flights']"));
		WebElement hotel = driver.findElement(By.xpath("//a[@title='Hotels']"));
		multi.sendKeys(Keys.ENTER);
		round.sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);
		
		//By using JavascirptExecutor
	
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", hotel );
		executor.executeScript("document.getElementById('booking_engine_holidays').click();");
		
		//By using Action class
		Actions ac = new Actions(driver);
		ac.click(flights).build().perform();
		
		//By using actions - moveToElement
		ac.moveToElement(multi).click().build().perform();
		
		
		//By using actions clickAndHold and release
		ac.clickAndHold(hotel).release().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
