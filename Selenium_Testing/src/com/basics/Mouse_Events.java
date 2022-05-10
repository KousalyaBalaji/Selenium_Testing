package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();

		// Click
		WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));

		Actions ac = new Actions(driver);

		ac.click(click).build().perform();

		// doubleClick
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));

		ac.doubleClick(doubleclick).build().perform();

		// ContextClick
		WebElement context = driver.findElement(By.id("rightClickBtn"));

		ac.contextClick(context).build().perform();

		driver.navigate().to("https://www.amazon.in/");

		// movetoElement
		WebElement move = driver.findElement(By.xpath("//img[@alt='Fashion']"));

		ac.moveToElement(move).build().perform();

		ac.click(move).build().perform();

		// dragAndDrop
		driver.navigate().to("http://leafground.com/pages/drop.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();

		driver.close();

	}

}
