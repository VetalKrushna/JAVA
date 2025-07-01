package Exception;

public class E1 {
	public static void main(String[] args) {
		int a1=0,c=0;
		try 
		{
			int a=10,b=5;
			a1=a+b;
			c=a/0;
			
		}
		
		finally
		{
			System.out.println("Addition:"+a1);
			System.out.println("Division :"+c);
		}
	}
}
