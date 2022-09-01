package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestValidOrgHrm extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	Flib flib = new Flib();
	String username = flib.readPropertFile("./data/config.properties","username");
	String password = flib.readPropertFile("./data/config.properties","password");
	
	
	driver.findElement(By.id("txtUsername")).sendKeys(username);
    Thread.sleep(4000);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	bt.closeBrowser();
	
}
}
