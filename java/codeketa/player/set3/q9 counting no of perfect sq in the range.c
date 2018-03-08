#include<stdio.h>

int main(void)
{
    int i,j,l,r,temp,count=0,k;
    scanf("%d %d",&l,&r);
    for(i=l;i<=r;i++)
    {
        temp=i;
        j=i*i;
        for(k=l;k<=r;k++)
        { 
            if(k==j)
              count++;
        }
         
    }printf("%d",count);
}
