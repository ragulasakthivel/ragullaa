#include<stdio.h>
int main(void)
{
    int m,n,sum=0;
    scanf("%d %d",&m,&n);
    sum=m+n;
    if(sum%2==0)
      printf("even");
     else
      printf("odd");
    return 0;
}
