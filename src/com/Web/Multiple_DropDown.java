package com.Web;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement one = driver.findElement(By.id("dropdown1"));
		Select s = new Select(one);
		s.selectByIndex(1);
		
		//WebElement Two = driver.findElement(By.id("dropdown2"));
		//Select s1 = new Select(Two);
		//s1.selectByVisibleText("Loadrunner");
		
		WebElement Three = driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(Three);
		s2.selectByValue("3");
		
		WebElement Four = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s3 = new Select(Four);
		List<WebElement> options = s3.getOptions();
		int size = options.size();
		System.out.println(size);
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Appium");
		
		WebElement Multi = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select s4 = new Select(Multi);
		boolean multiple = s4.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options2 = s4.getOptions();
		for (WebElement webElement : options2) {
			String text = webElement.getText();
			System.out.println(text);
		}
		int size2 = options2.size();
		System.out.println(size2);
		
		for (int i = 0; i < size2; i++) {
			if (i==1 || i==2 || i==3) {
				s4.selectByIndex(i);
			}
		
		}
		s4.deselectAll();
		s4.selectByIndex(1);
		s4.selectByIndex(2);
		s4.selectByIndex(3);
		
		List<WebElement> allSelectedOptions = s4.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		WebElement firstSelectedOption = s4.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		s4.deselectByIndex(1);
		s4.deselectByValue("2");
		s4.deselectByVisibleText("Loadrunner");
		s4.deselectAll();
	}

}
