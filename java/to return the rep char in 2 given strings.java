public class MyClass
{
    public static void main(String args[])
    {   
       
        String str1="hi";
        char arr1[]=str1.toCharArray();
        String str2="bye";
        char arr2[]=str2.toCharArray();
        String res="";
        int count=0;
        
        for(int i=0;i<arr1.length;i++)
        {   
            for(int j=0;j<arr2.length;j++)
            {
            if(arr1[i]==arr2[j])
            {
                res=res+arr1[i];
                arr2[j]='*';
                count++;
                break;
            }
            }     
            
        }
        if(count!=0)
           System.out.print(res);
        else
          System.out.print("null");
    }
}
