import java.util.Scanner;
public class LcmHcf
{
    public static void main(String args[])
    {
        int a,b,t,x,y,gcd,lcm;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        a=x;
        b=y;
        while(b!=0)
        {
            t=b;
            b=a%b;
            a=t;
        }
        gcd=a;
        lcm=(x*y)/gcd;
        
        System.out.println(lcm);
        System.out.println(gcd);
        
    }
}
