#include<stdio.h>
int main(void)
{
int n,a=1,b=1,c=0;
scanf("%d ",&n);
for(int i=0;i<n;i++)
{   
    a=b;
    b=c;
    c=a+b;
    printf("%d ",c);
}
return 0;
}
