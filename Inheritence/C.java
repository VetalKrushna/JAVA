package ABC;
import java.util.*;

class continent 
{
	Scanner sc=new Scanner(System.in);
	String cnname;
	void acceptco()
	{
		System.out.println("Enter Continent name:");
		cnname=sc.next();
	}
}
class country extends continent
{

	String cname,sname,place;
	void acceptc()
	{
		System.out.println("Enter Country Name:");
		cname=sc.next();
	
	}
}

class state extends country
{
	String sname,place;
	void accepts()
	{
		System.out.println("Enter State and Place name:");
		sname=sc.next();
		place=sc.next();
	}
	void display()
	{
		System.out.println("Continent::"+cnname);
		System.out.println("Country ::"+cname);
		System.out.println("State ::"+sname);
		System.out.println("Place ::"+place);

	}
}
public class C {

	
	public static void main(String[] args) {
		 
		state s=new state();
		s.acceptco();
		s.acceptc();
		s.accepts();
		s.display();
	}
}
