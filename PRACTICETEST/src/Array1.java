import java.util.Scanner;

public class Array1
{
	
		    public static void main(String[] args) 
	        {
	        int n,p,e;
	        
	        Scanner sc = new Scanner(System.in);
	        
	    	int a[]=new int[5];
	    	    	
	            
	        for(int i=0;i<5;i++)
	        {
	            a[i] =sc.nextInt();
	        }
	        
	        System.out.print("Enter the position:");
	        p=sc.nextInt();
	        
	        System.out.print("Enter the element:");
	        e = sc.nextInt();
	        
	        n=a[p-1];
	        a[p-1]=e;
	        
	             
	        
	        System.out.print("After inserting:");
	        for(int i=0; i<5;i++)
	        {
	            System.out.print(a[i]+" ");
	        }
	        
	    }
}
	