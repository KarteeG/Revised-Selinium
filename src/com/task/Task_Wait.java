package com.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement create_Account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create_Account.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement fname1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		fname1.sendKeys("Harsh Ajith");

		driver.navigate().to("https://www.facebook.com/");
		WebElement create_Accoun = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create_Accoun.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement fn = wait1.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
		fn.sendKeys("Ajith");

		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

	}

}
