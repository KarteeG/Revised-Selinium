package com.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.linkText("New User Register Here")).click();
		driver.findElement(By.linkText("Go back to Login page")).click();

		driver.findElement(By.partialLinkText("Forgot Password?")).click();
		driver.findElement(By.partialLinkText("Go back to Login page")).click();

		driver.findElement(By.cssSelector("input#username")).sendKeys("karteeng");
		driver.findElement(By.cssSelector("input#password")).sendKeys("13990T");
		driver.findElement(By.cssSelector("input.login_button")).click();

		WebElement location = driver.findElement(By.cssSelector("select#location"));
		Select s = new Select(location);
		s.selectByValue("Brisbane");

		WebElement hotels = driver.findElement(By.cssSelector("select[id='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Creek");

		WebElement rt = driver.findElement(By.cssSelector("[id^='room_type']"));
		Select s2 = new Select(rt);
		s2.selectByValue("Double");

		WebElement rn = driver.findElement(By.cssSelector("[id$='room_nos']"));
		Select s3 = new Select(rn);
		s3.selectByValue("2");

		WebElement ci = driver.findElement(By.cssSelector("input[id*='datepick_in']"));
		// s4.selectByVisibleText("29/11/2021");
		ci.sendKeys("29/11/201");
		// s4.selectByValue("29/11/2021");

		WebElement co = driver.findElement(By.cssSelector("input[name='datepick_out'][type='text']"));
		// Select s5=new Select(co);
		// s5.selectByVisibleText("31/11/2021");
		co.sendKeys("30/11/2021");
		// s5.selectByValue("30/11/2021");

		WebElement adults = driver.findElement(By.xpath("//html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/select"));
		Select s4 = new Select(adults);
		s4.selectByValue("4");

		WebElement cpr = driver.findElement(By.xpath("//html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[9]/td[2]/select"));
		Select s5 = new Select(cpr);
		s5.selectByValue("2");

		driver.findElement(By.cssSelector("input.reg_button")).click();
		driver.findElement(By.linkText("Logout")).click();

	}
}