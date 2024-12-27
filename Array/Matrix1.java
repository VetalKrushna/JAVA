//Sum of all matrix element;
import java.util.Scanner;

public class Matrix1 {
    
	public static void main(String arg[])
	 {
			Scanner sc=new Scanner(System.in);
            int n,m;
            System.out.println("Enter no of row and colmn:");
            n=sc.nextInt();
            m=sc.nextInt();
            int a[][]=new int [n][m];
			System.out.println("Enter 2 X 2 matrix:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        a[i][j]=sc.nextInt();
                    }
                }
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                       sum=sum+a[i][j];
                    }
                   
                } System.out.println("Sum of all element::"+sum);
	  }
}
