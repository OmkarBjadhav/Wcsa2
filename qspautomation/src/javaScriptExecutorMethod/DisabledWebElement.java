package javaScriptExecutorMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebElement {
	public static void main(String[] args) {System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/Selenium%20HTML%20Doc/disabledelement.html");
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("document.getElementById('i2').value='admin'\r\n" );

	
		
	}

}
