package com.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));

		// isMultiple
		Select s = new Select(multiple);
		boolean mul = s.isMultiple();
		System.out.println("Is multiple :" + mul);

		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");

		// getoptions
		System.out.println("----------------GetOptions-------------");
		List<WebElement> alloptions = s.getOptions();

		for (WebElement all : alloptions) {

			String text = all.getText();
			System.out.println(text);
		}

		// getfirstSelectedOption
		System.out.println("----------------firstSelectedOption-------------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text2 = firstSelectedOption.getText();

		System.out.println(text2);

	}

}
