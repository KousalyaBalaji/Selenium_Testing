package com.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		// propery setting key-driver name, value - location
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		// browser launch
		// interface (parent) class(child)
		WebDriver driver = new ChromeDriver();

		// get url
		driver.get("https://www.facebook.com/");

		// maximize
		driver.manage().window().maximize();

		Thread.sleep(3000);
		 
		// back
		driver.navigate().back();

		//get title
		String title = driver.getTitle();
		System.out.println("Currenttitle is : "+title);
		
		// get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Currenturl is : "+currentUrl);

		// refresh
		driver.navigate().refresh();

		// close
		driver.close();

	}

}
