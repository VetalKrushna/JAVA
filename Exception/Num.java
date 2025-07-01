/*Write a java program to accept a number from user ,if it is greater than 100 then throw user defined Exception "Number is out of range" Otherwise do the addition of digit of that number.*/

package Exception;
import java.util.*;
class InvalidNumberException extends RuntimeException
{
	public String toString()
	{
	 return "Number is out of Range";
	}
}

public class Num {
	
	public static void main(String[] args) 
	{	
	 Scanner sc=new Scanner(System.in);
	
	 try
	 {
		 System.out.println("Enter number:");
		 int n=sc.nextInt();
		 
		 if(n>100)
		 {
			 throw new InvalidNumberException();
		 }
		 else
		 {
			 int s=0;
			 while(n>0)
			 {
				 s=s+(n%10);
				 n=n/10;
			 }
			 System.out.println("Sum of Digit:"+s);
		 }
	 }
	 catch(Exception e)
	 {
		 System.out.println("Error:"+e);
	 }
	}

}
