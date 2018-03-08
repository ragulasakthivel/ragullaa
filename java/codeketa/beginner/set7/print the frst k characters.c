#include<stdio.h>
int main(void)
{
   char str[1000];
   scanf("%s",str);
   int k;
   scanf("%d",&k);
   for(int i=0;i<k;i++)
       printf("%c",str[i]);
   return 0;
   
}
