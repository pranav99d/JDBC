package resultSetMetaData;
import java.sql.*; 
class Rsmd{ 
public static void main(String args[]){ 
try{ 

Class.forName("com.mysql.cj.jdbc.Driver");  

Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PracticeDatabase","root","Pranav@123"); 


PreparedStatement ps=con.prepareStatement("select * from emp"); 
ResultSet rs=ps.executeQuery(); 
ResultSetMetaData rsmd=rs.getMetaData(); 
 
System.out.println("Total columns: "+rsmd.getColumnCount()); 
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1)); 
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
System.out.println("Table Name of 1st column: "+rsmd.getTableName(1));
 
con.close(); 
}catch(Exception e){ System.out.println(e);} 
} 
} 
