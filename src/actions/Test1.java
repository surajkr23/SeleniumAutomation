package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		WebElement ele = driver.findElement(By.id("identify_email"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).click();
		a.sendKeys("4545");
		a.build();
		a.perform();
		driver.findElement(By.id("did_submit")).click(); 
		driver.close();
	}

}
