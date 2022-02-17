package exercise5;
import java.sql.*;

//Write a Java program to create  a table  countries including columns country_id,country_name and region_id .

public class Table {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		 String dbURL = "jdbc:mysql://localhost/practicedatabase";
		 String username = "root";
		 String password = "Pranav@123";
			
		 try {
				// creating a connection.
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection(dbURL, username, password);
				
				// Creating a table.
				
				String table = "create table countries(country_id int(11) primary key auto_increment, country_name varchar(45) not null, "
						+ "region_id int(11) not null)";
				
				// Creating a statement
				
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(table);
				
				System.out.println("Table created sucessfully.");
				
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
