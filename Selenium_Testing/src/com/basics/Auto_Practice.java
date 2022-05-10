package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Practice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		signin.click();
		driver.findElement(By.id("email")).sendKeys("riya18v@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("roHanvika@1805");
		WebElement login = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		login.click();
	}

}
