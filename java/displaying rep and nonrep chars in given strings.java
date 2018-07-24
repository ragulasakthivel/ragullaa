/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author guest-5cl5gy
 */
public class JavaApplication1 {

    
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);   
    String s1=sc.next();
    String s2=sc.next();
    int ip3=sc.nextInt();
    int ip4=sc.nextInt();
    int flag=0;
    char ch1[]=s1.toCharArray();
    char ch2[]=s2.toCharArray();
    String R="";
    String NR="";
    for(int i=0;i<s1.length();i++)
    {
        for(int j=0;j<s2.length();j++)
        {
            if(ch1[i]==ch2[j])
            {
              flag++;
            }
        }
        if(flag!=0)
           R=R+ch1[i];
        if(flag==0)
            NR=NR+ch1[i];
        flag=0;
    }
    for(int i=0;i<s2.length();i++)
    {
        for(int j=0;j<s1.length();j++)
        {
            if(ch2[i]==ch1[j])
            {
              flag++;
            }
        }
        if(flag==0)
           NR=NR+ch2[i];
        else
           R=R+ch2[i];
        flag=0;
    }
    if(ip3==0)
    {
     if(ip4==0)
            System.out.println(NR.toUpperCase());
     else
            System.out.println(NR.toLowerCase());
    }
     else
    {
     if(ip4==0)
            System.out.println(R.toUpperCase());
     else
            System.out.println(R.toLowerCase());
    }
        
        
        
    
    }
    
}
