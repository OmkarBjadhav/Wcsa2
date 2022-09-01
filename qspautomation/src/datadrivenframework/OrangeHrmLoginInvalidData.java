package datadrivenframework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginInvalidData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 Flib fis = new Flib();
		 int rc = fis.getrowcount("data/TestDataOrg.xlsx", "invalidcreds");
		 for(int i=1;i<=rc;i++)
		 {
			 String username = fis.readdata("data/TestDataOrg.xlsx","invalidcreds", i,0);
				String password = fis.readdata("data/TestDataOrg.xlsx","invalidcreds", i,1);
		 
		   System.out.println(i);
		    driver.findElement(By.name("txtUsername")).sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);

			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(4000);
		 }	driver.findElement(By.name("txtUsername")).clear();
	}

}
