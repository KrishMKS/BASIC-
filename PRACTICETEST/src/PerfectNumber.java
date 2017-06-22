import java.util.*;
public class PerfectNumber 
{

	public static void main(String[] args)
	{
		int n,i, sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter n value");
		n=sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				
			}
		}
		
			if(sum==n)
			{
				System.out.println("PERFECT NUMBER");
			}
			else
			{
				System.out.println("NOT PERFECT NUMBER");
				
			}
		}
		

	

}
