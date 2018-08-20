import java.util.*;
import java.io.*;
public class Sum
{
public static void main(String args[])
{
int input1=84001,z;
z=digitSum(input1);
System.out.print(z);
}
 static int digitSum(int input1)
{
    int sum=0,input;
		input =input1;
		if(input1<0)
			input1=input1*(-1);
		String Str=Integer.toString(input1);
		char[] ch=Str.toCharArray();
		for(int i=0;i<Str.length();i++)
		{
			sum=sum+ch[i]-'0';
		}
		while(sum>9)
		{
		String Str1=Integer.toString(sum);
		sum=0;
		char[] ch1=Str1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			sum=sum+ch1[i]-'0';
		}
		}
		if(input<0)
			sum=sum*(-1);
		return sum;
	}
}
