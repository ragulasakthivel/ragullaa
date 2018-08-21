import java.util.*;
import java.io.*;
public class Sum
{
public static void main(String args[])
{
    int n=256;
    int count[]=new int[n];
    Scanner sc=new Scanner(System.in);
    String S=sc.next();
    for(int i=0;i<S.length();i++)
    {
        count[(int)S.charAt(i)]++;
    }
    int odd=0;
    for(int i=0;i<n;i++)
    {
        if((count[i]&1)==1)
          odd++;
    
    }
     if(odd>1)
        System.out.print("no");
      else
         System.out.print("yes");
    
}
}
