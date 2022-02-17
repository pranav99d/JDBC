package exercise3;
import java.sql.*;
// Write a JAVA program to update the records in BANK table using Statement.executeUpdate().

public class Update1 {
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		
		 String dbURL = "jdbc:mysql://localhost/practicedatabase";
		 String username = "root";
		 String password = "Pranav@123";
			
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		 String sql = "update bank set name = 'Vijay', accountBal = 30000 where bank_id = 1 ";
		 Statement statement = conn.createStatement();
		 statement.executeUpdate(sql);
		 System.out.println("Record get Updated");
	}

}
