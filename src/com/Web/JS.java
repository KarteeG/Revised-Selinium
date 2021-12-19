package com.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement gma = driver.findElement(By.xpath("//a[text()='Gmail']"));
		js.executeScript("arguments[0].click();", gma);
		
		WebElement CA = driver.findElement(By.xpath("//span[text()='Create an account']"));
		js.executeScript("arguments[0].click();", CA);
		
		Thread.sleep(5000);
		js.executeScript("document.getElementById('firstName').value='Thala'");
		js.executeScript("document.getElementById('lastName').setAttribute('value','Ajith');");
		js.executeScript("document.getElementById('i3').checked=true");

}
}