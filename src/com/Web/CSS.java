package com.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("karteeng");
		driver.findElement(By.cssSelector("input#password")).sendKeys("13990T");
		driver.findElement(By.cssSelector("input.login_button")).click();
		Thread.sleep(5000);
		WebElement Location = driver.findElement(By.cssSelector("select.search_combobox"));
		Select s = new Select(Location);
		s.selectByIndex(5);
		WebElement Hotels = driver.findElement(By.cssSelector("select[name='hotels']"));
		Select s1 = new Select(Hotels);
		s1.selectByValue("Hotel Sunshine");
		WebElement Room = driver.findElement(By.cssSelector("[name='room_type']"));
		Select s2 = new Select(Room);
		s2.selectByVisibleText("Double");
		WebElement Nor = driver.findElement(By.cssSelector("[id^='room_nos']"));
		Select s3 = new Select(Nor);
		s3.selectByIndex(2);
		driver.findElement(By.cssSelector("[name$='datepick_in']")).sendKeys("11/11/2021");
		driver.findElement(By.cssSelector("[name*='datepick_out']")).sendKeys("12/11/2021");
		WebElement Adults = driver.findElement(By.cssSelector("select[name*='adult_room']"));
		Select s4 = new Select(Adults);
		s4.selectByIndex(3);
		WebElement Childs = driver.findElement(By.cssSelector("Select[name='child_room'][id='child_room']"));
		Select s5 = new Select(Childs);
		s5.selectByIndex(2);
		driver.findElement(By.cssSelector("input.reg_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#radiobutton_0")).click();
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[name*='first_name']")).sendKeys("AjithKumar");
		driver.findElement(By.cssSelector("[name$='last_name']")).sendKeys("Thala");
		driver.findElement(By.cssSelector("textarea.txtarea")).sendKeys("ADDRESS");
		driver.findElement(By.cssSelector("input[name='cc_num'][id='cc_num']")).sendKeys("1234560078945687");
		WebElement Card_Type = driver.findElement(By.cssSelector("select#cc_type"));
		Select s6 = new Select(Card_Type);
		s6.selectByIndex(2);
		WebElement Month = driver.findElement(By.cssSelector("select.select_combobox2"));
		Select s7 = new Select(Month);
		s7.selectByValue("12");
		WebElement Year = driver.findElement(By.cssSelector("select#cc_exp_year"));
		Select s8 = new  Select(Year);
		s8.selectByValue("2022");
		driver.findElement(By.cssSelector("input[name='cc_cvv']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[type='button']")).click();
		driver.findElement(By.cssSelector("body > table.content > tbody > tr:nth-child(1) > td:nth-child(2) > a:nth-child(5)")).click();
		driver.quit();
	}

}
