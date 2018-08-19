import java.util.*;
 
 
public class BinaryToDecimal
{
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            if(n%2==0)
              System.out.print("2");
            else
            {
                for(int i=3;i<=n;i++)
                {
                    if(n%i==0)
                       System.out.print(i);
                    else 
                        System.out.print(n);
                 break;
                }
               
            }
            
            
        }    
            
            
}
