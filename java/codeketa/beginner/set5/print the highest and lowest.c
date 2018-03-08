#include<stdio.h>
int main(void)
{
int n,i;
scanf("%d",&n);
int a[n],lar,small;
for(i=0;i<n;i++)
 scanf("%d",&a[i]);
  small=a[0];
  for(i=1;i<n;i++)
      {
          if(small>=a[i])
          small=a[i];
      }
 printf("%d ",small);
 lar=a[0];
 for(i=1;i<n;i++)
      {
          if(lar<=a[i])
          lar=a[i];
      }
 printf("%d",lar);

return 0;
}

