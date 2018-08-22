//output must return a single digit value which is occuring frequently in all elements
import java.io.*;
import java.lang.*;
import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {   
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int input4=sc.nextInt();
        int num[]={input1,input2,input3,input4};
		int arr[]=new int[10];
		Arrays.fill(arr,0);
		String S="";
		for(int i=0;i<4;i++)
		{
	      S=S+Integer.toString(num[i]);
		}
	    for(int i=0;i<S.length();i++)
		{
			arr[(int)S.charAt(i)-'0']++;
		}
        int max;
		max=arr[0];
		int index = 0;for (int i = 0; i < arr.length; i++) 
		{
			if (max <= arr[i]) 
			{
				max = arr[i];
				index = i;
			}
		}
	//	return index;
		
	
	    System.out.print(index);
    }
}
