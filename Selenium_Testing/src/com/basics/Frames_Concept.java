package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_Concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Hello ");
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		//driver.switchTo().frame(driver.findElement(By.id("frm1")));
		driver.switchTo().frame("frm1");
		Select course = new Select(driver.findElement(By.id("course")));
		course.selectByVisibleText("Java");

		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("frame3");// frame 3

		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("main web");

		driver.close();

	}

}
