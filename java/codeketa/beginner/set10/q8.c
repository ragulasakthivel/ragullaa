#include<stdio.h>
int main(void)
{
int n,i,flag=0;
scanf("%d",&n);
int a[n];
for(i=0;i<n;i++)
   scanf("%d",&a[i]);

for(i=0;i<n;i++)
{
    if(a[i]>=a[i+1])
     {
     flag=1;
     break;
     }
     
}if(flag==1)
  printf("%d",i+1);
return 0;
}
q8q8
