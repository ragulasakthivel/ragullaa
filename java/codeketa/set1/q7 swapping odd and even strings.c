#include<stdio.h>
#include<string.h>
int main(void)
{
char str[10000000];
scanf("%s",str);
int l=strlen(str);
if(l%2==0)
{
	for(int i=0;i<l;i+=2)
	{
	      char temp=str[i];
	      str[i]=str[i+1];
	      str[i+1]=temp;
	}printf("%s",str);

}
return 0;

}
