import java.io.*;
import  java.util.*;

public class MString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     
        String input1=sc.next();
           int input2=sc.nextInt();
        int sum=0;
        String input=input1.toLowerCase();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)>='a'&&input.charAt(i)<='z')
            {
                if(input2==1)
                  sum=sum+((int)input.charAt(i)-96);
                else
                {
                    if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
                       sum=sum+0;
                    else
                       sum=sum+((int)input.charAt(i)-96);
                }
            }
        }
        System.out.print(sum);
		
	}
}
