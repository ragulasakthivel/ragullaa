#include<stdio.h>
#include<string.h>
int main(void)
{   char str[00];
    fgets(str,100,stdin);
    int count =0,i,l;
    l=strlen(str);
    for(i=0;i<l;i++)
    {
        if(((str[i]>=33)&&(str[i]<=47))||((str[i]>=58)&&(str[i]<=64))||((str[i]>=91)&&(str[i]<=96))||((str[i]>=123)&&(str[i]<=126)))
        count++;
    }
    printf("%d",count);
    return 0;
}

