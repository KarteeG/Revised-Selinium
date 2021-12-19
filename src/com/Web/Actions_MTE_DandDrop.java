package com.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_MTE_DandDrop {
	public static void main (String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		
		//a.clickAndHold(From).build().perform();
		//Thread.sleep(5000);
		//a.moveToElement(To).build().perform();
		//Thread.sleep(5000);
		//driver.navigate().refresh();
		
		a.dragAndDrop(From, To).build().perform();
		
	}

}
