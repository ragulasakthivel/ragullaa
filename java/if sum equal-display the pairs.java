package summ;
import java.util.Scanner;
public class Summ
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        
        int arr[]=new int[s];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        for(int i=0;i<(arr.length)-1;i++)
        {
            for(int j=i+1;j<(arr.length);j++)
            {
                int num=arr[i]+arr[j];
                if(num==sum)
                    System.out.printf("(%d,%d)",arr[i],arr[j]);
            }
        }
        
    }
    
}
