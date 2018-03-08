   #include<stdio.h>
int main(void)
{
 long int n;
 int r[50],i=0,p=1;
 scanf("%ld",&n);
 while(n!=0)
 {
    r[i]=n%10;
    n=n/10;
    i++;
 }
 for(i=0;r[i]!='\0';i++)
     {
       p=p*r[i];
     }
printf("%d",p);
return 0;
}

