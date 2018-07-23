import java.util.Scanner;

public class MyClass {
    
    
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String S=sc.next();
       int l=S.length();
       char ch[]=new char[l];
       int arr[]=new int[l];
       int count=0,sum=0;
       ch=S.toCharArray();
       for(int i=0;i<l;i++)
       {
         arr[i]=(int)(ch[i]);  
       }
       for(int i=0;i<l;i++)
       {
           for(int j=1;j<=arr[i];j++)
           {
               if(arr[i]%j==0)
               count++;
           }
           if(count==2)
            sum=sum+arr[i];
            
       count=0;
      
       }
       if(sum!=0)
        System.out.println(sum);
       else
        System.out.println(ch[0]+":"+ch[l-1]);
    }
}
