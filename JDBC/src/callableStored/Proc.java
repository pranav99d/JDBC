package callableStored;
import java.sql.*; 
public class Proc { 
public static void main(String[] args) throws Exception{ 
 
Class.forName("com.mysql.cj.jdbc.Driver");  

Connection con=DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/PracticeDatabase","root","Pranav@123");      

CallableStatement stmt=con.prepareCall("{call insertR(?,?)}"); 
stmt.setInt(1,1011); 
stmt.setString(2,"Amit"); 
stmt.execute(); 
 
System.out.println("success"); 
} 
} 
