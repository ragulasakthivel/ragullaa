import java.util.*;
import java.lang.*;
import java.io.*;
public class divisible
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int l=sc.nextInt();
       int r=sc.nextInt();
       int i;
       for(i=1;i!=0;i++)
       {
           if((i%l==0)&&(i%r==0))
           {
             System.out.print(i);
             break;
            
           }
       }
    }
}
