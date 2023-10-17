package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon {
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement signinpage;
	
	@FindBy(id="ap_email")
	private WebElement emailtb;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(id="ap_password")
	private WebElement passwordtb;
	
	@FindBy(id="signInSubmit")
	private WebElement signinbtn;
	
	public Amazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signinPage() {
		signinpage.click();
	}
	
	public void emailaddress(String emailid) {
		emailtb.sendKeys(emailid);
	}
	
	public void Continue() {
		continuebtn.click();
	}
	
	public void password(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void signin() {
		signinbtn.click();
	}
}
