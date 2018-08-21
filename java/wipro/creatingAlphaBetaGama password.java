/*
  to generate 4 digit password
  from 3 inputs ranging between 100 and 999
  with the least of ones,tens,hundreds and
  greatest of thousands place of the three inputs
*/

import java.util.*;
import java.io.*;
public class Sum
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int input1=sc.nextInt();
    int input2=sc.nextInt();
    int input3=sc.nextInt();
    int S[]={input1,input2,input3};
    Integer maxi[]=new Integer[9];
    Integer ones[]=new Integer[3];
    Integer tens[]=new Integer[3];
    Integer huns[]=new Integer[3];
    int k=0; 
   
    String Str="";
    
    for(int j=0;j<3;j++)
    {
        for(int i=0;i<3;i++)
        {
            
         if(S[i]>=100)
           {
           ones[i]=S[i]%10;
           maxi[k]=ones[i];
           S[i]=S[i]/10;
           } 
          else if(S[i]>=10)
           {
           tens[i]=S[i]%10;
           maxi[k]=tens[i];
           S[i]=S[i]/10;
           } 
          else
           {
           huns[i]=S[i]%10;
           maxi[k]=huns[i];
           S[i]=S[i]/10;
           } 
           k++;
        }
    }
   
      int d = Collections.min(Arrays.asList(ones));
      int c = Collections.min(Arrays.asList(tens));
      int b = Collections.min(Arrays.asList(huns));
      int a = Collections.max(Arrays.asList(maxi));
      
       int result[]={a,b,c,d};
     
     for( int l=0;l<4;l++)
       { 
        Str=Str+result[l];
       }
     int res= Integer.parseInt(Str);
     System.out.print(res);
     
}
}
