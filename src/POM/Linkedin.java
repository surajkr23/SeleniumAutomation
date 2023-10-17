package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Linkedin {
	@FindBy(id="session_key")
	private WebElement emailtb;
	
	@FindBy(id="session_password")
	private WebElement passwordtb;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signinbtn;
	
	public Linkedin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void emailTextBox(String email)
	{
		emailtb.sendKeys(email);
	}
	
	public void passwordTextBox(String password)
	{
		passwordtb.sendKeys(password);
	}
	
	public void signInBtn()
	{
		signinbtn.click();
	}
}
