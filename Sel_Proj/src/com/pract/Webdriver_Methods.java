package com.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current " +  currentUrl);
		
		driver.navigate().to("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
	   WebElement findElement = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
	   boolean displayed = findElement.isDisplayed();
	   System.out.println(displayed);
	   boolean enabled = findElement.isEnabled();
	   System.out.println(enabled);
	   boolean selected = findElement.isSelected();
	   System.out.println(selected);
		findElement.clear();
		
		driver.close();
		
	}
	
	
	
	
}
