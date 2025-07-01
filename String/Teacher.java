package String;
import java.util.*;
public class Teacher{
    
    int tid,sal;
    String desg,name,sub;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Teacher Id Name Designation Salary Subhect:");
        tid=sc.nextInt();
        name=sc.next();
        desg=sc.next();
        sal=sc.nextInt();
        sub=sc.next();
    }
    void display()
    {
         System.out.println("Teacher Id :"+tid);
         System.out.println("Teacher Name :"+name);
         System.out.println("Teacher Designation :"+desg);
         System.out.println("Teacher Salary :"+sal);
         System.out.println("Teacher Subhect:"+sub);
    }

    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        Teacher ob[]=new Teacher[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Teacher();
            ob[i].accept();
        }
        for(int i=0;i<n;i++)
        {
            if(ob[i].sub.equals("Java"))
              ob[i].display() ;
        }
        
    }
}
