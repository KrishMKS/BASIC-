package snippet;
import java.sql.*;
import java.util.*;

public class Jdbc1 
{
public static void main(String args[])
{
	try
	{
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1531:xe", "System","system");
	
	//PreparedStatement psmt=con.prepareStatement("insert into student values(100, 'Krish', 'DT' 6000");
   PreparedStatement psmt=con.prepareStatement("insert into Student values(?,?,?,?)");
			
	int sID,fee;
	String Sname,course;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter student ID");
	sID=sc.nextInt();
	
	System.out.println("enter student Name");
	Sname=sc.next();
	
	System.out.println("enter Course");
	course=sc.next();
	
	System.out.println("enter fee");
	fee=sc.nextInt();
	
	
	
	psmt.setInt(1,sID);
	psmt.setString(2, Sname);
	psmt.setString(3,course);
	psmt.setInt(4, fee);
	
	}		
catch(Exception e)
	{
	System.out.println("Error:"+e);
	}
}
}
