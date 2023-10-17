package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 {

	public static void main(String[] args) {
	//	ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--remote-allow-origins=*");
		//WebDriver driver=new ChromeDriver(opt);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Linkedin l1=new Linkedin(driver);
		driver.navigate().refresh();
		l1.emailTextBox("grsgsgrstr");
		l1.passwordTextBox("fvvr24");
		l1.signInBtn();
		driver.close();

	}

}
