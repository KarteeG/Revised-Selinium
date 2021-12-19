package com.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		WebElement confirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm.click();
		WebElement con = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		con.click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		
		WebElement Prompt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		Prompt.click();
		WebElement Pro = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		Pro.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Harsh Ajith");
		driver.switchTo().alert().accept();
		
	}

}
