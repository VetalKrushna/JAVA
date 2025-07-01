package Files;
import java.io.*;
public class F2 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream f1=new FileInputStream("ABC.txt");
			int k;
			while((k=f1.read())!=-1)
			{
				System.out.printf("%c",k);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
