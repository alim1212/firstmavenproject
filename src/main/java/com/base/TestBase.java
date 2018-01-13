package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import  com.util.TestUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.devtrcko.TrackoProducts;

//import com.util.TestUtil;

public class TestBase {
	
	
	public static WebDriver driver;
	
	public static Properties Prop;
	
	
	public TestBase()
	{
		Prop= new Properties();
		try {
			FileInputStream fip= new FileInputStream("Resource/config.properties");
			Prop.load(fip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		initialization("chrome");
		
	}
	
	public static void initialization(String Browser)
	{
		
		String Url=Prop.getProperty("Url");
		String Uname=Prop.getProperty("MblNo");
		String Password=Prop.getProperty("Password");
		System.out.println(Url);
		switch (Browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://dev.tracko.co.in/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implicityWait, TimeUnit.SECONDS);
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","E:/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implicityWait, TimeUnit.SECONDS);
			break;
			
		case "ie":
		
		}
		
	}
	
	
	

}
