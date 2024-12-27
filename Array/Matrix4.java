//Accept 2X2 matrix and display
import java.util.*;
public class Matrix4 {
	public static void main(String arg[])
	 {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of rows and cols:");
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[][]=new int [m][n];
			System.out.println("Enter mXn matrix:");
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        a[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Transpose of Matrix:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        System.out.print(a[j][i]+" ");
                    }
                    System.out.println();
                }
	  }
    
}

    

