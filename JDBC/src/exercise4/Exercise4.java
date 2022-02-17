package exercise4;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

//Write a JAVA program to get  connection object using hostname , user,password stored in external properties file. 

public class Exercise4 {
	
public static void main(String args[]) throws IOException {
		
		Properties p = new Properties();
		
		InputStream is = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\javatutorial\\JDBC\\data.properties");
		p.load(is);
		
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(p.getProperty("URL"), p.getProperty("username"), p.getProperty("Password"));
		    
			if(conn != null)
				System.out.println("Connected");
			
			conn.close();
		 } catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}

}
