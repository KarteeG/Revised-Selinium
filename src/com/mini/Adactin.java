package com.mini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("karteeng");
		driver.findElement(By.id("password")).sendKeys("13990T");
		driver.findElement(By.id("login")).click();

		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("Brisbane");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Cornice");
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByValue("Super Deluxe");
		WebElement nor = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(nor);
		s3.selectByValue("3");
		WebElement cid = driver.findElement(By.id("datepick_in"));
		cid.sendKeys("27/11/2021");
		WebElement cod = driver.findElement(By.id("datepick_out"));
		cod.sendKeys("28/11/2021");
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s6 = new Select(adults);
		s6.selectByValue("4");
		WebElement cpr = driver.findElement(By.id("child_room"));
		Select s7 = new Select(cpr);
		s7.selectByValue("4");
		driver.findElement(By.id("Submit")).click();

		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.name("first_name")).sendKeys("Karthick");
		driver.findElement(By.name("last_name")).sendKeys("N G");
		driver.findElement(By.name("address")).sendKeys("DGL");
		driver.findElement(By.id("cc_num")).sendKeys("00004597545557546");
		WebElement ctype = driver.findElement(By.id("cc_type"));
		Select s8 = new Select(ctype);
		s8.selectByValue("MAST");
		WebElement date = driver.findElement(By.id("cc_exp_month"));
		Select s9 = new Select(date);
		s9.selectByValue("12");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s10 = new Select(year);
		s10.selectByValue("2022");
		driver.findElement(By.name("cc_cvv")).sendKeys("000");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);

		driver.findElement(By.id("my_itinerary")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logout")).click();

	}
}
