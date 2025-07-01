package Files;
import java.io.*;
public class A1 {

	public static void main(String[] args) throws Exception
	{
		try
		{
		  FileReader f1=new FileReader("ABC.txt");
		  String k=" ";
		  BufferedReader br=new BufferedReader(f1);
		  while((k=br.readLine())!=null)
		  {
			System.out.println(k);  
		  }
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
