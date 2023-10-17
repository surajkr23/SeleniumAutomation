package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("search-alias=furniture");
		Thread.sleep(3000);
		s.selectByVisibleText("Home & Kitchen");
		Thread.sleep(3000);
		
		
		List<WebElement> allOptions = s.getOptions();
		for(WebElement a:allOptions)
		{
			System.out.println(a.getText());
		}
		driver.close();
	}

}
