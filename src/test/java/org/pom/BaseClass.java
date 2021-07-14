package org.pom;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static  Select s;
	public static WebDriver driver;
	public static  void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
		

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static  String getUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
   
    public static  void insert(WebElement e , String value) {
    	e.sendKeys(value);
    	
	}
 public static  void click(WebElement e) {
	 e.click();
 
 }
 
 public static void closeBrowser() {
	driver.close();

}
 public static void dropDown(WebElement e, int num) {
	  s= new Select(e);
	 s.selectByIndex(num);
	
}
 public static void dropDown(WebElement e, String value) {
	  s= new Select(e);
	 s.selectByVisibleText(value);
	
}
 
 public static  void exetime() {
	Date d=new Date();
	System.out.println(d);

}
 public static void waits() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
 public static  String togetattribute(WebElement e) {
	 String value = e.getAttribute("value");
	 return value;
	

}
 
 
 
 

}
