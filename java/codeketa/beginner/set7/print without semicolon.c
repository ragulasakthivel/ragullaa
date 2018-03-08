#include<stdio.h>
int main(void)
{
    char str[1000];
    fgets(str,1000,stdin);
    if(printf(str))
    return 0;
}
