import java.util.*;
import java.lang.*;
import java.io.*;

public class rightrotate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,rem,sum=0;
         while(n>0)
         {
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
            i++;
         }System.out.print(sum);
         
           
         
       
        
    }
}
