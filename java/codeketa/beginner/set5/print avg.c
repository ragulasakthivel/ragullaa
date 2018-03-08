#include<stdio.h>
#include<math.h>
int main(void)
{
int n,i,sum=0,avg=0;
scanf("%d",&n);
int a[n];
for(i=0;i<n;i++)
 scanf("%d",&a[i]);
for(i=0;i<n;i++)
{
    sum=sum+a[i];
}
avg=round(sum/n);
printf("%d",avg);
return 0;
}
