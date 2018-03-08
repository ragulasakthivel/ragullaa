#include<stdio.h>
int main(void)
{
    int n,i;
    scanf("%d",&n);
    if(n<=10000)
{
    for(i=n+1;;i++)
          {
             if(i%10==0) 
             break;
          }
    printf("%d",i);
 }
else
   return 0;
}
