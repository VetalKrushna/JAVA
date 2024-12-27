//Accept two matrix and display its Addition:
import java.util.*;
public class Matrix3 {
    public static void main(String[] args) {
       
	       Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of row and colmn:");
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int [n][m];
            int b[][]=new int [n][m];
            int c[][]=new int [n][m];
			System.out.println("Enter Ist matrix:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        a[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Enter IInd matrix:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        b[i][j]=sc.nextInt();
                    }
                }

                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        c[i][j]=a[i][j]+b[i][j];
                    }
                }

                System.out.println("Addition of matrix:");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        System.out.print(c[i][j]+" ");
                    }
                    System.out.println();
                }
    }
    
}
