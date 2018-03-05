#include<stdio.h>
#include<string.h>
int main()
{
int n,i,j,l1,l2,flag,count=0,k;
char temp[50];
scanf("%d",&n);
char str1[]="kabali";
l1=strlen(str1);
char str2[10][20];
char res1[26]={0};

for(i=0;i<n;i++)
{
   getchar();
   scanf("%[^\n]s",str2[i]);
}
for(i=0;i<l1;i++)
{
    res1[(str1[i]-96)-1]=res1[(str1[i]-96)-1]+1;
}

for(i=0;i<n;i++)
{  
    strcpy(temp,str2[i]);
    char res2[26]={0};
    l2=strlen(temp);
    if(l1!=l2)
      flag=0;
    else
    {
       for(j=0;j<l1;j++)
       {
          res2[(temp[j]-96)-1]=res2[(temp[j]-96)-1]+1;
       }
       for(k=0;k<26;k++)
       {
           if(res1[k]==res2[k])
              flag=1;
           else 
           {
             flag=0;
            break;
           }
           
       }
    }
    if(flag==1)
       count++;
}printf("%d",count);

}
