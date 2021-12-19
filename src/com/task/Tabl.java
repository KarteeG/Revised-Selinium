package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabl {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> Small = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		List<Integer> l=new ArrayList<Integer>();
		for (WebElement All : Small) {
			String s = All.getText().replace("%", "");
			l.add(Integer.parseInt(s));
		}
		System.out.println(l);
		Integer max = Collections.max(l);
		System.out.println(max);
			
	}

}
