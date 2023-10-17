package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");

WebElement ref = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
ref.sendKeys("dres");

Thread.sleep(3000);
List<WebElement> ref1 = driver.findElements(By.xpath("//li[contains(text(),'Dresses')]"));
System.out.println(ref1.size());

for(WebElement a:ref1) {
	System.out.println(a.getText());
}
driver.close();
	}

}
