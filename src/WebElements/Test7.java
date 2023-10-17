package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbtn = driver.findElement(By.id("gh-btn"));
		
		if(searchbtn.isEnabled())
		{
			System.out.println("pass:element is enabled");
		}
		else
		{
			System.out.println("fail:element is not enabled");
		}
		driver.close();
	}

}
