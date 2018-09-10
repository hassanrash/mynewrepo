//package com.pluralsight;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WebDriverTables {
//
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "/users/hassanrash/Documents/Tools/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("file:///Users/hassanrash/Downloads/automated-web-testing-selenium-webdriver-java%20(2)/07/demos/m6/before/src/main/webapp/TableTest.html");
//		
//		WebElement outerTable = driver.findElement(By.xpath("//td[contains(text(), 'Table 2 Row 2')]"));
//		outerTable.click();
//		WebElement innerTable = outerTable.findElement(By.tagName("table"));
//		WebElement row = innerTable.findElements(By.tagName("td")).get(1);
//		System.out.println(outerTable.getText()); 
		
		//WebElement outerTable = driver.findElement(By.tagName("table"));
		//WebElement innerTable = outerTable.findElement(By.tagName("table"));
		//WebElement row = innerTable.findElements(By.tagName("td")).get(1);
//		System.out.println(row.getText());
//		WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
//		System.out.println(row.getText());

//	}
//
//}
