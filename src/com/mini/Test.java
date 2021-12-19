package com.mini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement women = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
		a.click(women).build().perform();

		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(5000);

		WebElement adc = driver.findElement(By.xpath("(//span[text()='Add to cart'])[4]"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", adc);
		//adc.click();
		js.executeScript("arguments[0].click();", adc);
		Thread.sleep(5000);
		
		// a.click(adc).build().perform();

		WebElement adc1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		a.click(adc1).build().perform();

	}
}