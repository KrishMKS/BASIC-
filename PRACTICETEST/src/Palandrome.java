import java.util.*;

public class Palandrome 
{

	public static void main(String[] args) 
	{
	int n, rev=0,rem,temp;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter n value:");
	n=sc.nextInt();
	
	temp=n;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==temp)
	{
		System.out.println("PALANDROME");
	}
	else
	{
		System.out.println("NOTPALANDROME");
	}
	}

}
