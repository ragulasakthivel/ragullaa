import java.util.*;
import java.lang.*;
import java.io.*;
public class arrayrepeat
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int i,j;
       int[] a=new int[n];
       for(i=0;i<n;i++)
         a[i]=sc.nextInt();
       int count[]=new int[n];
       for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
             if(a[i]==a[j])
              {
                  count[i]=count[i]+1;
              }
           }
       }
       for(i=0;i<n;i++)
         {
             if(count[i]==1)
             {
               System.out.print(a[i]);
               break; 
                 
             }
         }
         
         
    }
}
