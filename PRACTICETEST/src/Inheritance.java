
import java.util.*;
public class Inheritance
{
public static void main(String args[])
{
int n,rem,sum=0,k;
		
Scanner sc=new Scanner(System.in);
		
System.out.println("enter n:");
n=sc.nextInt();
k=n;
while(n>0)
{
rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
if(sum==k)
{
System.out.println(" Armstrong Number");
}			
else{
System.out.println("Not Armstrong Number");
}
}
}