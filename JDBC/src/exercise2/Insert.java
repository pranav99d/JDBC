package exercise2;
import java.sql.*;
import java.util.Scanner;

//Write a JAVA program to insert 5 records in BANK table with column ("AccountNo","AccountBal")  using prepared statement.

public class Insert {
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		
		 String dbURL = "jdbc:mysql://localhost/practicedatabase";
		 String username = "root";
		 String password = "Pranav@123";
		 @SuppressWarnings("resource")
		 Scanner sc = new Scanner(System.in);
		 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		 PreparedStatement psmt = conn.prepareStatement("insert into bank(bank_id, name, email_id, accountNo, accountBal) values(?,?,?,?,?)");
		
		 for(int i = 0; i < 5; i++) {
			 
			 System.out.println("Enter bankid");
		      int id=sc.nextInt();
		      System.out.println("Enter Name");
		      String Name=sc.next();
		      System.out.println("Enter emailID");
		      String emailID=sc.next();
		      System.out.println("Enter accountno");
		      int accountno=sc.nextInt();
		      System.out.println("Enter accountbal");
		      int accountbal=sc.nextInt();
		      
		      psmt.setInt(1, id);
		      psmt.setString(2, Name);
		      psmt.setString(3, emailID);
		      psmt.setInt(4, accountno);
		      psmt.setInt(5, accountbal);
		      psmt.executeUpdate();
		 }
		 System.out.println("record added sucessfully");
			
			conn.close();
	}

}
