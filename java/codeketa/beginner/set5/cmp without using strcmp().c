#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(void)
{
char str1[1000],str2[1000],lar[1000],a[1000],b[1000];
int sum1=0,sum2=0,l1,l2;
scanf("%s %s",str1,str2);
strcpy(a,str1);
strcpy(b,str2);
for(int i=0;i<strlen(str1);i++)
{
    str1[i]=(int)str1[i];
    sum1=sum1+str1[i];
}
for(int j=0;j<strlen(str2);j++)
{
    str2[j]=(int)str2[j];
    sum2=sum2+str2[j];
}
if(sum1>=sum2)
   printf("%s",a);
else
   printf("%s",b);
return 0;
}

