package com.Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@href])[7]")).click();
		WebElement java = driver.findElement(By.xpath("//html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h2"));
		// java.click();
		String text = java.getText();
		System.out.println(text);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//html/body/div/div/div[5]/div[2]/a[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//html/body/div/div/div[3]/div/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//html/body/div/div/div[5]/div[2]/a[10]")).click();
		
		
	}

}
