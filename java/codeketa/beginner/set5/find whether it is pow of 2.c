#include<stdio.h>
int main(void)
{
    int num=0,flag=0,p,n=0;
    scanf("%d",&p);
    while(num<p)
    {
        num=2<<n;
        n++;
        if(num==p)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
        printf("yes");
    else
        printf("no");
return 0;
 }
