#include<stdio.h>
 
int main()
{
    int n,i;
    float a;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%f",&a);
        if(a<1500)
            printf("%g\n",a+.1*a+.9*a);
         else
            printf("%g\n",a+500+.98*a);
    }
    return 0;
}