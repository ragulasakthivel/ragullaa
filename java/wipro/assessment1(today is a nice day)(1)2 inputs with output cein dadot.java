import java.io.*;
import  java.util.*;

// Read only region start
public class UserMainCode
{

	public static void main (String[] args)
	{   String input1="today is a nice day";
	    int input2=41;
		// Read only region end
        String[] str=input1.split(" ");	
		String in=Integer.toString(input2);
		char arr[]=in.toCharArray();
		String S="";
		
		for(int k=0;k<2;k++)
		{
	    
		if(((str[(arr[k])-'0'-1].length())%2)==0)
		{
			char ch[]=str[(arr[k])-'0'-1].toCharArray();
			
		
		
		for(int j=ch.length/2;j<=ch.length-1;j++)
			{
			   S=S+ch[j];
			}
			for(int j=(ch.length/2)-1;j>=0;j--)
			{
				S=S+ch[j];
			}
			S=S+" ";
			
        }
	    else
		{
			if((str[(arr[k])-'0'-1].length()%2)!=0)
			{
			char ch[]=str[(arr[k])-'0'-1].toCharArray();
			for(int j=ch.length/2;j<ch.length-1;j++)
			{
			   S=S+ch[j];
			}
			for(int j=ch.length/2;j>=0;j--)
			{
				S=S+ch[j];
			}
			
			}
		}
			
		} System.out.print(S);

		
		
	}
}

