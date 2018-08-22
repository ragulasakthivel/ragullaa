/* input1 =   total no of steps in a hill.........5
   input2 =   weight of  the first step...........10
   input3 =   value incremented for each step.....2
   
   weight=10+(12+12)+(14+14+14)+(16+16+16+16)+(18+18+18+18+18)
   
*/

import java.util.*;
import java.lang.*;
public class MyClass {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int sum=input2,z=input3;
        
        for(int i=2;i<=input1;i++)
        {
            sum=sum+(input2+z)*i;
            z=z+input3;
        }
        
      

        System.out.println(sum);
    }
}
