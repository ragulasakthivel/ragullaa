import java.util.Scanner;
public class Cubesquare
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sqr=n*n;
       int cube=n*n*n;
       int rev1=0,rev2=0;
       while(sqr!=0)
       {
         int rem=sqr%10;
         rev1=rev1*10+rem;
         sqr=sqr/10;
         
       }
        while(cube!=0)
       {
         int rem=cube%10;
         rev2=rev2*10+rem;
         cube=cube/10;
         
       }
       System.out.print(rev2);
       System.out.print(rev1);
       
    
    }
       
      
}


/*
input 3
output 729
input 6
output 61263
*/
