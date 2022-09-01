package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//1
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium%20HTML%20Doc/checkbox.html");
		String sourceCodehtml= driver.getPageSource();//3
		System.out.println(sourceCodehtml);//4
	}

}