#include<stdio.h>
#include<string.h>
int main(void)
{   char str[2000];
    fgets(str,2000,stdin);
    int count =0,i,l;
    l=strlen(str);
    for(i=0;i<l;i++)
    {
        if(str[i]==32)
        count++;
     }
    printf("%d",count);
    return 0;
}	

