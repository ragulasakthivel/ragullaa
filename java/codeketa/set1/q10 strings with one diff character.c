#include<stdio.h>
#include<string.h>
int main(void)
{
  int count=0;
  char s1[10];
  char s2[10];
  scanf("%s %s",s1,s2);
  int l1=strlen(s1);
  int l2=strlen(s2);
  if(l1!=l2)
    printf("no");
  else
  {
      for(int i=0;i<l1;i++)
      {
      if(s1[i]!=s2[i])
            count++;
      } 
      if(count==1)
            printf("yes");
      else
            printf("no");
  }
  return 0;
}       
