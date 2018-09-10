//package com.pluralsight;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//public class WebDriverDemo {
//
//	public static void main(String[] args) throws Exception {
//		
//		System.setProperty("webdriver.chrome.driver", "/users/hassanrash/Documents/Tools/chromedriver");
//		WebDriver driver = (WebDriver) new InternetExplorerDriver();
//		driver.get("http://www.google.com");
//		
//		WebElement searchField = driver.findElement(By.name("q"));
//		searchField.sendKeys("pluralsight");
//		searchField.submit();
//		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
//		WebDriverwait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
		
//		WebElement imagesLink = driver.findElements(By.linkText("Imags")).get(0);
//		imagesLink.click();
//		
//		WebElement imageElement = driver.findElements(By.cssSelector("a[class = rg_l]")).get(0);
//		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
//		imageLink.click();
//	}
//}
