package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement dropdown= driver.findElement(By.id("month"));
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		s.selectByVisibleText("Jun");
		s.selectByValue("3");
		
		List<WebElement>op = s.getAllSelectedOptions();
		for(WebElement allselectedopt:op) {
			System.out.println(allselectedopt.getText());
		}
		System.out.println(s.isMultiple());
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		ArrayList a=new ArrayList<>();
		
		for(WebElement allopt:options) {
			String texts = allopt.getText();
			a.add(texts);
			System.out.println(texts);
		}
		
		Collections.sort(a);
		System.out.println("After sorting..");
		
		for(Object b:a)
		{
			System.out.println(b);
		}
		driver.close();
		
		
	}

}
