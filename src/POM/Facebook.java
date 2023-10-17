package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook 
{
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(name="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private  WebElement loginbtn;
	
	public Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void usernameTextBox(String username)
	{
		usernametb.sendKeys(username);
	}
	public void passwordTextBox(String password) {
		passwordtb.sendKeys(password);
	}
	public void loginButton() {
		loginbtn.click();
	}
}
