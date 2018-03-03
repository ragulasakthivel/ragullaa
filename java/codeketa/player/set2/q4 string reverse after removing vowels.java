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
       char[] b=new char[l];
      
       int j=0,i;
       for( i=0;i<l;i++)
       {  
          if(a[i]!='a'&&a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u'&&a[i]!='A'&&a[i]!='E'&&a[i]!='I'&&a[i]!='O'&&a[i]!='U')
          {
           b[j]=a[i];
           j++;
           
          }
       }
       for(i=j-1;i>=0;i--)
          System.out.print(b[i]);
          
      
       
        
    }
}
