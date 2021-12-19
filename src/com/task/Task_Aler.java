package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Aler {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement Simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Simple.click();
		
		driver.switchTo().alert().accept();
		
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		
		WebElement confirm_Button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirm_Button.click();
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
		
		WebElement prompt_Butt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prompt_Butt.click();
		
		driver.switchTo().alert().sendKeys("KARTHICK");
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
	}

}
