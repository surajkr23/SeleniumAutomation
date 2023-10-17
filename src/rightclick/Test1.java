package rightclick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele1 = driver.findElement(By.linkText("EN"));
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Actions a=new Actions(driver);
		
		a.moveToElement(ele1).perform();
		Thread.sleep(3000);
		a.contextClick(ele).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
