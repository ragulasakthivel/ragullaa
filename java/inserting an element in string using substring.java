public class MyClass
{
    public static void main(String args[])
    {   
        int i=0;
        String str="hello";
        int no=3;
        char ch='a';
        String res="";
        res=str.substring(0,no-1);
        res=res+ch;
        res=res+str.substring(no-1,str.length());
        System.out.println(res);
    }
}
