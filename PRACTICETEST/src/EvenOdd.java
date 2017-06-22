import java.util.*;

public class EvenOdd 
{

	public static void main(String[] args)
	{
		
	int n,result;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter n value:");
	n=sc.nextInt();
	
	result=n%2;
	
	if(result==0)
	{
		System.out.println("Entered Number is Even Number");
	}
	else
	{
		System.out.println("Entered Number is odd Number");
	
		
	}
	
	
	

	}

}
