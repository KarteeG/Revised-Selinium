package com.mini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSS_Absolute {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions a = new Actions(driver);

		WebElement mo = driver.findElement(By.xpath(
				"//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7']"));
		a.click(mo).build().perform();

		driver.navigate().to("https://www.facebook.com/");
		// Locate By Id
		driver.findElement(By.cssSelector("input#email")).sendKeys("test");
		// Match With Suffixw
		driver.findElement(By.cssSelector("[id$='pass']")).sendKeys("test@123");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("ac");
		// Match with Prefix
		driver.findElement(By.cssSelector("[name^='lastname']")).sendKeys("123");
		// Match With contains or substring
		driver.findElement(By.cssSelector("input[name*='reg_email__']")).sendKeys("0000000000");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123");
		// locate By name or any attribute
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}
}
