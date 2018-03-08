#include<stdio.h>
#include<string.h>
int main(void)
{   char str[100];
    fgets(str,100,stdin);
    int count =0,i,l;
    l=strlen(str);
    for(i=0;i<l-1;i++)
    {
        if(str[i]!=' ')
        count++;
    }
    printf("%d",count);
    return 0;
}
