package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("KousalyaB");
		driver.findElement(By.id("password")).sendKeys("roHanvika");
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByValue("New York");

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(3);

		Thread.sleep(1000);

		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByVisibleText("Super Deluxe");

		WebElement roomno = driver.findElement(By.name("room_nos"));
		Select s4 = new Select(roomno);
		s4.selectByValue("2");

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adult);
		s5.selectByValue("2");

		WebElement child = driver.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByVisibleText("1 - One");
		Thread.sleep(1000);

		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();

		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();

		WebElement cont = driver.findElement(By.name("continue"));
		cont.click();

		driver.findElement(By.id("first_name")).sendKeys("Kousalya");
		driver.findElement(By.id("last_name")).sendKeys("Balaji");
		driver.findElement(By.id("address")).sendKeys("Vellore");
		driver.findElement(By.id("cc_num")).sendKeys("1234567898765432");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(cctype);
		s7.selectByVisibleText("VISA");
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(month);
		s8.selectByVisibleText("January");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(year);
		s9.selectByVisibleText("2012");
		driver.findElement(By.id("cc_cvv")).sendKeys("209");;
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		WebElement out = driver.findElement(By.xpath("//a[text()='Logout']"));
		out.click();
		
	}

}
