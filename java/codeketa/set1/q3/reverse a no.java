import java.util.*;
import java.lang.*;
import java.io.*;
public class reverseof
{  
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int rem=0,temp=0;
     while(n!=0)
     {
     
     rem=n%10;
     temp=temp*10+rem;
     n=n/10;
     }
     if(temp>1)
      System.out.print(temp);
    }
}
     
     
     
