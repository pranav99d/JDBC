package exercise1;
import java.sql.*;
import java.util.Scanner;

//Write a JAVA program to update the Bank table with column ("AccountNo","AccountBal") using resultset object.

public class Update {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

	 String dbURL = "jdbc:mysql://localhost/practicedatabase";
	 String username = "root";
	 String password = "Pranav@123";
		
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn = DriverManager.getConnection(dbURL, username, password);
	 Statement stmt = conn.createStatement();
			     

      @SuppressWarnings("resource")
      Scanner sc =new Scanner(System.in);
      
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
      stmt.executeUpdate("insert into bank values('"+id+"','"+Name+"','"+emailID+"','"+accountno+"',"+accountbal+")");
      
      System.out.println("Record Get Inserted");
      String selectSQL = "SELECT * FROM bank";
      stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
      ResultSet rs=stmt.executeQuery(selectSQL);
      rs.absolute(1);
      rs.updateInt(4, 12345);
      rs.updateInt(5,30000);
      rs.updateRow();
      System.out.println("RowUpdated");
      
      conn.close();
      
	} 
			
}
