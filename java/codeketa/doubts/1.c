#include<stdio.h>
#include<string.h>

int main()
{ 
 
 int i,n,j;
 scanf("%d",&n);
 char str[100][100];
 int sum[100];
 for(i=0;i<n;i++)
    {
        getchar();
        scanf("%[^/n]s",str[i]);
    }
for(i=0;i<n;i++)
{
 for(j=0;j<strlen(str[i]);j++) 
 {
     sum[i]=sum[i]+(int)str[j];
 }
}
for(i=0;i<n;i++)
   printf("%d\t",**(sum[i]));


 return 0;
} 
