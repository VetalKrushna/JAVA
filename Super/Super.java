package Basic;

class A
{
   A(int a,int b)
  {
	  System.out.println("Addition1="+(a+b));
  }
}
class B extends A

{
	B(int a,int b)
	{
		super(a,b);
		System.out.println("Addition 2="+(a+b));
	}
}
public class Super
{
  public static void main(String[] args)
  {
	  B ob=new B(11,22);
  }	
}