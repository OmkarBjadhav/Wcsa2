package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;



public class TestInValidOrgHrm  extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();//open the browser 

		//start reading invalid data
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestDataOrg.xlsx","invalidcreds");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/TestDataOrg.xlsx","invalidcreds",i,0);

			String password = flib.readExcelData("./data/TestDataOrg.xlsx","invalidcreds",i,1);

			System.out.println(i);
			driver.findElement(By.name("txtUsername")).sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);

			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("txtUsername")).clear();
		}
		
		//close all the browsers
		bt.closeBrowser();


	}

}