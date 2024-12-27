
import java.util.*;
public class Matrix6 {
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

                int ch;
                do{

                System.out.println("1-Addition\n2-Multiplication\n3-Transpose\n4-Exit\nEnter choice::");
                ch=sc.nextInt();

                switch(ch)
                {
                    case 1: for(int i=0;i<n;i++)
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
                              break;
                    case 2: 
                             for(int i=0;i<n;i++)
                               {
                                for(int j=0;j<m;j++)
                                 {
                                    c[i][j]=0;
                                   for(int k=0;k<n;k++)
                                   {
                                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                                   } 
                                 }
                                }
                                System.out.println("Multiplication of Matrix:");
                                for(int i=0;i<n;i++)
                                {
                                   for(int j=0;j<m;j++)
                                     {
                                        System.out.print(c[i][j]+" ");
                                     }
                                     System.out.println();
                                }
                         break;          
                     case 3: System.out.println("Transpose of Ist Matrix:");
                          for(int i=0;i<n;i++)
                             {
                                for(int j=0;j<m;j++)
                                  {
                                     System.out.print(a[j][i]+" ");
                                  }
                                  System.out.println();
                             } 
                             System.out.println("Transpose of IInd Matrix:");
                             for(int i=0;i<n;i++)
                                {
                                   for(int j=0;j<m;j++)
                                     {
                                        System.out.print(b[j][i]+" ");
                                     }
                                     System.out.println();
                                }
                        break;
                 } 
            }while(ch!=4);
        }     

}
