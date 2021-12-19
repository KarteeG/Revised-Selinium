package com.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Selinium_Project\\Google Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement Single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(Single);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Harsh Ajith");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		WebElement Multiple = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Multiple);
		
		WebElement Sing = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(Sing);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harsh Ajith");
		driver.switchTo().defaultContent();
	}

}
