import java.util.*;
import java.lang.*;
import java.io.*;

public class stringreverse 
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
       String S=sc.nextLine();
       int l=S.length();
       char[] a=S.toCharArray();
       int[] b=new int[l];
      int i,j,count=0,max=0,temp;
      for(i=0;i<l;i++)
      {
          for(j=0;j<l;j++)
          {
              if(a[i]==a[j])
               count++;
          }
          b[i]=count;
         
          count=0;
      }
       max=b[0];
       for(i=0;i<l;i++)
       {
            
           if(max<=b[i])
           {
           max=b[i];
          
          }
        
       }
       
       for(i=0;i<l;i++)
       {
          if(b[i]==max)
          {
           System.out.print(a[i]); 
           break;
          }
       }
      
    }
}
