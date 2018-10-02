import java.util.*;
public class LeastSurpasser
{
    public static void main(String args[])
    {
        int a[]={10,12,5,40,21,70,1,37,87,71};
        int c[]=a.clone();
        
    Integer[] newArray = new Integer[c.length];
    int k = 0;
    for (int value : c)
    {
    newArray[k++] = Integer.valueOf(value);
    }
        
        int max = Collections.max(Arrays.asList(newArray)); 
        int b[]=new int[10];
        int large=0;
        large=max;
        for(int i=0;i<a.length;i++)
        {
            
            for(int j=i+1;j<a.length;j++)
            {
               
                if(a[j]>a[i]&&a[j]<large)
                {
                    large=a[j];
                      b[i]=large;
                }
               
        
                
                
           }
           if(b[i]==0)
              b[i]=a[i];
           
                
            System.out.println(b[i]);    
            
            large=max;
        } 
    }
    
}
