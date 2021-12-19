package com.Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Waittt {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.findElement(By.id("email")).sendKeys("Ajith");
	driver.findElement(By.id("pass")).sendKeys("test@123");
	driver.findElement(By.name("login")).click();
	Wait wait = new FluentWait(driver)
			.withTimeout(30,TimeUnit.SECONDS)
			.pollingEvery(5,TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	driver.findElement(By.name("firstname")).sendKeys("Karthick");
	driver.findElement(By.name("lastname")).sendKeys("N.G.");
}
}
