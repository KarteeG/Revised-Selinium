package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement Single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(Single);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Karthick");
		
		driver.switchTo().defaultContent();
		
		WebElement button = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		button.click();
		
		WebElement Multi = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Multi);
		
		WebElement single = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(single);
		
		WebElement text_B = driver.findElement(By.xpath("//input[@type='text']"));
		text_B.sendKeys("Karthick");
		
		driver.switchTo().defaultContent();
		
	}
	

}
