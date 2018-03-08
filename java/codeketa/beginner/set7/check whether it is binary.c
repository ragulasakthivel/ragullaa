#include<stdio.h>
#include<string.h>
int main(void)
{
   char str[1000];
   scanf("%s",str);
   int l,i=0,flag=0;
   l=strlen(str);
   while(i<l)
   {
       if(str[i]=='0'||str[i]=='1')
         {  
             i++;
         }
       else
          break;
      }
   if(i==l)
     printf("yes");
   else
     printf("no");
   return 0;
  }

