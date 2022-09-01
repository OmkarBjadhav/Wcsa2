package pageObjectModel;

import java.io.IOException;

public class TestOrgHrmValidLogin extends BaseTest {

	
	public static void main(String[] args) throws IOException 
{
		BaseTest bt = new BaseTest();
	    bt.openBrowser();
	    LoginPageOrg lp = new LoginPageOrg(driver);
	    Flib flib = new Flib();
	    lp.validLoginOrgHrm(flib.readPropertFile(PROP_PATH, "usename"),flib.readPropertFile(PROP_PATH, "password"));
}
}
