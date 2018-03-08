#include<stdio.h>
#include<math.h>
int main(void)
{
	float p,n,r,sa,value;
	scanf("%f %f %f",&p,&n,&r);
    value=((p*n*r)/100);
    sa=floor(value);
    printf("%f",sa);
    return 0;
}
