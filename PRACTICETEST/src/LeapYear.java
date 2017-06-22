import java.util.*;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		int i,result;
		Scanner sc=new Scanner(System.in);
	
		System.out.print("enter year:");
		i=sc.nextInt();
		
		result=i%4;
		
		if(result==0)
		{
			System.out.println("leap year");
		
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	
	}
	

}
