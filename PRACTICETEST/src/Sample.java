
import java.util.*;
public class Sample{

public static void main(String []args){
int n,rem,temp,sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter n:");
		n=sc.nextInt();
		temp=n;
	while(n>0)
		{
		rem=n%10;
	         sum=sum+rem*rem*rem;
n=n/10;
}
if(sum==temp){
System.out.println("The given number is Armstrong");
}			
else{
System.out.println("The given number is not armstrong");
}
}
}