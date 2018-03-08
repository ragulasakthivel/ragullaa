#include<stdio.h>
int main(void)
{
int n=10;
int a[n],i,max;
for(i=0;i<n;i++)
     scanf("%d ",&a[i]);
max=a[0];
for(i=1;i<n;i++)
{
    if(max<=a[i])
    max=a[i];
}
printf("%d",max);
return 0;
}
