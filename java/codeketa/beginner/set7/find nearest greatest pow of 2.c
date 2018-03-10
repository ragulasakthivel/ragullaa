#include<stdio.h>

int main()
{
   int i,k,n,rem=0,q=0;
   scanf("%d",&n);
   for(k=n+1;;k++)
   {
     i=k;
      if(i%2==0)
           {
               while(i!=1)
               {
                q=i/2;
                rem=i%2;
                i=i/2;
               if(q==1&&rem==0)
                 {
                  goto result;
                 }
               
               } 
           } 
   }result:
      printf("%d",k);
   return 0;
}
