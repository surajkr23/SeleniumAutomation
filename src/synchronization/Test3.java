package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement text = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		System.out.println(text);
		String title = driver.getTitle();
		System.out.println(title);
	/*	driver.findElement(By.id("email")).sendKeys("udgujd");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jdfhd");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();*/
		Thread.sleep(5000);
		driver.close();

	}

}
