package com.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement cl = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		js.executeScript("arguments[0].click();", cl);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(5000);
		js.executeScript("window.scroll(0,0)");
		Thread.sleep(5000);

		// WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
		// js.executeScript("arguments[0].click();", Login);
		// Thread.sleep(5000);

		js.executeScript("history.go(0)");
		Thread.sleep(5000);

		js.executeScript("alert('Welcome')");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

		js.executeScript("confirm('Are you Sure')");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

		js.executeScript("prompt('Eneter your Name')");
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Karthick");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);

//		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
//		facebook.click();
//		Thread.sleep(5000);
//		js.executeScript("arguments[0].scrollIntoView();", facebook);
//		Thread.sleep(10000);
//		driver.navigate().back();
//		Thread.sleep(10000);

		js.executeScript("window:location='https://www.google.co.in/'");
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		js.executeScript("arguments[0].click()", gmail);

		WebElement ca = driver.findElement(By.xpath("(//span[@class='laptop-desktop-only'])[2]"));
		js.executeScript("arguments[0].click()", ca);
		Thread.sleep(5000);

		WebElement fname = driver.findElement(By.name("firstName"));
		js.executeScript("arguments[0].value='Karthick'", fname);

		WebElement check = driver.findElement(By.id("i3"));
		js.executeScript("arguments[0].checked=true", check);
		Thread.sleep(5000);

		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(5000);

		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		facebook.click();
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", facebook);

	}

}
