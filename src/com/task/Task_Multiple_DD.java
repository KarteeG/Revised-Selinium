package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Multiple_DD {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement Multi = driver.findElement(By.xpath("//select[@multiple]"));
		Select s= new Select(Multi);
		s.selectByIndex(1);
		s.selectByValue("3");
		s.selectByVisibleText("Loadrunner");
		
		
		List<WebElement> options = s.getOptions();
		System.out.println("GET OPTIONS");
		for (WebElement all : options) {
			String text = all.getText();
			System.out.println(text);
		}
		
		int size = options.size();
		System.out.println("Size: "+size);
		
		
			
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("GET ALL SELECTED OPTIONS");
		for (WebElement all : allSelectedOptions) {
			String text = all.getText();
			System.out.println(text);
		}
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("FIRST SELECTED OPTIONS");
		String t = firstSelectedOption.getText();
		System.out.println(t);
		
		s.deselectByIndex(1);
		s.deselectByValue("2");
		s.deselectByVisibleText("Loadrunner");
		
	}
	
	
}
