package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ddsgsdg");
		driver.findElement(By.name("pass")).sendKeys("dcygsdcfgs");
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.id("identify_email")).sendKeys("8240946825");
		driver.findElement(By.cssSelector("button[type='submit']")).submit();
		Thread.sleep(9000);
		driver.close();
	}

}
