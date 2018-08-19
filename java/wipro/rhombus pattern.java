public class MyClass
{
    public static void main(String args[])
    {
        int n=10;
      for(int i=1;i<=n-1;i++)
      {
          for(int j=n-1;j>=i;j--)
          {
              System.out.print(" ");
          }
          for(int k=1;k<=i;k++)
          {
              System.out.print(k);
          }
          for(int l=i-1;l>=1;l--)
          {
              System.out.print(l); 
          }
          System.out.println();
      }
      
      for(int i=1;i<=n-1;i++)
         System.out.print(i);
      
      System.out.print("1");
      
      for(int i=n-1;i>=1;i--)
         System.out.print(i);
      
       System.out.println();
      
      for(int i=1;i<=n-1;i++)
      {
          int k;
          for(int j=1;j<=i;j++)
          {
              System.out.print(" ");
          } 
          for( k=1;k<=n-i;k++)
          {
              System.out.print(k);
          }
           for(int l=k-2;l>=1;l--)
          {
              System.out.print(l); 
          }
           System.out.println();
          
      }

        
    }
}

/*
         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
1234567891987654321
 12345678987654321
  123456787654321
   1234567654321
    12345654321
     123454321
      1234321
       12321
        121
         1
*/
