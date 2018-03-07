#include<stdio.h>

int main()
{ 
    int i,j,k,len,res;
    scanf("%d %d",&j,&k);
    if(j>k) 
       len=j;
    if(k>j) 
       len=k;
    for(i=1;i<=len;i++)
       {
           if((j%i==0)&&(k%i==0))
              res=i;
       }
     printf("%d",res);
     return 0;
}
