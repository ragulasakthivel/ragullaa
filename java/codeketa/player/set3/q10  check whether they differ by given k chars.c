#include<stdio.h>
#include<string.h>
int main(void)
{
    int l1,l2,count=0,k,i;
    char str1[20],str2[20];
    scanf("%s %s %d",str1,str2,&k);
    l1=strlen(str1);
    l2=strlen(str2);
    if(l1==l2)
    {
        for(i=0;i<l1;i++)
        {
            if(str1[i]!=str2[i])
             count++;
        }
        if(count==k)
           printf("yes");
        else
           printf("no");
    }
    else
        printf("no");
}
