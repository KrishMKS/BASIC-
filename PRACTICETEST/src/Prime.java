import java.util.*;
public class Prime 
{

	public static void main(String[] args) 
	{
		int n,i,j,count=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter n:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			 
			if(n%i==0)
			{
				 count++;
			}
		}
	
		if( count==2)
		{
			
				System.out.println("prime Number");
		}	
		else
		{

	System.out.println("not prime number");
	}}

}
