package com.Web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screesn_Shot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAFMHR6alu3h3dKRGVXQjRiL_YZVik4Ou7V4BnMRqumOrVzaYlxJeH_QGdENng1iU9bceWk8M0-fgLsDUlWHcETZXkJXJVmIGA4up9_kJtNBp9dg-xl4aGsqNIwTk7qABjxQYiyeGlEPlqDGI8x_f5DmNkIe6I8rvDBhYugXpbPrM");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Screen Shots\\First.png");
		FileUtils.copyFile(Source, Destination);
		
	}

}
