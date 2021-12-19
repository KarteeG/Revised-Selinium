package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_Actions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).build().perform();
		driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement frome = driver.findElement(By.id("draggable"));
		WebElement toe = driver.findElement(By.id("droppable"));
		a.clickAndHold(frome).build().perform();
		a.moveToElement(toe).build().perform();
		a.release(toe).build().perform();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement cont = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		a.contextClick(cont).build().perform();
		driver.quit();
		
	}

}
