package com.Web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web_Hand {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		
		Actions a =new Actions(driver);
		WebElement Mobiles = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		a.contextClick(Mobiles).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Best = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		a.contextClick(Best).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Elec = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
		a.contextClick(Elec).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Fashion = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		a.contextClick(Fashion).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		int size = driver.getWindowHandles().size();
		System.out.println("Size="+size);
		
		String Parent = driver.getWindowHandle();
		System.out.println("Parentid"+Parent);
		
		Set<String> all = driver.getWindowHandles();
		for (String s : all) {
			String title = driver.switchTo().window(s).getTitle();
			System.out.println("Titles="  +title);
			
		}
		Thread.sleep(5000);
		String s1 = "Amazon.in Bestsellers: The most popular items on Amazon";
		Set<String> All = driver.getWindowHandles();
		for (String A : All) {
			if (driver.switchTo().window(A).getTitle().equalsIgnoreCase(s1)) {
				break;
			}
		}
		Thread.sleep(5000);
		for (String A1 : All) {
			if (!A1.equals(Parent)) {
				driver.switchTo().window(A1);
				driver.close();
			}
		}
		Thread.sleep(5000);
		driver.quit();
			
		}
		
		
		}
