package Exception;
import java.io.*;
public class E2 {
	
   public static void main(String[] args) 
	{
	
	   try
	   
	   {
	DataInputStream din=new DataInputStream(System.in);
	System.out.println("Enter String:");
	String s1=din.readLine();
	System.out.println("String::"+s1);
	}
	   catch(Exception e)
	   {
		   System.out.println("Error::"+e);
	   }
	}
}
