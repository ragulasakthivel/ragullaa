#include<stdio.h>
#include<string.h>
int main(void)
{   int i;
    char str[100];
    scanf("%s",str);
    for(i=0;i<strlen(str);i++)
    {
        if(str[i]>='a'&&str[i]<='z')
              str[i]=(int)str[i]-32;
        else 
        {
            if(str[i]>='A'&&str[i]<='Z')
              str[i]=(int)str[i]+32;
        }
    }
    printf("%s",str);
}
