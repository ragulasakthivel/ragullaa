#include <stdio.h>
#include<string.h>

int main(void)
{
char str[20];
scanf("%s",str);
for(int i=0;i<strlen(str);i++)
 str[i]=str[i]+3;
printf("%s",str);
}
