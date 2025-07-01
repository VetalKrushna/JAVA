package String;
class Con
{
	Con(String s1,String s2)
	{
		String s3=s1.concat(s2);
		System.out.println("Concatenated String:"+s3);
	}
}
class Comp
{
	Comp(String s1,String s2)
	{
		int n=s1.compareTo(s2);
		if(n==0)
			System.out.println("String are same..");
		else if(n<0)
			System.out.println("First String are greater..");
		else
			System.out.println("Second String are greater");
	}
}
public class Str {

	public static void main(String[] args) 
	{
		Con c1=new Con("ABC","XYZ");
		Comp c2=new Comp("XYZ","ABC");
	}
}
