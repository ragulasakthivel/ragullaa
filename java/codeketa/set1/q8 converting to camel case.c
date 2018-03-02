#include<stdio.h>
#include<string.h>
int main(void)
{
char str[1000000];
fgets(str,1000000,stdin);
int l=strlen(str);
int i=0;
str[i]=str[i]-32;	
for(i=1;i<l;i++)
{
if(str[i]==32)
  str[i+1]=str[i+1]-32;
}
puts(str);


return 0;

}
