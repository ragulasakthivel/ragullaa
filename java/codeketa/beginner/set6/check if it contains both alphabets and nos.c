#include<stdio.h>
#include<string.h>
int main(void)
{
    char str[1000];
    scanf("%s",str);
    int l,i=0,flag1=0,flag2=0;
    l=strlen(str);
    while(str[i]!='\0')
    {
        
if(((str[i]>='a')&&(str[i]<='z'))||((str[i]>='A')&&(str[i]<='Z')))
    {
       flag1=1;
    }
if((str[i]>='0')&&(str[i]<='9'))
     {
         flag2=1;
         
     }
    i++;
    }
    if((flag1==1)&&(flag2==1))
         printf("yes");
    else
         printf("no");
         
return 0;
}
