#include<stdio.h>
#include<string.h>
int main(void)
{   char str[00];
    fgets(str,100,stdin);
    int count =0,i,l;
    l=strlen(str);
    for(i=0;i<l;i++)
    {
        if((str[i]=='.')||(str[i]=='?'))
        count++;
    }
    printf("%d",count);
    return 0;
}
