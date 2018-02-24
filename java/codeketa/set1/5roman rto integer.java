

import java.util.*;
import java.lang.*;

class Roman
{  
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       char[] a=new char[100];
      
       int i,b=0,sum=0;
       a=s.toCharArray();
        
        for(i=0;i<s.length();i++)
        { 
         
         
        if(a[i]=='I' && a[i+1]=='V')
        {
            b=4;
            break;
            
        }  
        
            if((a[i]=='I') && (a[i+1]=='X'))
        {
            b=9;
            
            break;
        } 
        else
        {
        switch(a[i])
            {
            case 'I':
                  b=1;
                  break;
            case 'V':
                  b=5;
                  break;
            case 'X':
                  b=10;
                  break;
             }
        }
           sum=sum+b;  
           
           }
         System.out.println(sum);
        }
        }
