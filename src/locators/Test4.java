package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://accounts.google.com/");
driver.findElement(By.id("identifierId")).sendKeys("surajkr2311");
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.name("password")).sendKeys("*****");
driver.findElement(By.xpath("//span[text()='Next']")).click();
String title = driver.getTitle();
System.out.println(title);
String url = driver.getCurrentUrl();
System.out.println(url);

driver.close();
	}

}
//we cannot automate gmail because it is secure
