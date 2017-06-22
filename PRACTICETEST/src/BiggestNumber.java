import java.util.*;

public class BiggestNumber 
{

	public static void main(String[] args)
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
				
		System.out.print("enter X value:");
		x=sc.nextInt();
		
		System.out.print("enter Y value:");
		y=sc.nextInt();

		System.out.print("enter Z value:");
		z=sc.nextInt();
		
		if(x>y && x>z)
		{
						
			System.out.println("bigger Number is :"+x);
		
		}
		
		else if(y>z && y>x)
			{
				System.out.println("Bigger Number is:"+y);
			}
			else
			{
				System.out.println("Bigger number is:"+z);
		}
	}
	}



