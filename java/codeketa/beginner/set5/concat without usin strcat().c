#include <stdio.h>
#include<string.h>

int main(void) 
{
char str1[1000],str2[1000];
int i,j,l1,l2;
scanf("%s %s",str1,str2);
l1=strlen(str1);
l2=strlen(str2);
j=0;
for(i=l1;i<(l1+l2);i++)
{           str1[i]=str2[j];
	j+=1;
}str1[l1+l2]='\0';
printf("%s",str1);
return 0;
}

