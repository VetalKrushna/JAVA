//Accept mXn matrix and display upper diagonal ,lower diagonal and diagonal element
import java.util.Scanner;

public class Matrix2 {
    
	public static void main(String arg[])
	 {
			Scanner sc=new Scanner(System.in); System.out.println("Enter no of row and colmn:");
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
                System.out.println("Upper diagonal elements:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i<j)
                        System.out.print(a[i][j]+" ");
                    }
                  
                }
                System.out.println();
                System.out.println("Lower diagonal elements:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i>j)
                        System.out.print(a[i][j]+" ");
                    }
                  
                }
                System.out.println();
                System.out.println("Diagonal elements:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        if(i==j)
                        System.out.print(a[i][j]+" ");
                    }
                  
                }
	  }
    
}
