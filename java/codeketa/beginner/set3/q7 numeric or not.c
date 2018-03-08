#include<stdio.h>
#include<string.h>

int main(void)
{ 
char str[100];
scanf("%s",str);
int flag=0,i=0,l;
l=strlen(str);
while(i<l)	
{
if((str[i]>='0')&&(str[i]<='9'))
{
	i++;
	flag=1;
}
else 
    break;
}
if(flag==1)
printf("the given string is numeric");
else 
printf("the given string is not numeric");
return 0;
}   
