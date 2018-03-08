#include <stdio.h>
int main(void) 
{
    int n,i=0,r[100];
    scanf("%d",&n);
    while(n!=0)
    {
    	r[i]=n%10;
    	n=n/10;
    	i++;
    }
    i=i-1;
    while(i>=0)
    {
    	printf("%d ",r[i]);
    	i--;
    }
	return 0;
}

