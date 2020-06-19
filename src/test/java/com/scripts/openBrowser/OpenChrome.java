package com.scripts.openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome 
{
	public WebDriver driver;
	
	@Test
	public void openChrome()
	{
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		
		driver.get("htttps://www.google.com");
	}
}
