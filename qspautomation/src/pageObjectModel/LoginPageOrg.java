package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOrg {
	//declaration
	@FindBy(id="txtUsername")private WebElement username;
	@FindBy(id="txtPassword")private WebElement pwd;
	@FindBy(id="btnLogin")private WebElement loginButton;
	@FindBy(xpath="//a[.='Forgot your password?']")private WebElement orgHrmLink;
    @FindBy(xpath="//span[.='( Username : Admin | Password : admin123 )']")private WebElement loginCreds;
	
   //initilization
    public LoginPageOrg(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	
	}
    
    
    //utilization
    public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getOrgHrmLink() {
		return orgHrmLink;
	}
	public WebElement getLoginCreds() {
		return loginCreds;
	}	
    public void validLoginOrgHrm(String validUsername,String validPwd)
    {
    	username.sendKeys(validUsername);
    	pwd.sendKeys(validPwd);
    	loginButton.click();
	
    }
    public void invalidLoginOrghrm(String inValidUsername,String inValidPwd) throws InterruptedException 
    {
    	username.sendKeys(inValidUsername);
    	pwd.sendKeys(inValidPwd);
    	loginButton.click();
    	Thread.sleep(3000);
    	username.clear();
    }

}
