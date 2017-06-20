package snippet;
import java.sql.*;
import java.util.*;
public class jdbc2 
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("org.h2.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/DT21","user1","user1");
			
			PreparedStatement psmt=conn.prepareStatement("insert into Student values(?,?,?,?)");
			
			int studid,marks;
			String studname,addr;
			
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the Student ID:");
			studid=scan.nextInt();
			
			System.out.println("Enter the Student Marks:");
			marks=scan.nextInt();
			
			System.out.println("Enter the Student Name:");
			studname=scan.next();
			
			System.out.println("Enter the Student Address");
			addr=scan.next();
			
			psmt.setInt(1,studid);
			psmt.setString(2, studname);
			psmt.setString(3,addr);
			psmt.setInt(4, marks);
			
			int row_eff=psmt.executeUpdate();
			
			if(row_eff>0)
				System.out.println("Row Inserted");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		
	}
}


