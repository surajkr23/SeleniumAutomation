package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram {
	@FindBy(name="username")
	private WebElement usernametb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(xpath="(//div[contains(@class,'x9f619')])[10]")
	private WebElement signinbtn;
	
	public Instagram(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void usernameTB(String username)
	{
		usernametb.sendKeys("username");
	}
	
	public void passwordTB(String password)
	{
		passwordtb.sendKeys("password");
	}
	
	public void signinButton()
	{
		signinbtn.click();
	}
}
