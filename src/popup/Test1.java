package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("course")).click();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
	}

}
