package autoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		ele.sendKeys("dres");
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[contains(text(),'Dresses')]"));
		System.out.println("size="+ele1.size());
		for(WebElement a:ele1)
		{
			System.out.println(a.getText());
		}
		driver.close();
	}

}
