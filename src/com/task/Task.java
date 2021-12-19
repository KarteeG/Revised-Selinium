package com.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement create_Acc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create_Acc.click();

		Thread.sleep(5000);

		WebElement first_Name = driver.findElement(By.name("firstname"));
		first_Name.sendKeys("Harsh");

		WebElement last_Name = driver.findElement(By.name("lastname"));
		last_Name.sendKeys("Ajith");

		WebElement Mo = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		Mo.sendKeys("0987654321");

		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("text@@100");

		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(10);

		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("8");

		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByValue("2000");

		WebElement Gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Gender.click();

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();

		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Screen Shots\\screen1.png");
		FileUtils.copyFile(Source, Destination);

	}

}
