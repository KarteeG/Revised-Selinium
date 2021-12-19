package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_JSE {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//sendKeys
		js.executeScript("document.getElementById('email').value='JassonHuggins'");
		js.executeScript("document.getElementById('pass').value='test@123'");
		
		WebElement login = driver.findElement(By.xpath("//button[@value]"));
		js.executeScript("arguments[0].click();", login);
	}

}
