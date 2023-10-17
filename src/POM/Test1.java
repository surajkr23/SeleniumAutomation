package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Amazon a=new Amazon(driver);
	driver.navigate().refresh();
	a.signinPage();
	a.emailaddress("8240946825");
	a.Continue();
	a.password("sjkr2311@");
	a.signin();
	}

}
