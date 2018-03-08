#include<stdio.h>
int main(void)
{
	int a,b,c;
	scanf("%d",&a);
	if(a<=59)
		printf("0 %d",a);
	else
	{
		if(a%60==0)
		{
			b=a/60;
			printf("%d 00",b);
		}
		else
		{
			b=a%60;
			c=a-b;
			a=c/60;
			printf("%d %d",a,b);
		}
	}
return 0;
}
