package exercise7;
import java.sql.*;
import java.util.Scanner;

//Write a Java program  to insert a record with values taken from user into the table countries against each columns using prepared statement. 
//We can use a string array to store our own values.

public class Exercise7 {
	
	public static void main(String args[]) {
		
		String dbURL = "jdbc:mysql://localhost/practicedatabase";
		String username = "root";
		String password = "Pranav@123";
		
		try {
			// creating a connection.
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			
			PreparedStatement psmt = conn.prepareStatement("insert into countries(country_id,country_name,region_id,region_name)"
					+ "values(?,?,?,?)");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println("How many rows need to insert: ");
			int r  = sc.nextInt();
			for(int i = 0; i < r;i++) {
				
				System.out.println("Enter country id: ");
				int id = sc.nextInt();
				System.out.println("Enter country's name: ");
				String name = sc.next();
				System.out.println("Enter region id: ");
				int rID = sc.nextInt();
				System.out.println("Enter region's name: ");
				String rName = sc.next();
				
				psmt.setInt(1, id);
				psmt.setString(2, name);
				psmt.setInt(3, rID);
				psmt.setString(4, rName);
				psmt.executeUpdate();
			}
			System.out.println("Data gets inserted.");
			
			
			
			
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
