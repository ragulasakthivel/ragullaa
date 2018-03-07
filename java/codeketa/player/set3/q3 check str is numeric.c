#include<stdio.h>
#include<string.h>

int main()
{ 
 
 int i,flag=0;
 char str[20];
 scanf("%s",str);
 for(i=0;i<strlen(str);i++)
    {
        if(((str[i]>='0')&&(str[i]<='9'))||(str[i]=='.'))
        {
        flag=1;
        }
        else 
        {
        flag=0;
        printf("no");
        break;
        }
    }
 if(flag==1)
       printf("yes");
       
return 0;
}
       
