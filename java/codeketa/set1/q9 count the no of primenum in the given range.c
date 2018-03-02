#include<stdio.h>
int main(void)
{
    int l,r,i,j,count=0,flag=0;
    scanf("%d %d",&l,&r);
    for(i=l;i<=r;i++)
    {
    
       for(j=1;j<=i;j++)
       {
           if(i%j==0)
            count++;
       }
       if(count==2)
       {
           flag++;
       }
       count=0;
    }
    printf("%d",flag);
return 0;
}
