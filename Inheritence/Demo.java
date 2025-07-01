package ABC;
import java.util.*;

abstract class staff
{
	protected int id;
	protected String name;
	staff(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class officestaff extends staff
{
	String dept;
	
	officestaff(int id,String dept,String name)
	{
		super(id,name);
		this.dept=dept;
	}
	void display()
	{
		System.out.println("Staff id:"+id);
		System.out.println("Staff Name:"+name);
		System.out.println("Staff Department:"+dept);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		
		officestaff ob[]=new officestaff[n];
		
		for(int i=0;i<n;i++)
			
		{
			System.out.println("Enter Staff ID NAME DEPARTMENT:");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			ob[i]=new officestaff(id,name,dept);
		}
		for(int i=0;i<n;i++)
			ob[i].display();
	}
}
