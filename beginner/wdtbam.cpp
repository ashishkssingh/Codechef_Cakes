    #include <stdio.h>
    int maxval(int y);
    unsigned long long int price[1000];
     
    int main()
    {
    	int test;
    	int n,right,i,max;
    	char str1[1000] ,str2 [1000]; 
    	scanf ("%d" ,&test);
    	while (test--)
    	{
    		right=0;
    		max=0;
    		scanf ("%d" ,&n);
    		
    		scanf ("%s" ,str1);
    		scanf ("%s" ,str2);
     
    		for (i=0;i<n;i++)
    		{
    			if (str2[i] == str1[i])
    				right++;
    		}
    		for (i=0;i<n+1;i++)
    		{
    			scanf ("%llu" ,&price[i]);
    		}
    		if (right == n)
    				printf ("%llu\n" ,price[right]);
    		else
    			printf ("%llu\n" ,price[maxval(right)]);
    	}
    	return 0;
    }
     
     
    int maxval(int y)
    {
    	int i ,max=0;
    	for (i=0;i<=y;i++)
    	{
    		if (price[i] > price[max])
    			max=i;
    	}
    	return (max);
    } 