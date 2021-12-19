package com.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_Element {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			
	WebElement Email = driver.findElement(By.id("email"));
	Email.sendKeys("AjithKumar");
	
	WebElement Pass = driver.findElement(By.id("pass"));
	Pass.sendKeys("123456");
	Thread.sleep(5000);
	
	WebElement Login = driver.findElement(By.name("login"));
	Login.click();
	Thread.sleep(5000);
	driver.navigate().back();
	
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.name("firstname")).sendKeys("AjithKumar");
	driver.findElement(By.name("lastname")).sendKeys("thala");
	driver.findElement(By.xpath("(//input[@type='text' and @class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("0000000000");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123658");
	WebElement Date = driver.findElement(By.id("day"));
	Select s = new Select(Date);
	s.selectByIndex(18);
	WebElement Month = driver.findElement(By.id("month"));
	Select s1 = new Select(Month);
	s1.selectByValue("4");
	WebElement Year = driver.findElement(By.id("year"));
	Select s2 = new Select(Year);
	s2.selectByVisibleText("2009");
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(5000);
	driver.quit();
	}

}
