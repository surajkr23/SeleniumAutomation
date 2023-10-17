package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement ele = driver.findElement(By.id("email"));
		Point loc = ele.getLocation();
		System.out.println(loc.getX()+" x-axis coordinates");
		System.out.println(loc.getY()+" y-axis coordinates");
		driver.close();
	}

}
