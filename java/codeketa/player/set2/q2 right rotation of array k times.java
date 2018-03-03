import java.util.*;
import java.lang.*;


public class rightrotate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j;
        int k=sc.nextInt();
        int a[]=new int[100];
        int temp[]=new int[100];
        int i;
        for(i=0;i<n;i++)
          a[i]=sc.nextInt();
        for(i=0;i<k;i++)
        {
            for(j=0;j<n-1;j++)
            {
             temp[j+1]=a[j];   
            }
            temp[0]=a[n-1];
            for(j=0;j<n;j++)
               a[j]=temp[j];
        
        }for(i=0;i<n;i++)
           System.out.print(a[i] + " ");
    }
}
