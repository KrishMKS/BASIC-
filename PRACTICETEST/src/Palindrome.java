import java.util.*;
 
class Palindrome
{
  
public static void main(String args[])
   {
      String temp, rev = "";
      Scanner sc= new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      temp = sc.nextLine();
 
      int length = temp.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev= rev + temp.charAt(i);
 
      if (temp.equals(rev))
         System.out.println("string is a palindrome.");
      else
         System.out.println("string is not a palindrome.");
 
   }
}	
