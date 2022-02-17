package exercise4;
import java.util.Properties;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PropertyFile {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("data.properties");
		
		p.setProperty("URL", "jdbc:mysql://localhost/practicedatabase");
		p.setProperty("username","root");
		p.setProperty("Password","Pranav@123");
		
		try {
			p.store(os, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Created Sucessfully");
	}

}
