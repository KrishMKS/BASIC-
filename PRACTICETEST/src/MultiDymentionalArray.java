import java.util.*;
public class MultiDymentionalArray 
{

	public static void main(String[] args) 
	{
		int i,j;
		int mda[][]=new int[2][2];
		
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				mda[i][j]=i+j;
				System.out.print(mda[i][j]+"   ");
			}
			System.out.println();
		}

	}

}
