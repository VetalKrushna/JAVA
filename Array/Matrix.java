
//Accept 2X2 matrix and display
import java.util.*;
public class Matrix
{
	public static void main(String arg[])
	 {
			Scanner sc=new Scanner(System.in);
            int a[][]=new int [2][2];
			System.out.println("Enter 2 X 2 matrix:");
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        a[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Matrix:");
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                }
	  }
    
}
