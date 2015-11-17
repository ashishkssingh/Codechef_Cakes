import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class spalnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test--!=0){
                int low = sc.nextInt();
                int high = sc.nextInt();
                int sum=0;
                for(int i=low;i<=high;i++){
                    int n=i;
                    int rev=0;
                    while(n!=0){
                    int rem = n%10;
                    n=n/10;
                    rev = rev*10+rem;
                    }
                    if(i==rev)
                        sum+=rev;
                }
                System.out.println(sum);
            }
            sc.close();
    }  
} 