#include<stdio.h>
#include<string.h>
int main(void)
{
    char str[100];
    scanf("%[^/n]s",str);
    int i,j,l;
    l=strlen(str);
    for(i=0;i<l;i++)
      {   
          if(str[i]==32)
             {  
                 for(j=i;j<=l;j++)
                   str[j]=str[j+1];
             }
       
      }
     printf("%s",str);
    return 0;
}
