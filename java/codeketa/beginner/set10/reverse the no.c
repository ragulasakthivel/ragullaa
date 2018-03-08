#include<stdio.h>
int main(void)
{
int n,r;
scanf("%d",&n);
while(n!=0)
{
    printf("%d",r=n%10);
    n=n/10;
}
return 0;
}

