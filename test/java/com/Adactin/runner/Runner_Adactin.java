package com.Adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import BDD.Cucumber.Reusable_Methods;
import Filereader_helper.File_Reader_Manager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adactin\\features\\Adactin.feature" , 
glue = "com.Adactin.Stepdefinition",monochrome = true
, plugin = {"html:Report/Cucumber_Report","pretty",
		"json:Report/Cucumber.json"} )

public class Runner_Adactin {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUP() throws IOException {
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\rjaga\\eclipse-workspace\\Selenium_Practice\\drivers\\chromedriver.exe");
//	    driver = new ChromeDriver();
		
		String browser = File_Reader_Manager.file_Manager().ConfigurationReader().getBrowser();
		driver = Reusable_Methods.browser_Launch(browser);
		
	}
}
