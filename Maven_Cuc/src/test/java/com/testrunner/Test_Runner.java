package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Cuc.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile", glue = "com\\stepdefinition",
monochrome = true, dryRun = false, strict = true, plugin= {"html:Report", "json:Report/Ad.json", "pretty", 
	"com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"	} )

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = BaseClass.browserLaunch("Chrome");
	}

	@AfterClass
	public static void tearDown() {
		 driver.close();
		//BaseClass.closeBrowser();
	}

}
