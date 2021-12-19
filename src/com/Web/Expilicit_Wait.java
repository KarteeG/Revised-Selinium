package com.Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expilicit_Wait {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("Ajith");
		driver.findElement(By.id("pass")).sendKeys("test@123");
		driver.findElement(By.name("login")).click();
		driver.navigate().back();
		driver.navigate().back();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@role='button'])[2]")));
		button.click();
		//driver.findElement(By.name("firstname")).sendKeys("Karthick");
		WebElement fname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		fname.sendKeys("Karthick");
		driver.findElement(By.name("lastname")).sendKeys("N.G.");

		
	}

}
