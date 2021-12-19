package com.mini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Women']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement printed = driver.findElement(By.xpath("(//a[@class='product-name'])[4]"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView()", printed);
		Thread.sleep(5000);
		printed.click();
		driver.findElement(By.id("quantity_wanted")).sendKeys("5");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		driver.findElement(By.id("email")).sendKeys("kartee.sri@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.name("processAddress")).click();
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		js.executeScript("window.scrollBy(0,500)");
	}
}