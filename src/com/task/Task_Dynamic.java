package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Dynamic {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		
		List<WebElement> all = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (int i = 0; i <all.size() ; i++) {
			String s = all.get(i).getText().replace("Rs. ", "");
			int p = Integer.parseInt(s);
			a.add(p);
		}
		int size = a.size();
		System.out.println("No Of Products:  "+size);
		Integer min = Collections.min(a);
		System.out.println("Minimum Value:   "+ min);
		Integer max = Collections.max(a);
		System.out.println("Maximum Value:  "+ max);
	}

}
