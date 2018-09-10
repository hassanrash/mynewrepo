package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;

public class WebDriverCheckboxes {
	
	ExtentReports extent;
	
	extent = new ExtentReports();
	
	
	
//	ExtentTest test; 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/hassanrash/Documents/Tools/chromedriver");
//		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/hassanrash/Downloads/automated-web-testing-selenium-webdriver-java%20(2)/07/demos/m6/before/src/main/webapp/CheckboxTest.html");
		
	    WebElement checkBox = driver.findElement(By.id("lettuceCheckbox"));
	    checkBox.click();
	    checkBox.click();
	    
	  
	    }
		
		
//		WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
//		
//		checkbox.click();
//		checkbox.click();

	}


