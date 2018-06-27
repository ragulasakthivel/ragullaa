package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void pangram(String S){
        S=S.toLowerCase();
      char ch[]=S.toCharArray();
      int len=S.length();
      int j=97,i;
      int count;
      int flag=0;
        while(j<=122)
      {
          
          
          count=0;
          for(int k=0;k<len;k++)
          {
              if(j==(int)ch[k])
              {
                  count++;
              }
          }
          if(count!=0)
          {
              flag++;
          }
           j++;
      }
      if(flag!=26)
        System.out.println("NO");
      else
            System.out.println("YES");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in=new Scanner(System.in);
        String S1=in.nextLine();
        pangram(S1);
        
    }
    
}


