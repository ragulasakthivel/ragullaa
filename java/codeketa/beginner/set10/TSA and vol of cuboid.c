#include<stdio.h>
int main(void)
{
    int l,b,h;
    scanf("%d %d %d",&l,&h,&b);
    int sa,vol;
    sa=2*((l*b)+(b*h)+(h*l));
    vol=l*b*h;
    printf("%d %d",sa,vol);
    return 0;
}
