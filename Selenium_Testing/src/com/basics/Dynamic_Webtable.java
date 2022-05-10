package com.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
	static int indexOfTotal, indexOfRecovered;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();

		// Iterate all headers

		List<WebElement> header = driver.findElements(By.tagName("th"));
		for (int i = 0; i < header.size(); i++) {
			String heading = header.get(i).getText();
			// System.out.println(heading);
			String replace = heading.replaceAll("\n", " ");
			 System.out.println(replace);

			if (replace.equalsIgnoreCase("Total Cases")) {

				indexOfTotal = i;
				System.out.println("Index of Total" + indexOfTotal);
			} 
			
			else if (replace.equalsIgnoreCase("Total Recovered")) {
				indexOfRecovered = i;
				System.out.println("Index of Recovered" + indexOfRecovered);
			}
		}

	}

}
