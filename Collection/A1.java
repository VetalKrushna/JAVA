package Map;
import java.util.*;

public class A1 
{
	public static void main(String[] args) 
	{
		Hashtable ht=new Hashtable();
		ht.put("Name","Om" );
		ht.put("Per","65.9" );
		ht.put("Std","TY" );
		ht.put("Rno","58" );
		System.out.println(ht);
		System.out.println("Value of Std:"+ht.get("Std"));
		System.out.println("Size:"+ht.size());
		
		Hashtable ht1=new Hashtable();
		ht1.put("Age","21" );
		ht1.put("Marks","450" );
		ht1.put("Div","A" );
		System.out.println(ht1);
		
		ht.putAll(ht1);
		System.out.println(ht);
		
		if(ht.contains("21"))
			System.out.println("value Found");
		else
			System.out.println("value Not Found");
		if(ht.containsKey("Std"))
			System.out.println("Key Found");
		else
			System.out.println("Key Not Found");
		if(ht.contains("21"))
			System.out.println("Value Found");
		else
			System.out.println("Value Not Found");
		
		ht.remove("Per");
		System.out.println(ht);
		ht.clear();
		System.out.println(ht);
		
	}
}
