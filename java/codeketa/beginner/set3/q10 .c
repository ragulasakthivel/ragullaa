#include <stdio.h>

int main(void) 
{
	int t1,t2,min1,min2,T,min;
	scanf("%d %d",&t1,&min1);
	scanf("%d %d",&t2,&min2);
	
	if((t1<=12)&&(min1<=59)&&(t2<=12)&&(min2<=59))
	{
             	            T=abs(t1-t2);
	            min=abs(min1-min2);
		printf("%d %d",T,min);
	}
	else 
		printf("invalid time");
	return 0;
}

