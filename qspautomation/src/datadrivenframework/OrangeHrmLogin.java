package datadrivenframework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Flib fl = new Flib();
		  String username = fl.readdata("data/TestDataOrg.xlsx", "validcreds", 1, 0);
		  String password = fl.readdata("data/TestDataOrg.xlsx", "validcreds", 1, 1);
		 
		
		    driver.findElement(By.id("txtUsername")).sendKeys(username);
		    Thread.sleep(4000);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();

	}

}
