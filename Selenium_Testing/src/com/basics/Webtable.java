package com.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/table.html");

		driver.manage().window().maximize();

		//All Data
		System.out.println("---------------All Data----------");
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement all : alldata) {
			
			String text = all.getText();
			System.out.println(text);
		}
		
		//System.out.println();
		
		//rowData
		System.out.println("--------------Row Data--------");
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for (WebElement rowData : row) {
			String text1 = rowData.getText();
			System.out.println(text1);
			
		}
		
		//Column Data
		System.out.println("--------------column Data--------");
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		for (WebElement columnData : row1) {
			String text1 = columnData.getText();
			System.out.println(text1);
			
		}
		
		//particular data
		
System.out.println("--------------particular Data--------");
		
		WebElement part = driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]"));
		String text3 = part.getText();
			System.out.println(text3);
		
		//Headers
	
	System.out.println("--------------Headers--------");
	List<WebElement> head = driver.findElements(By.tagName("th"));
	for (WebElement header : head) {
		String text4 = header.getText();
		System.out.println(text4);
	}
	}
}


	
	

