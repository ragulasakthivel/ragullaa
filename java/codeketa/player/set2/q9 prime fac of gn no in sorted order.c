#include <stdio.h>
int main(void)
{
int j,i,count=0,n;
scanf("%d",&n);
for(i=2;i<=n;i++)
{    
    
    for(j=1;j<=i;j++)
    {
        if((i%j==0)&&(n%i==0))
          count++;
    }
    if(count==2)
      printf("%d ",i);
      
    count=0;
}

}
