package exercise6;
import java.sql.*;

//Write a Java program to  alter table countries including columns country_id,country_name and region_id  to add a column region_id .

public class Alter {
	
	public static void main(String args[]) {
		
		String dbURL = "jdbc:mysql://localhost/practicedatabase";
		String username = "root";
		String password = "Pranav@123";
		
		try {
			// creating a connection.
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			
			// Writing a alter statement.
			
			String alter = "alter table countries add column region_name varchar(45) not null";
			
			// Creating a statement
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(alter);
			
			System.out.println("new column added sucessfully.");
			
			conn.close();
					
		}
	 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	 catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
