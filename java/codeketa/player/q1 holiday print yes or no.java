import java.io.*;
import java.util.*;
import java.lang.*;
public class Holiday
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        String S=sc.nextLine();
        String day1="sunday";
        String day2="saturday";
        if(S.equalsIgnoreCase(day1))
          System.out.println("yes");
        else if(S.equalsIgnoreCase(day2))
          System.out.println("yes");
        else 
          System.out.println("no");
    }
}
