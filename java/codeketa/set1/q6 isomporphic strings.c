#include<stdio.h>
#include<string.h>
int map(char *a,char *b,int n)
{
    char res[26]={0};
    int i=0;
    while(i!=n)
    {
        if(res[(a[i]-96)-1]==0)
        {
            res[(a[i]-96)-1]=b[i];
            i++;
        }
        else
        {
            if(res[(a[i]-96)-1]==b[i])
              i++;
            else
              {
                  printf("no");
                  return;
              }
        }
    }
    printf("yes");
   
}
int main(void)
{
 char a[10];
 char b[10];
 scanf("%s",a);
 scanf("%s",b);
 int n=strlen(a);
 int m=strlen(b);
 if(m!=n)
   printf("no");
 else 
   map(a,b,n);
}
