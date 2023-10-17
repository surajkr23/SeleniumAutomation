package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("(//img[contains(@alt,'Samsung')])[1]"));
		Point loc = ele.getLocation();
		int x= loc.getX();
		int y= loc.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/amazon.png");
		FileUtils.copyFile(ram, dest);
		driver.close();
	}

}
