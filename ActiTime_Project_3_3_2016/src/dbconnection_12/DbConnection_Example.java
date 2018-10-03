package dbconnection_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DbConnection_Example {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub

		
				

		// Constant for Database URL
		String DB_URL = "jdbc:mysql://localhost:3306/selenium";

		// Constant for Database Username
		String DB_USER = "root";

		// Constant for Database Password
		String DB_PASSWORD = "root";

		// Make the database connection
		String dbClass = "com.mysql.jdbc.Driver";
			
				try {
					Class.forName(dbClass).newInstance();
				} catch (InstantiationException | IllegalAccessException
						| ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		// Get connection to DB
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);		
		
		// Statement object to send the SQL statement to the Database
		Statement stmt = conn.createStatement();

		WebDriver d = new FirefoxDriver();
		d.get("http://localhost:89/login.do");
		Thread.sleep(5000);
		
		
		
		try {

			String query = "select * from persons";

			// Get the contents of userinfo table from DB
			ResultSet res = stmt.executeQuery(query);

			// Print the result untill all the records are printed
			// res.next() returns true if there is any next record else returns
			// false

			while (res.next())
			{
				
//				String id = res.getString("PersonID");
//				String ln = res.getString("LastName");
//				String fn = res.getString("FirstName");
//				String add = res.getString("Address");
//				String city = res.getString("City");
//				
//				System.out.println("ID : "+id);
//				System.out.println("ln : "+ln);
//				System.out.println("fn : "+fn);
//				System.out.println("add : "+add);
//				System.out.println("city : "+city);


				// with index
//				System.out.print(res.getString(1));
//				System.out.print("\t" + res.getString(2));
//				System.out.print("\t" + res.getString(3));
//				System.out.println("\t" + res.getString(4));
//				
				Thread.sleep(5000);
				System.out.println("========" + res.getString(1) + "========" );
				String username_PWD = res.getString(2);
				
				d.findElement(By.id("username")).sendKeys(username_PWD);
				d.findElement(By.name("pwd")).sendKeys(res.getString(2));
				d.findElement(By.id("loginButton")).click();

				// code for verification
//				
//				
//				System.out.println("First Name : " + res.getString(3));
//				System.out.println("Address : " + res.getString(4));
//				System.out.println("City : " + res.getString(5));
//				
//				
//				
				Thread.sleep(5000);
				d.findElement(By.linkText("Logout")).click();
			}
			System.out.println("========= Completed==========");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
