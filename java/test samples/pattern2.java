public class Cubesquare
{
    public static void main(String args[])
    {
        int arr[]={3,9,1,7,4};
        for(int i=0;i<5;i++)
        {
          for(int j=i;j<5;j++)
          {
              System.out.print(arr[j] + " ");
          }
           System.out.println();
        }
    }
}

/*
3 9 1 7 4 
9 1 7 4 
1 7 4 
7 4 
4 
*/
