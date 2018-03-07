#include<stdio.h>

int main()
{ 
    int i,k[3],j[3];
    for(i=0;i<3;i++)
    {
      scanf("%d %d",&k[i],&j[i]);  
    }
  for(i=0;i<3;i++)
  {
      if(k[i]==k[i+1]&&k[i+1]==k[i+2])
          printf("yes");
      else if(j[i]==j[i+1]&&j[i+1]==j[i+2])
          printf("yes");
      else 
          printf("no");
     break;     
  }
}
