import java.io.*;
import java.util.*;
import java.lang.*;


public class Sumofstrings
{

	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   
	   String input1=sc.nextLine();
	   String input2=sc.nextLine();
	    String sum="";
		int carry=0,len=0;
		int len1=input1.length();
		int len2=input2.length();
		len=len1-len2;
		if(len<0)
				len=len*(-1);
	     if(len1==len2)
	    {
	        for(int i=input1.length()-1;i>=0;i--)
		    {  
		       int digit=(int)(input1.charAt(i))-'0'+(int)(input2.charAt(i))-'0'+carry;
		       int temp=digit;
			   digit=temp%10;
			   carry=temp/10;
			   sum=digit+sum;
		    }
		    if(carry>0)
		    sum=carry+sum;
	    }
	    else
	    {  
         String small=len1<len2?input1:input2;
         String large=len1>len2?input1:input2;
            for(int i=0;i<len;i++) 
                small="0"+small;
            for(int i=small.length()-1;i>=0;i--)
		    {  
		       int digit=(int)(large.charAt(i))-'0'+(int)(small.charAt(i))-'0'+carry;
		       int temp=digit;
			   digit=temp%10;
			   carry=temp/10;
		       sum=digit+sum;
		    }
		    if(carry>0)
		    sum=carry+sum;
		 }
				
		
	System.out.println(sum);
		
		
	}
}
