package doubleclick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("course")).click();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		WebElement plusbtn = driver.findElement(By.id("add"));
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		a.doubleClick(plusbtn).perform();
	}

}
