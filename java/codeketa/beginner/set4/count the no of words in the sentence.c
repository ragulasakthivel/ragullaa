#include<stdio.h>
#include<string.h>
int main(void)
{   char str[2000];
    fgets(str,2000,stdin);
    int count =0,i,l;
    l=strlen(str);
    for(i=0;i<l;i++)
    {
        if(str[i]==' ')
        count++;
        
    }count+=1;
    printf("%d",count);
    return 0;
}
