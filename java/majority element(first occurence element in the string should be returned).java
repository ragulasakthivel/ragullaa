import java.util.*;
import java.lang.*;
import java.io.*;
public class MajorityElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        S=S.toLowerCase();
        int count=0;
        char ch[]=S.toCharArray();
        int alpha[]=new int[26];
        Arrays.fill(alpha,0);
        for(int i=0;i<S.length()-1;i++){
            for(int j=0;j<S.length();j++){
                if(ch[i]>='a'&&ch[i]<='z'){
                if(ch[i]==ch[j])
                    alpha[ch[i]-96]++;
            }
        }
        }
        Integer[] newArray = new Integer[alpha.length];
        int k = 0;
        for (int value : alpha)
        {
        newArray[k++] = Integer.valueOf(value);
        }
        
        int max = Collections.max(Arrays.asList(newArray)); 
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<alpha.length;i++)
            {
                   if(max==alpha[i])
                   al.add(i);
            } 
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<al.size();j++)
            {
            if(ch[i]-96==al.get(j))
            {
               System.out.print(ch[i]);
               count++;
               break;
            }
            }
            if(count!=0)
               break;
        }
        
        }
        }
