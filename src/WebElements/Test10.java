package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("email"));
		Dimension size = ele.getSize();
		System.out.println("height= "+size.getHeight());
		System.out.println("width= "+size.getWidth());
		System.out.println("type="+ele.getAttribute("type"));
		System.out.println("id="+ele.getAttribute("id"));
		System.out.println("name="+ele.getAttribute("name"));
		if(ele.isDisplayed())
		{
			System.out.println("pass: element is displayed");
		}
		else
		{
			System.out.println("fail: element is not displayed");
		}
		if(ele.isEnabled())
		{
			System.out.println("pass: element is Enabled");
		}
		else
		{
			System.out.println("fail: element is not Enabled");
		}
		driver.close();

	}

}
