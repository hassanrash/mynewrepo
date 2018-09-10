//package com.pluralsight;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//
//
//public class DragAndDrop {
//	
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "/users/hassanrash/Documents/Tools/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://jqueryui.com/droppable/");
//		WebElement click =driver.findElement(By.cssSelector(".demo-frame"));
//	    WebElement drag = driver.findElement(By.xpath("//div[@id=‘draggable’] "));
//	    WebElement drop = driver.findElement(By.xpath("//div[@id ='droppable']"));
//	    
//	    Actions action = new Actions(driver);
//	    action.dragAndDrop(drag, drop).perform();		
//	    String actualText=driver.findElement(By.id("droppable")).getText();
//		Assert.assertEquals(actualText, "Dropped!");
		
//
//		System.setProperty("webdriver.chrome.driver", "/users/hassanrash/Documents/Tools/chromedriver");
//			WebDriver driver = new ChromeDriver();
//			driver.get("http://jqueryui.com/droppable/");
//			
//			WebElement drag = driver.findElement(By.id("draggable"));
//			
//	WebDriverWait wait  = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
	
//	WebElement drag= driver.findElement(By.id("draggable"));
//	WebElement drop = driver.findElement(By.id("droppable"));
//	
	
//	
//	public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
//		try {
//			if (sourceElement.isDisplayed() && destinationElement.isDisplayed()) {
//				Actions action = new Actions(driver);
//				action.dragAndDrop(sourceElement, destinationElement).build().perform();
//			} else {
//				System.out.println("Element was not displayed to drag");
//			}
//		} catch (StaleElementReferenceException e) {
//			System.out.println("Element with " + sourceElement + "or" + destinationElement + "is not attached to the page document "
//					+ e.getStackTrace());
//		} catch (NoSuchElementException e) {
//			System.out.println("Element " + sourceElement + "or" + destinationElement + " was not found in DOM "+ e.getStackTrace());
//		} catch (Exception e) {
//			System.out.println("Error occurred while performing drag and drop operation "+ e.getStackTrace());
//		}
	
	
//	System.setProperty("webdriver.chrome.driver", "/users/hassanrash/Documents/Tools/chromedriver");
//	WebDriver driver = new ChromeDriver();
//	driver.get("file:///Users/hassanrash/Downloads/automated-web-testing-selenium-webdriver-java%20(2)/07/demos/m6/before/src/main/webapp/TableTest.html");
//	
//	WebDriverWait wait  = new WebDriverWait(driver, 10);
//	wait
	

//}
//}
