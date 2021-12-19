package com.Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		List<WebElement> Fi = driver.findElements(By.tagName("iframe"));
		int size = Fi.size();
		System.out.println(size);
	
		driver.switchTo().frame(0);
		WebElement Frame = driver.findElement(By.id("Click"));
		Frame.click();
		String text = Frame.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		
	}

}
