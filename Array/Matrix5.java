 //Accept mXn matrix and display sum of upper diagonal element,lower diagonal element and diagonal element
import java.util.Scanner;

public class Matrix5 {
    
	public static void main(String arg[])
	 {
			Scanner sc=new Scanner(System.in);
             System.out.println("Enter no of row and colmn:");
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int [n][m];
			System.out.println("Enter matrix:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        a[i][j]=sc.nextInt();
                    }
                }
                int s=0;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i<j)
                       s=s+a[i][j];
                    }
                  
                }
                System.out.println("Sum of Upper diagonal elements:"+s);

                System.out.println();
                s=0;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i>j)
                        s=s+a[i][j];
                    }
                  
                }
                System.out.println("Sum of Lower diagonal elements:"+s);

                
                System.out.println();
                s=0;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i==j)
                        s=s+a[i][j];
                    }
                  
                }
                System.out.println("Sum of Diagonal elements:"+s);
	  }
    
}
 