package com.Web;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Page {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://mail.yahoo.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		
	}

}
