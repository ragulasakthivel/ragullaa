#include<stdio.h>
#include<string.h>
int main(void)
{
char s1[50];
scanf("%s",s1);
int a,a1,i,l,flag=0;
l=strlen(s1);
for(i=0;i<l;i++)
{
if(s1[i]=='.')
{
flag=1;
break;
}
}
if(flag==1)
printf("error");
else
{
a=atoi(s1);
while(a!=0)
{
    printf("%d",a%2);
     a1=a/2;
    a=a1;
}
}
return 0;
}
