#include<stdio.h>
#include<string.h>
int main(void)
{    
    int i,j;
    char str[100];
    fgets(str,100,stdin);
    for(i=0;i<strlen(str);i++)
    {
        if(str[i]==' ')
        {
           if(str[i+1]==' ')
           {
               str[i--];
               for(j=i;j<strlen(str);j++)
                  str[j+1]=str[j+2];
           }
           
        }
    }printf("%s",str);
}
