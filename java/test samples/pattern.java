public class Patternn
{
    public static void main(String args[])
    {
        int i,k,j;

       for( i=5;i>=1;i--)
       {
           for( j=i;j<=5;j++)
           {
               System.out.print(j + " ");
           }
           for( k=1;k<=i-1;k++)
           {  
               System.out.print(5 + " ");
           }
           System.out.println("\n");
       }
    }
}


/* output
5 5 5 5 5 

4 5 5 5 5 

3 4 5 5 5 

2 3 4 5 5 

1 2 3 4 5 

*/
