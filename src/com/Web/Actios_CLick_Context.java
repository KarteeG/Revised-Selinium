package com.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actios_CLick_Context {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement Click = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a =new Actions(driver);
		
		a.click(Click).build().perform();
		
		WebElement con = driver.findElement(By.xpath("/html/body/header/div/div/div/a[1]"));
		a.contextClick(con).build().perform();
		
		
	}

}
