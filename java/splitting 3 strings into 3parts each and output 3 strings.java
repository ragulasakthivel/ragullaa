//package splitting;

import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author skcet
 */
public class Splitting 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String S[]=new String[n];
      sc.nextLine();
      String s1="";
      String s2="";
      String s3="";
      for(int m=0;m<n;m++)
      {
          S[m]=sc.nextLine();
      }
      
      for(int m=0;m<n;m++)
      {
      char ch[]=S[m].toCharArray();
      int l=S[m].length();
      if(l%3==0)
      {
        int len;
        len=l/3;
        int count=0,k=0;
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<len;j++)
           {
               if(count==0)
                 s1=s1+ch[k]; 
               if(count==1)
                 s2=s2+ch[k];
               if(count==2)
                 s3=s3+ch[k];
               k++;
           }
           count++;
        }
        
      }
      else if(l%2!=0)
      {
          int mid=l/2;
          s2=s2+ch[mid];
          String S1="";
          String S3="";
        
         for(int i=1;i<=mid;i++)
         {
              S1=ch[mid-i]+S1;
              S3=S3+ch[mid+i];
         }
         s1=s1.concat(S1);
         s3=s3.concat(S3);
         
      }
      else if(l%2==0)
      {
          String S1="";
          String S3="";
          int i,j;
          for(i=0,j=(l-1);;i++,j--)
          {
              S1=ch[i]+S1;
              S3=S3+ch[j];
              if((j-i)==3)
                 break;
              
          }
           s1=s1.concat(S1);
           s3=s3.concat(S3);
           s2=s2+ch[++i]+ch[--j];
       
          
      }    
          
      }    
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
    }
    
}
/*INPUT:
3
John
Johny
Janarthan

OUTPUT:
JJoJan
ohhart
nnyhan*/

