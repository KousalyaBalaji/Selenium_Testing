package com.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");

		driver.manage().window().maximize();

		// Simple alert

		driver.findElement(By.id("alertBox")).click();
		Alert simple = driver.switchTo().alert();
//		System.out.println(simple.getText());
//		Thread.sleep(2000);
		simple.accept();

		// confirm alert

		driver.findElement(By.id("confirmBox")).click();
		Alert confirm = driver.switchTo().alert();

		Thread.sleep(2000);
		confirm.accept();
		System.out.println(driver.findElement(By.id("output")).getText());

		Thread.sleep(2000);
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmdismiss = driver.switchTo().alert();

		Thread.sleep(2000);
		confirmdismiss.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());

		// Prompt alert

		driver.findElement(By.id("promptBox")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Kousalya");
		Thread.sleep(2000);
		prompt.accept();
		System.out.println(driver.findElement(By.id("output")).getText());

	}

}
