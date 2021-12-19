package com.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_WebHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		Robot r = new Robot();

		WebElement log = driver.findElement(By.xpath("(//button[@class])[2]"));
		a.click(log).build().perform();

		WebElement top_Offers = driver.findElement(By.xpath("//div[text()='Top Offers']"));
		a.contextClick(top_Offers).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement grocery = driver.findElement(By.xpath("//div[text()='Grocery']"));
		a.contextClick(grocery).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		a.contextClick(mobiles).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement travels = driver.findElement(By.xpath("//div[text()='Travel']"));
		a.contextClick(travels).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


		String parent = driver.getWindowHandle();
		System.out.println("Parent ID:" + parent);

		Set<String> all = driver.getWindowHandles();
		for (String s : all) {
			//System.out.println(driver.switchTo().window(s).getTitle());
			String title = driver.switchTo().window(s).getTitle();
			System.out.println("Titles:"+ title);
		}

		int size = all.size();
		System.out.println("Total Windows: " + size);

		String s1 = "Mobile Phones Online at Best Prices in India";
		for (String s : all) {
			if (driver.switchTo().window(s).getTitle().equalsIgnoreCase(s1)) {
				break;
			}
		}

		Thread.sleep(5000);
		for (String s : all) {
			if (!s.equals(parent)) {
				driver.switchTo().window(s);
				driver.close();
			}

		}

	}

}
