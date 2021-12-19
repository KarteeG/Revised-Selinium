package com.Web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> All = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement AllData : All) {
			System.out.println(AllData.getText());
		}
		System.out.println("---------------------------------------------------------------");
		List<WebElement> Row = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for (WebElement RowData : Row) {
			System.out.println(RowData.getText());
		}
		System.out.println("---------------------------------------------------------------");
		List<WebElement> Col = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement colData : Col) {
			System.out.println(colData.getText());
		}
		System.out.println("---------------------------------------------------------------");
		WebElement Particuar = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]"));
		System.out.println(Particuar.getText());
		System.out.println("---------------------------------------------------------------");
		WebElement Spe = driver.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td"));
		System.out.println(Spe.getText());
		System.out.println("---------------------------------------------------------------");

		List<WebElement> Header = driver.findElements(By.tagName("th"));
		int size = Header.size();
		System.out.println("Headersize="+size);
		System.out.println("---------------------------------------------------------------");
		List<WebElement> Rows = driver.findElements(By.tagName("tr"));
		int size2 = Rows.size();
		System.out.println("Rowsize="+size2);
		System.out.println("---------------------------------------------------------------");
		List<WebElement> CS = driver.findElements(By.tagName("td"));
		int size3 = CS.size();
		System.out.println("Coloumnsize="+size3);
		System.out.println("---------------------------------------------------------------");
		List<WebElement> Minimum = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		List<Integer> n = new ArrayList<Integer>();
		for (WebElement Mini : Minimum) {
			String s = Mini.getText().replace("%", "");
			n.add(Integer.parseInt(s));
		}
		System.out.println("List"+n);
		Integer min = Collections.min(n);
		System.out.println("Minium="+min);
}
}


