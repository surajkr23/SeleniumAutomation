package dataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;



public class Test2 {

	public static void main(String[] args) throws SQLException {
		Driver driverrf=new Driver();
		DriverManager.registerDriver(driverrf);
		
		//step2: connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvSel","root","root");
		
		//step3: create sql query statement
		Statement statement = con.createStatement();
		String query="select * from logindetails;";
		
		//step4: execute query
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ResultSet result = statement.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));

		}
	}

}
