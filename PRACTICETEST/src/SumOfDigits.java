import java.util.*;

public class SumOfDigits 
{

	public static void main(String[] args) 
	{
	int i, n,sum=0,rem;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter n alue:");
	n=sc.nextInt();
	
	while(n>0)
	{	
	rem=n%10;
	sum=sum+rem;
	n=n/10;
		}
	System.out.println(sum);

	}

}
